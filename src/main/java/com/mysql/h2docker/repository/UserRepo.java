package com.mysql.h2docker.repository;

import com.mysql.h2docker.entity.UsersEnt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UsersEnt, Integer> {
}
