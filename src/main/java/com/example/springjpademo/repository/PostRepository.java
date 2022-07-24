package com.example.springjpademo.repository;

import com.example.springjpademo.domain.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
