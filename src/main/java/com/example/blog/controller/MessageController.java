package com.example.blog.controller;

import com.example.blog.entity.Message;
import com.example.blog.entity.User;
import com.example.blog.service.MessageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@Api(description = "留言接口")
@Controller
public class MessageController {

    @Autowired
    private MessageService messageService;
    /**
     * 显示所有留言
     */
    @ApiOperation("显示所有留言")
    @GetMapping("/message")
    public String listAllMessage(Model model) {
        List<Message> msgList = messageService.listAllMessage();
        Collections.reverse(msgList);
        model.addAttribute("msgList", msgList);
        System.out.println(model);
        return "message";
    }

    /**
     * 添加留言
     */
    @ApiOperation("添加留言")
    @PostMapping("/message/add")
    public String addMessage(@RequestParam String  message) {
        if (!messageService.addMessage(message)) {
            return "";
        }
        return "redirect:/message";
    }
}
