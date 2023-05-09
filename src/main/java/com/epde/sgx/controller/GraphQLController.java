package com.epde.sgx.controller;

import com.epde.sgx.entity.Book;
import com.epde.sgx.entity.BookInput;
import com.epde.sgx.service.BookService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class GraphQLController {

    private final BookService service;

    public GraphQLController(BookService service) {
        this.service = service;
    }

    @QueryMapping("allBooks")
    public List<Book> getAll() {
        return this.service.getAll();
    }

    @QueryMapping("getBook")
    public Book get(@Argument int bookId) {
        return this.service.get(bookId);
    }

    @MutationMapping("createBook")
    public Book create(@Argument BookInput bookInput) {

        Book book = new Book();

        book.setBookTitle(bookInput.getBookTitle());
        book.setBookDesc(bookInput.getBookDesc());
        book.setBookAuthor(bookInput.getBookAuthor());
        book.setBookPrice(bookInput.getBookPrice());
        book.setBookPages(bookInput.getBookPages());

        return this.service.create(book);
    }

}
