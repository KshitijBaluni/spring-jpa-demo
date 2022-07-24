package com.example.springjpademo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Author Persistence Object.
 *
 * @author kshitijbaluni
 * @since 24 July 2022
 */
@Data
@Builder
@AllArgsConstructor
@Entity
public class Author {
  @Id
  @GeneratedValue
  private Long id;
  private String firstName;
  private String lastName;

  @OneToMany
  private List<Post> postList;

  public Author() {

  }
}
