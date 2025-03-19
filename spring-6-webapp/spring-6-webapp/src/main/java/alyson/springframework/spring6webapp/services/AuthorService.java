package alyson.springframework.spring6webapp.services;

import alyson.springframework.spring6webapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();

}
