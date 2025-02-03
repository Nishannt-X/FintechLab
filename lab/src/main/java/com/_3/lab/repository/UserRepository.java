package com._3.lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com._3.lab.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
