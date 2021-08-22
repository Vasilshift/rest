package com.example.rest.service;

import com.example.rest.model.User;

public interface UserService {

    public Iterable<User> getAll();

    public User getByUSerId(int id);
}
