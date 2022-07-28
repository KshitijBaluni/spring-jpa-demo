package com.example.springjpademo.repository;

import com.example.springjpademo.domain.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Post Repository.
 *
 * @author kshitijbaluni
 * @since 24 July 2022
 */
public interface PostRepository extends CrudRepository<Post, Long> {
  Post findFirstByOrderByPostedOnDesc();

  List<Post> findAllByOrderByPostedOnDesc();

  Post findBySlug(String slug);
}
