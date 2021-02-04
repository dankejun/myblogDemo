package com.example.blog.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Api(description = "友链接口")
@Controller
public class LinkController {
    /**
     * 友链页面
     * @return
     */
    @ApiOperation("友链页面")
    @GetMapping("/link")
    public String index() {
        return "link";
    }
}
