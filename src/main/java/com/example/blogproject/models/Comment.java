package com.example.blogproject.models;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Getter
@Setter
@Table(name="comments")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Comment {
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Long commentId;
       private String commentBody;
       private LocalDateTime date ;
       @ManyToOne
       private Blogger blogger;
       @ManyToOne
       private Post post;



}
