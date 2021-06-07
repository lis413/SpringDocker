package ru.lis154.SpringDocker.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserDto {
    String name;
    private LocalDate birthDay;


}
