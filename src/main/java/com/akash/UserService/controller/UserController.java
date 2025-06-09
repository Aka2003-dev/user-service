package com.akash.UserService.controller;

import com.akash.UserService.dtos.RegisterRequest;
import com.akash.UserService.dtos.ServiceBookingRequest;
import com.akash.UserService.model.User;

import com.akash.UserService.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/test")
    public String test() {
        return "Hello World";
    }


    @PostMapping("/save")
    public ResponseEntity<?> createUser(@RequestBody RegisterRequest userDto) {
        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setEmail(userDto.getEmail());
        user.setAddress(userDto.getAddress());
        user.setContact(userDto.getContactNumber());

        userService.saveUser(user);
        return ResponseEntity.ok("User Created");
    }

    @PostMapping("/book")
    public ResponseEntity<?> bookService(
            @RequestBody ServiceBookingRequest request
    ){
        userService.bookService(request);
        return ResponseEntity.ok("Service Booked");
    }


}
