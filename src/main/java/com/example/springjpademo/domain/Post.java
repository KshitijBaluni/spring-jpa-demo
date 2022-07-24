package com.example.springjpademo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
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
  @Column(columnDefinition = "TEXT")
  private String body;
  @Column(columnDefinition = "TEXT")
  private String teaser;
  private String slug;
  @CreatedDate @Column(columnDefinition = "TIMESTAMP")
  private Date postedOn;

  @ManyToOne
  private Author author;

  public Post() {
  }
}
