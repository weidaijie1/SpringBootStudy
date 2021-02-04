package com.dj.lunch.service;

import com.dj.lunch.model.User;

import java.util.List;

public interface UserService {
    public User getonebyid(int id);

    public int inset_user(User user);

    public List<User> getAll();
}
