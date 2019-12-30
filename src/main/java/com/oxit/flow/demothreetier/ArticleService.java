package com.oxit.flow.demothreetier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArticleService {

    private static final Logger log = LoggerFactory.getLogger(ArticleService.class);

    @Autowired
    ArticleRepository repository;

    public Optional<Article> findById(Long articleId) {
        log.info("Article " + articleId + " was searched in database");
        return repository.findById(articleId);
    }

}
