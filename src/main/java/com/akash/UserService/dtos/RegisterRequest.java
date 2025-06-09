package com.akash.UserService.dtos;

import lombok.Data;

@Data
public class RegisterRequest {
    private String username;
    private String email;
    private String password;
    private String address;
    private String contactNumber;
}