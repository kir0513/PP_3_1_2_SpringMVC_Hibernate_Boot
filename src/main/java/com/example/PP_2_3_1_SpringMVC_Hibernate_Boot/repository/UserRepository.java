package com.example.PP_2_3_1_SpringMVC_Hibernate_Boot.repository;

import com.example.PP_2_3_1_SpringMVC_Hibernate_Boot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
