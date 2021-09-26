package com.example.blogproject.repository;

import com.example.blogproject.models.Blogger;
import com.example.blogproject.models.Comment;
import com.example.blogproject.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Long> {
//    List<Comment> findAllByPost_Id(Long postId);
//    List<Comment>findAllByBlogger_Id(Blogger blogger);
}