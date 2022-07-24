package com.example.springjpademo.service;

import com.example.springjpademo.domain.Author;
import com.example.springjpademo.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorServiceImplementation implements AuthorService {
  private AuthorRepository authorRepository;

  @Autowired
  public AuthorServiceImplementation(AuthorRepository authorRepository) {
    this.authorRepository = authorRepository;
  }

  @Override
  public Iterable<Author> getAuthors() {
    return authorRepository.findAll();
  }

  @Override
  public Optional<Author> getAuthor(Long id) {
    return authorRepository.findById(id);
  }

  @Override
  public void createAuthor(Author author) {
    authorRepository.save(author);
  }

  @Override
  public void updateAuthor(String firstName, String lastName, Long id) {
    Author author = authorRepository.findById(id).get();
    author.setFirstName(firstName);
    author.setLastName(lastName);
    authorRepository.save(author);
  }

  @Override
  public void deleteAuthor(Long id) {
    authorRepository.deleteById(id);
  }
}
