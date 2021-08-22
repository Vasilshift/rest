package com.example.rest.service;

import com.example.rest.model.User;

public interface UserService {

    Iterable<User> getAll();

    User getByUSerId(int id);
}
