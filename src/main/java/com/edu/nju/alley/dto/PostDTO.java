package com.edu.nju.alley.dto;

import lombok.Data;

@Data
public class PostDTO {

    private Integer userId;

    private Integer labelId;

    private String title;

    private String content;

    private Integer anchorId;

    private Integer longitude;

    private Integer latitude;

    private PostAuthDTO auth;

    // 如果没有直接为null
    private String pictureUrl;

}
