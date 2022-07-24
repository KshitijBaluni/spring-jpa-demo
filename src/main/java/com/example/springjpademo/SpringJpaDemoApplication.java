package com.example.springjpademo;

import com.example.springjpademo.domain.Author;
import com.example.springjpademo.domain.Post;
import com.example.springjpademo.repository.AuthorRepository;
import com.example.springjpademo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Date;

@SpringBootApplication
public class SpringJpaDemoApplication {
  @Autowired
  private PostRepository postRepository;
  @Autowired
  private AuthorRepository authorRepository;

  public static void main(String[] args) {
    SpringApplication.run(SpringJpaDemoApplication.class, args);
  }

  @PostConstruct
  void seedPosts() {
    Author author = Author.builder()
      .firstName("Kshitij")
      .lastName("Baluni")
      .build();
    authorRepository.save(author);

    Post post = Post.builder()
      .title("New Post")
      .body("Test Body Post")
      .author(author)
      .postedOn(new Date())
      .build();

    postRepository.save(post);
  }

}
