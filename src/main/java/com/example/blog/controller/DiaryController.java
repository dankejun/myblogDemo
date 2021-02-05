package com.example.blog.controller;

import com.example.blog.entity.Diary;
import com.example.blog.entity.DiaryCategory;
import com.example.blog.service.DiaryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collections;
import java.util.List;

@Api(description = "日记接口")
@Controller
public class DiaryController {

    @Autowired
    private DiaryService diaryService;

    /**
     * 显示所有日记
     */
    @ApiOperation("显示所有日记")
    @GetMapping("/article")
    public String listAllDiary(Model model) {
        List<Diary> list = diaryService.listAllDiary();
        Collections.reverse(list);
        model.addAttribute("diaryList",list);

        List<DiaryCategory> categoryList = diaryService.showDiaryCategory();
        model.addAttribute("diaryCategoryList", categoryList);

        System.out.println(model);

        return "article";
    }

    /**
     * 显示日记详情
     */
    @ApiOperation("显示日记详情")
    @GetMapping("/read/{id}")
    public String diaryDetails(@PathVariable(name = "id") Integer id, Model model) {
        Diary diary = diaryService.findDiaryById(id);
        model.addAttribute("diaryDetails", diary);
        System.out.println(diary);
        return "read";
    }
}
