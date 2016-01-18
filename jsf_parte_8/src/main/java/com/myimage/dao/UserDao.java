package com.myimage.dao;
 
import com.myimage.model.User;
 
public interface UserDao {
     public boolean existsValidation(String validation);
     public void save(User user);
}