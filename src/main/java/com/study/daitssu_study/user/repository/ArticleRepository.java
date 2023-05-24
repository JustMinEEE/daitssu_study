package com.study.daitssu_study.user.repository;

import com.study.daitssu_study.user.model.ArticleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<ArticleEntity, Long> {
}
