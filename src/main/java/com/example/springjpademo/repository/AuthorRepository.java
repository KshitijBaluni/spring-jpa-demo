package com.example.springjpademo.repository;

import com.example.springjpademo.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
