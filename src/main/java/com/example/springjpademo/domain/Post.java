package com.example.springjpademo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Post Persistence Object.
 *
 * @author kshitijbaluni
 * @since 24 July 2022
 */
@Data
@Builder
@AllArgsConstructor
@Entity
public class Post {
  @Id
  @GeneratedValue
  private Long id;
  private String title;
  private String body;
  @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
  private Date postedOn;

  @ManyToOne
  private Author author;

  public Post() {
  }
}
