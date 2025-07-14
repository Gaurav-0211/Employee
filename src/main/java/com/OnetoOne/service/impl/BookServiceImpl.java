package com.OnetoOne.service.impl;

import com.OnetoOne.dto.BookDto;
import com.OnetoOne.model.Book;
import com.OnetoOne.repo.BookRepository;
import com.OnetoOne.service.BookService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;
    @Autowired
    ModelMapper mapper;

    @Override
    public BookDto createBook(BookDto bookDto) {
        Book book = mapper.map(bookDto, Book.class);
        Book savedBook = bookRepository.save(book);
        return mapper.map(savedBook, BookDto.class);
    }

    @Override
    public List<BookDto> getAllBook() {
        List<Book> books = bookRepository.findAll();
        return books.stream()
                .map(book -> mapper.map(book, BookDto.class))
                .collect(Collectors.toList());
    }
}
