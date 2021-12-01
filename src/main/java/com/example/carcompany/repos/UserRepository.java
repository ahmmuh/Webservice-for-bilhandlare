package com.example.carcompany.repos;

import com.example.carcompany.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
