package com.test_spotbugs.service;

import com.test_spotbugs.entity.Book;
import com.test_spotbugs.repo.BookRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepo bookRepo;

    public void CreateBook(Book book){
        bookRepo.save(book);
    }
}
