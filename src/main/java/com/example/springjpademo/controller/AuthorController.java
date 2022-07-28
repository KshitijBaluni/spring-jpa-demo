package com.example.springjpademo.controller;

import com.example.springjpademo.domain.Author;
import com.example.springjpademo.service.AuthorServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * Author Rest Controller.
 *
 * @author kshitijbaluni
 * @since 24 July 2022
 */
@RestController
@RequestMapping(value = "/author")
public class AuthorController {
  private AuthorServiceImplementation authorService;

  @Autowired
  public AuthorController(AuthorServiceImplementation authorService) {
    this.authorService = authorService;
  }

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public Iterable<Author> getAuthors() {
    return authorService.getAuthors();
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public Optional<Author> getAuthor(@PathVariable Long id) {
    return authorService.getAuthor(id);
  }

  @RequestMapping(value = "/", method = RequestMethod.POST)
  public void createAuthor(@RequestBody Author author) {
    authorService.createAuthor(author);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  public void updateAuthor(@RequestBody(required = true) String firstName,
                           @PathVariable(value = "id") Long id) {
    authorService.updateAuthor(firstName, id);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void deleteAuthor(@PathVariable Long id) {
    authorService.deleteAuthor(id);
  }
}
