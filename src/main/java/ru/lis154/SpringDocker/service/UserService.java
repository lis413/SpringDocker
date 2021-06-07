package ru.lis154.SpringDocker.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.lis154.SpringDocker.dto.UserDto;
import ru.lis154.SpringDocker.entity.User;
import ru.lis154.SpringDocker.repository.UserRepository;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User save(UserDto userDto){
        User user = new User().setName(userDto.getName())
                .setBirthDay(userDto.getBirthDay())
                .setId(UUID.randomUUID().toString())
                .setCreatedAt(LocalDateTime.now());
        return userRepository.save(user);
    }

    public Iterable<User> getAll(){
        return userRepository.findAll();
    }

}
