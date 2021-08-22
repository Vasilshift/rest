//package com.example.rest.controller;
//
//import com.example.rest.model.User;
//import com.example.rest.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//
//@RestController
//@RequestMapping("/api")
//public class MyRestController {
//
//    private final UserService userService;
//
//
//    @Autowired
//    public MyRestController(UserService userService) {
//        this.userService = userService;
//
//    }
//
//    @GetMapping("/users")
//    public ResponseEntity<Iterable<User>> apiGetAllUsers() {
//        Iterable<User> users = userService.getAll();
//        return users != null
//                ? new ResponseEntity<>(users, HttpStatus.OK)
//                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//
//    @GetMapping("/users/{id}")
//    public User showUser(@PathVariable("id") int id) {
//        User user = userService.getByUSerId(id);
//        return user;
//    }
//
//}
