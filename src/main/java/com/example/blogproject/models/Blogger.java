package com.example.blogproject.models;

import com.example.blogproject.enums.Status;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="blogger")
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Blogger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long Id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Enumerated(value = EnumType.STRING)
    @Column(name="status")
    private Status status;
    @JsonIgnore
    @OneToMany(mappedBy = "blogger", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Post> postList;
    @JsonIgnore
    @OneToMany(mappedBy = "blogger", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comment> commentsList;
    @JsonIgnore
    @OneToOne
    private Connection connections;
//    @ElementCollection
//    private Map<Long,String> favouritePost= new HashMap<>();
}
