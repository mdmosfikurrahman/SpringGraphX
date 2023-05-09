package com.epde.sgx.service;

import com.epde.sgx.entity.Book;

import java.util.List;

public interface BookService {
    Book create(Book book);
    List<Book> getAll();
    Book get(int bookId);
}
