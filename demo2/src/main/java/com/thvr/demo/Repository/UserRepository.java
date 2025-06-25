package com.thvr.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thvr.demo.Entity.User;

public interface UserRepository extends JpaRepository<User , Long> {

}
