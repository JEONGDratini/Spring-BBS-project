package com.spring.bbsproject.domain;

import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

/**
 * ER다이어그램에서 설계한대로 게시글 객체를 만들어준다. ,
 */
public class Article {
    private Long id;
    private String title;// 제목
    private String Content;//내용
    private String hashtag;//해시태그

    private LocalDateTime createdAt;//작성일
    private String createdBy;//작성자
    private LocalDateTime modifiedAt;//수정일
    private String modifiedBy;//수정자
}
