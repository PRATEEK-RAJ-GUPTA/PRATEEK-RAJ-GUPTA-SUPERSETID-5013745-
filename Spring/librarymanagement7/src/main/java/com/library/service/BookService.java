package com.library.service;

import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepository BookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.BookRepository = bookRepository;
    }
    
    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.BookRepository = bookRepository;
    }

    public void performService() {
        System.out.println("Service is performing operations.");
    }
}
