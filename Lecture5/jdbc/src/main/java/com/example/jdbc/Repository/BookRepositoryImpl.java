package com.example.jdbc.Repository;

import com.example.jdbc.Model.Book;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepositoryImpl implements BookRepository{

    private Connection connection;
    private String tableName = "my_books";

    public void getConnection() throws SQLException {

        if(connection == null){
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/books","root","");
        }
    }

    public void closeConnection(){
        if(connection != null){
            connection = null;
        }
    }

    @Override
    public void createTable(String tableName) throws SQLException {
        getConnection();

        this.tableName = tableName;

        Statement statement = connection.createStatement();
        boolean isOpSucc = statement.execute("CREATE TABLE "+ tableName+" (id INT primary key, book_name VARCHAR(30), author_name VARCHAR(30),cost INT)");

        if(isOpSucc){
            System.out.println("Table "+ tableName +" has beed created successfully");
        }else{
            System.out.println("Table "+ tableName +" has beed not created");
        }

//        closeConnection();

    }

    @Override
    public List<Book> getBooks() throws SQLException {
        getConnection();

        ArrayList<Book> books = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * From "+tableName);

        while(resultSet.next()){

            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String authorName = resultSet.getString(3);
            int cost = resultSet.getInt(4);

            Book book = new Book(id,name,authorName,cost);

            books.add(book);
        }

//        closeConnection();
        return books;
    }


    @Override
    public List<Book> getBookWithId(int id) throws SQLException {
        getConnection();

        ArrayList<Book> books = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * From "+tableName + " WHERE id = "+id);

        while(resultSet.next()){

            int book_id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String authorName = resultSet.getString(3);
            int cost = resultSet.getInt(4);

            Book book = new Book(book_id,name,authorName,cost);

            books.add(book);
        }

//        closeConnection();
        return books;
    }



    @Override
    public int SaveBook(Book book) throws SQLException {

        getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO "+tableName+" VALUES (?,?,?,?)");

        preparedStatement.setInt(1,book.getId());
        preparedStatement.setString(2,book.getName());
        preparedStatement.setString(3,book.getAuthorName());
        preparedStatement.setInt(4,book.getCost());

        int rowN = preparedStatement.executeUpdate();

//        closeConnection();
        if(rowN < 1 ){
            System.out.println("Insertion of "+book.getName()+ " is not successful");
            return -1;
        }else{
            System.out.println("Insertion of"+book.getName()+" is successful");
            return book.getId();
        }
    }
}
