package com.test_spotbugs.repo;

import com.test_spotbugs.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Long> {
}
