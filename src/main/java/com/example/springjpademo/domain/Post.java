package com.example.springjpademo.domain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Post Persistence Object.
 *
 * @author kshitijbaluni
 * @since 24 July 2022
 */
@Data
@Builder
@Entity
public class Post {
  @Id
  @GeneratedValue
  private Long id;
  private String title;
  private String body;
  private Date postedOn;

  public Post() {
  }
}
