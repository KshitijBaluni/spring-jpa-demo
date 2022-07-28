package com.example.springjpademo.repository;

import com.example.springjpademo.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Author Repository.
 *
 * @author kshitijbaluni
 * @since 24 July 2022
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
