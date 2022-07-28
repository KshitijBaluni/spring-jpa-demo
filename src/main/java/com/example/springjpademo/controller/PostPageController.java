package com.example.springjpademo.controller;

import com.example.springjpademo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Post Page Controller.
 *
 * @author kshitijbaluni
 * @since 24 July 2022
 */
@Controller
@RequestMapping(value = "/posts")
public class PostPageController {
  private PostService postService;

  @Autowired
  public PostPageController(PostService postService) {
    this.postService = postService;
  }

  @RequestMapping(value = "/list")
  public String listPost(Model model) {
    model.addAttribute("posts", postService.list());
    return "post/list";
  }

  @RequestMapping(value = "/view/{slug}")
  public String view(@PathVariable(value = "slug") String slug, Model model) {
    model.addAttribute("post", postService.getBySlug(slug));
    return "post/view";
  }
}
