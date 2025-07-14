package com.OnetoOne.controller;

import com.OnetoOne.dto.BookDto;
import com.OnetoOne.repo.BookRepository;
import com.OnetoOne.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping
    public ResponseEntity<BookDto> create(@RequestBody BookDto bookDto){
        return ResponseEntity.ok(bookService.createBook(bookDto));
    }

    @GetMapping
    public List<BookDto> getAll(){
        return bookService.getAllBook();
    }
}
