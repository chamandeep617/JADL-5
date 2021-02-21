package com.example.jdbc.Controller;

import com.example.jdbc.Model.Book;
import com.example.jdbc.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/getAllBooks")
    public List<Book> getBooks() throws SQLException {
        return bookService.getBooks();
    }


    @PostMapping("/saveBook")
    public int saveBook(@RequestBody Book book) throws SQLException {
        return bookService.saveBook(book);
    }

    @GetMapping("/getBookWithId")
    public List<Book> getBookWithId(@RequestParam(value = "id") int id) throws SQLException {
        return bookService.getBookWithId(id);
    }

    @PostMapping("/createTable/{table_name}")
    public void createTable(@PathVariable String table_name) throws SQLException {
        bookService.createTable(table_name);
    }

}
