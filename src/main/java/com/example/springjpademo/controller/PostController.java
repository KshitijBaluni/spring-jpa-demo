package com.example.springjpademo.controller;

import com.example.springjpademo.domain.Post;
import com.example.springjpademo.service.PostServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * Post Rest Controller.
 *
 * @author kshitijbaluni
 * @since 24 July 2022
 */
@RestController
@RequestMapping(value = "/post")
public class PostController {
  private PostServiceImplementation postServiceImplementation;

  @Autowired
  public PostController(PostServiceImplementation postServiceImplementation) {
    this.postServiceImplementation = postServiceImplementation;
  }

  @Secured(value = "ROLE_USER")
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public Iterable<Post> getPosts() {
    return postServiceImplementation.getPosts();
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public Optional<Post> getPost(@PathVariable(value = "id") Long id) {
    return postServiceImplementation.getPost(id);
  }

  @RequestMapping(value = "/", method = RequestMethod.POST)
  public void createPost(@RequestBody Post post) {
    postServiceImplementation.createPost(post);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  public void updatePost(@RequestBody String title, @PathVariable(value = "id") Long id) {
    postServiceImplementation.updatePost(title, id);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void deletePost(@PathVariable(value = "id") Long id) {
    postServiceImplementation.deletePost(id);
  }
}
