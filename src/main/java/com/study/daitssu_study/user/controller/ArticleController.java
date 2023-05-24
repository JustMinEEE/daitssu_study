package com.study.daitssu_study.user.controller;

import com.study.daitssu_study.user.model.ArticleEntity;
import com.study.daitssu_study.user.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
public class ArticleController {
    private final ArticleRepository articleRepository;

    @Autowired
    public ArticleController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @PostMapping("/{userId}")
    public ResponseEntity<?> createArticle(@PathVariable Long userId, @RequestBody ArticleEntity article) {
        if (article.getTitle() == null || article.getTitle().trim().isEmpty() || article.getContent() == null || article.getContent().trim().isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Title and content cannot be empty.");
        }

        article.setArticleId(userId);
        ArticleEntity savedArticle = articleRepository.save(article);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedArticle);
    }
}
