package com.didimdol.myhome.repository;

import com.didimdol.myhome.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}