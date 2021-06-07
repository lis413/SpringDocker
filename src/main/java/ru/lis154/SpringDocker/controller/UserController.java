package ru.lis154.SpringDocker.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.lis154.SpringDocker.dto.UserDto;
import ru.lis154.SpringDocker.entity.User;
import ru.lis154.SpringDocker.service.UserService;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public User save(@RequestBody UserDto cat){
        return userService.save(cat);
    }

    @GetMapping
    public Iterable<User> getAll(){
        return userService.getAll();
    }
}
