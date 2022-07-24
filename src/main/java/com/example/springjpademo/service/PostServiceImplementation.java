package com.example.springjpademo.service;

import com.example.springjpademo.domain.Post;
import com.example.springjpademo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImplementation implements PostService {
  private PostRepository postRepository;

  @Autowired
  public PostServiceImplementation(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  @Override
  public Iterable<Post> getPosts() {
    return postRepository.findAll();
  }

  @Override
  public Optional<Post> getPost(Long id) {
    return postRepository.findById(id);
  }

  @Override
  public void createPost(Post post) {
    postRepository.save(post);
  }

  @Override
  public void updatePost(String title, Long id) {
    Post post = postRepository.findById(id).get();
    post.setTitle(title);
    postRepository.save(post);
  }

  @Override
  public void deletePost(Long id) {
    postRepository.deleteById(id);
  }

  @Override
  public Post getLatestPost() {
    return postRepository.findFirstByOrderByPostedOnDesc();
  }

  @Override
  public List<Post> list() {
    return postRepository.findAllByOrderByPostedOnDesc();
  }

  @Override
  public Post getBySlug(String slug) {
    return postRepository.findBySlug(slug);
  }
}
