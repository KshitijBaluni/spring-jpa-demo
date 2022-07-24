package com.example.springjpademo.domain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Builder
@Entity
/**
 * Post Data Persistence Object.
 *
 * @author kshitijbaluni
 * @since 24 July 2022
 */
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
