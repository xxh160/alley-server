package com.edu.nju.alley.service;

import com.edu.nju.alley.dto.CommentDTO;
import com.edu.nju.alley.po.Comment;
import com.edu.nju.alley.vo.CommentVO;
import com.edu.nju.alley.vo.LikeVO;
import com.edu.nju.alley.vo.NewRecordVO;

public interface CommentService {

    NewRecordVO commentComment(CommentDTO commentDTO);

    LikeVO likeComment(Integer commentId, Integer likerId);

    CommentVO getSpecificOne(Integer commentId);

    void insertOne(Comment comment);
}