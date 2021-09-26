package com.example.blogproject.repository;

import com.example.blogproject.models.Blogger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
  public interface UserRepository extends JpaRepository<Blogger,Long> {
   Blogger findBloggerByEmailAndPassword(String email, String password);

}
