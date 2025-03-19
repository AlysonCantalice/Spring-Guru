package alyson.springframework.spring6webapp.services;

import alyson.springframework.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();

}
