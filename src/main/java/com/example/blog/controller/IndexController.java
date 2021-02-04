package com.example.blog.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Api(description = "首页接口")
@Controller
public class IndexController {
    /**
     * 首页页面
     *
     * @return
     */
    @ApiOperation("首页页面")
    @GetMapping(value = {"/", "/index"})
    public String index() {
        return "index";
    }
}
