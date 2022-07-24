package com.example.springjpademo.service;

import com.example.springjpademo.domain.Post;

import java.util.Optional;

public interface PostService {
  Iterable<Post> getPosts();

  Optional<Post> getPost(Long id);

  void createPost(Post post);

  void updatePost(String title, Long id);

  void deletePost(Long id);
}
