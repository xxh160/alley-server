package com.edu.nju.alley.controller;

import com.edu.nju.alley.service.AnchorService;
import com.edu.nju.alley.vo.PostViewVO;
import com.edu.nju.alley.vo.ResponseVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "anchor")
@RestController
@RequestMapping("/api/anchor")
public class AnchorController {

    private final AnchorService anchorService;

    @Autowired
    public AnchorController(AnchorService anchorService) {
        this.anchorService = anchorService;
    }

    @ApiOperation("获取该锚点对应的所有post预览；根据锚点id返回post；sort是排序方式；label标签筛选方式，0全部1随笔2通知3反馈")
    @GetMapping("/post/{anchorId}")
    public ResponseVO<List<PostViewVO>> getAllPosts(@PathVariable Integer anchorId,
                                                    @RequestParam("sort") Integer sort,
                                                    @RequestParam("label") Integer label) {
        return ResponseVO.<List<PostViewVO>>success().add(anchorService.getAllPosts(anchorId, sort, label));
    }

}
