package com.epde.sgx.controller;

import com.epde.sgx.entity.Book;
import com.epde.sgx.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }


    @GetMapping("/books/all")
    public List<Book> getAll() {
        return this.service.getAll();
    }

    @GetMapping("/books/{bookId}")
    public Book get(@PathVariable int bookId) {
        return this.service.get(bookId);
    }

    @PostMapping("/books/save")
    public Book create(@RequestBody Book book) {
        return this.service.create(book);
    }

}
