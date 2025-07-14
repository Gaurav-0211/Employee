package com.OnetoOne.service.impl;

import com.OnetoOne.dto.BookDto;
import com.OnetoOne.repo.BookRepository;
import com.OnetoOne.service.BookService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class BookServiceImpl implements BookService {

    @Override
    public BookDto createBook(BookDto bookDto) {
        return null;
    }

    @Override
    public List<BookDto> getAllBook() {
        return List.of();
    }
}
