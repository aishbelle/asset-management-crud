package com.example.demo.repo;

import com.example.demo.model.users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface usersRepo extends JpaRepository<users,Integer> {
}
