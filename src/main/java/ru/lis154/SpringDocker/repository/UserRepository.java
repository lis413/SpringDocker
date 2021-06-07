package ru.lis154.SpringDocker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.lis154.SpringDocker.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

}
