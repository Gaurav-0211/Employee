package com.OnetoOne.service.impl;

import com.OnetoOne.dto.BookDto;
import com.OnetoOne.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class StudentServiceImpl implements BookService {
    @Override
    public BookDto createBook(BookDto bookDto) {
        return null;
    }

    @Override
    public List<BookDto> getAllBook() {
        return List.of();
    }
}
