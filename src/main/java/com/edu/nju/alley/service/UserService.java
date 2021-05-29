package com.edu.nju.alley.service;

import com.edu.nju.alley.dto.UserDTO;
import com.edu.nju.alley.vo.*;

import java.util.List;

public interface UserService {

    List<PostVO> getUserPost(Integer userId, Integer pageId);

    List<CommentVO> getUserComment(Integer userId, Integer pageId);

    List<UserLikeVO> getUserLike(Integer userId, Integer pageId);

    UserVO viewUser(Integer userId);

    void updateUser(Integer userId, UserDTO userDTO);

    LikeVO isLike(Integer userId, Integer typeId, Integer targetId);

}
