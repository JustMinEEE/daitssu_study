package com.study.daitssu_study.user.repository;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Long> {
}
