package com.example.springjpademo.service;

import com.example.springjpademo.domain.Author;

import java.util.Optional;

public interface AuthorService {
  Iterable<Author> getAuthors();

  Optional<Author> getAuthor(Long id);

  void createAuthor(Author author);

  void updateAuthor(String firstName, String lastName, Long id);

  void deleteAuthor(Long id);
}
