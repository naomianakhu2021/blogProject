package com.example.blogproject.services;

import com.example.blogproject.models.Blogger;

public interface UserService  {
   Blogger getUserByEmailAndPassWord(String email, String password);
   Blogger userRegistration(Blogger blogger);

}
