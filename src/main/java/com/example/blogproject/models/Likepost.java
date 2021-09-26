package com.example.blogproject.models;

import com.example.blogproject.enums.Status;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Likepost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long Id;
    @Enumerated(value=EnumType.STRING)
    private Status likestatus;
    @ManyToOne
    private Post post;
    @OneToOne
    private Blogger blogger;


}
