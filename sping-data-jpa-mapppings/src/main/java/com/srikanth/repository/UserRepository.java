package com.srikanth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srikanth.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
