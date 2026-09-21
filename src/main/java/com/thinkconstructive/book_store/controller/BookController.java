package com.thinkconstructive.book_store.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import com.thinkconstructive.book_store.dto.BookDto;
import com.thinkconstructive.book_store.service.BookService;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @GetMapping("/{bookId}")
    public ResponseEntity<BookDto> getBook(@PathVariable String bookId) {

        return new ResponseEntity<>(
                bookService.getBook(bookId),
                HttpStatus.OK
        );
    }

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/")
    public ResponseEntity<List<String>> getAllBooks() {

        List<String> books = new ArrayList<>();

        books.add("java");
        books.add("MongoDb");
        books.add("Spring Boot");

        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<String> createBook(@RequestBody String book) {

        return new ResponseEntity<>(
                "Book Created",
                HttpStatus.OK
        );
    }

    @PutMapping("/")
    public ResponseEntity<BookDto> updateBook(@RequestBody BookDto bookDto) {

        return new ResponseEntity<>(
                bookService.updateBookName(bookDto),
                HttpStatus.OK
        );
    }

    @DeleteMapping("/{bookId}")
    public ResponseEntity<String> deleteBook(
            @PathVariable String bookId) {

        return new ResponseEntity<>(
                "Book deleted successfully",
                HttpStatus.OK
        );
    }
}