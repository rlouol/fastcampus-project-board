package com.example.projectboard.service;

import com.example.projectboard.domain.type.SearchType;
import com.example.projectboard.dto.ArticleDto;
import com.example.projectboard.dto.ArticleWithCommentsDto;
import com.example.projectboard.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    @Transactional(readOnly = true)
    public Page<ArticleDto> searchArticles(SearchType title, String searchKeyword, Pageable pageable) {
        return Page.empty();
    }

    @Transactional(readOnly = true)
    public ArticleDto searchArticle(long l) {
        return null;
    }

    public void saveArticle(ArticleDto dto) {
    }

    public void updateArticle(long articleId, ArticleDto dto) {
    }

    public void deleteeArticle(long articleId) {
    }

    public ArticleDto getArticle(Long articleId) {
        return null;
    }

    public ArticleWithCommentsDto getArticleWithComments(Long articleId) {
        return null;
    }

    public void deleteArticle(long l, String userId) {
    }

    public Page<ArticleDto> searchArticlesViaHashtag(Object o, Pageable pageable) {
        return Page.empty();
    }

    public long getArticleCount() {
        return articleRepository.count();
    }

    public List<String> getHashtags() {
        return List.of();
    }
}
