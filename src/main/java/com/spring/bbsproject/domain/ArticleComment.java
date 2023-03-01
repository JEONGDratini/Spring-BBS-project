package com.spring.bbsproject.domain;

import java.time.LocalDateTime;

/**
 * ER다이어그램에서 설계한대로 댓글 객체를 만들어준다. 단, 내용컬럼은 리소스를 많이 잡아먹기 때문에 이 객체에서 직접 내용을 담고있지는 않는다,
 */
public class ArticleComment {
    private Long id;
    private Article article;
    private String Content;

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
