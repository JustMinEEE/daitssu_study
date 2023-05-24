package com.study.daitssu_study.user.repository;

import com.study.daitssu_study.user.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
