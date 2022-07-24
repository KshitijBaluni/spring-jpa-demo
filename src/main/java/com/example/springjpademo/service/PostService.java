package com.example.springjpademo.service;

import com.example.springjpademo.domain.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {
  Iterable<Post> getPosts();

  Optional<Post> getPost(Long id);

  void createPost(Post post);

  void updatePost(String title, Long id);

  void deletePost(Long id);

  Post getLatestPost();

  List<Post> list();

  Post getBySlug(String slug);
}
