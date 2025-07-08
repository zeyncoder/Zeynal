package com.folksdev.bookstore.service;

import com.folksdev.bookstore.repository.BookRepository;
import com.folksdev.bookstore.repository.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.folksdev.bookstore.model.Book;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OrderService {
    private final BookService bookService;
    private final Logger logger = LoggerFactory.getLogger(OrderService.class);

    public OrderService(BookService bookService) {
        this.bookService = bookService;
    }

    public Order putAnOrder(List<Integer> bookIdList) {
        List<Optional<Book>> bookList = bookIdList.stream()
                .map(bookService::findBookById).collect(Collectors.toList());

return new Order();
    }
}
