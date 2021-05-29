package com.edu.nju.alley.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LikeVO {

    private boolean isLike;

    public LikeVO(boolean isLike) {
        this.isLike = isLike;
    }

}