package com.DevOps.deploy_ci_cd;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Book findBookById(UUID bookId) {
        return bookRepository.findById(bookId).orElse(null);
    }

    public Book createBook(BookRequest request) {
        Book book = new Book();
        book.setId(UUID.randomUUID());
        book.setTitle(request.getTitle());
        book.setAuthor(request.getAuthor());
        return bookRepository.save(book);
    }
}

