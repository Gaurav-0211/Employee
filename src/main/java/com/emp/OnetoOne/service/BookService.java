package com.emp.OnetoOne.service;

import com.emp.OnetoOne.dto.BookDto;

import java.util.List;

public interface BookService {
    BookDto createBook(BookDto bookDto);
    List<BookDto>  getAllBook();
}
