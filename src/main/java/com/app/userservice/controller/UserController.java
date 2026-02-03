package com.app.userservice.controller;


import com.app.userservice.dto.UserResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController
{
    @GetMapping("/{id}")
    public UserResponse getUser(@PathVariable Long id)
    {
        return new UserResponse(
                id,
                "User-" + id,
                "user" + id +"@mail.com"
        );
    }

}
