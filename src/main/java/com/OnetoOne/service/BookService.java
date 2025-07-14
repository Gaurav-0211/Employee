package com.OnetoOne.service;

import com.OnetoOne.dto.BookDto;

import java.util.List;

public interface BookService {
    BookDto createBook(BookDto bookDto);
    List<BookDto>  getAllBook();
}
