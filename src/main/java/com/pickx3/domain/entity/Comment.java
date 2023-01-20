package com.pickx3.domain.entity;
import java.time.LocalDateTime;

public class Comment {
    private Long postNum;
    private Long userNum;
    private String commentContent;
    private Long commentParentNum;
    private LocalDateTime commentDate;
}
