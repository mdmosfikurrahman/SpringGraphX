package com.epde.sgx.service;

import com.epde.sgx.entity.Book;
import com.epde.sgx.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    private final BookRepository repository;

    @Autowired
    public BookServiceImpl(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public Book create(Book book) {
        return this.repository.save(book);
    }

    @Override
    public List<Book> getAll() {
        return this.repository.findAll();
    }

    @Override
    public Book get(int bookId) {
        return this.repository.findById(bookId)
                .orElseThrow(() -> new RuntimeException("The book not found on Server!"));
    }
}
