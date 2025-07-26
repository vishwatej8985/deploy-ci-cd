package com.DevOps.deploy_ci_cd.Controller;


import com.DevOps.deploy_ci_cd.Book;
import com.DevOps.deploy_ci_cd.BookRequest;
import com.DevOps.deploy_ci_cd.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/")
    public List<Book> getAllBooks() {
        return bookService.findAll();
    }

    @GetMapping("/{bookId}")
    public Book getBookById(@PathVariable UUID bookId) {
        Book book = bookService.findBookById(bookId);
        if (book == null) {
            throw new ResourceNotFoundException("Book not found by " + bookId);
        }
        return book;
    }

    @PostMapping("/")
    public Book createBook(@RequestBody BookRequest request) {
        return bookService.createBook(request);
    }
}

