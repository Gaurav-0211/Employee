package com.emp.OnetoOne.repo;

import com.emp.OnetoOne.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
