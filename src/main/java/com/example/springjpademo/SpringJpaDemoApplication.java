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
  public static void main(String[] args) {
    SpringApplication.run(SpringJpaDemoApplication.class, args);
  }
}
