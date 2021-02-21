package com.example.jdbc.Repository;

import com.example.jdbc.Model.Book;

import java.sql.SQLException;
import java.util.List;

public interface BookRepository {
    public List<Book> getBooks() throws SQLException;

    public List<Book> getBookWithId(int id) throws SQLException;

    public void createTable(String tableName) throws SQLException;

    public int SaveBook(Book book) throws SQLException;
}
