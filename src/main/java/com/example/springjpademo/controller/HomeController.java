package com.example.springjpademo.controller;

import com.example.springjpademo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Home Controller.
 *
 * @author kshitijbaluni
 * @since 24 July 2022
 */
@Controller
public class HomeController {
  private PostService postService;

  @Autowired
  public HomeController(PostService postService) {
    this.postService = postService;
  }

  @RequestMapping(value = "/")
  public String home(Model model) {
    model.addAttribute("post", postService.getLatestPost());
    return "index";
  }
}
