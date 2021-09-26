package com.example.blogproject.services;

import com.example.blogproject.models.Comment;

import java.util.List;

public interface CommentService {
    Comment createComment(Long postId, String commentBody, Long userId);
//   List<Comment> viewCommentsOnPost(Long postId);
}

