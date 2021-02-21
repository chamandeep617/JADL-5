package com.example.jdbc.Service;

import com.example.jdbc.Model.Book;
import com.example.jdbc.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public List<Book> getBooks() throws SQLException {
        return bookRepository.getBooks();
    }

    public int saveBook(Book book) throws SQLException {
        return bookRepository.SaveBook(book);
    }

    public List<Book> getBookWithId(int id) throws SQLException {
        return bookRepository.getBookWithId(id);
    }

    public void createTable(String table_name) throws SQLException {
        bookRepository.createTable(table_name);
    }
}
