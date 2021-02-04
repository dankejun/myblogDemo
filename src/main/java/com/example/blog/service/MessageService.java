package com.example.blog.service;

import com.example.blog.entity.Message;
import com.example.blog.entity.User;

import java.util.List;

public interface MessageService {

    /**
     * 显示所有留言
     * @return 所有留言信息
     */
    List<Message> listAllMessage();

    /**
     * 得到留言用户信息
     * @param id 留言id
     * @return 某条留言的用户信息
     */
    User getMsgUserInfo(Integer id);

    /**
     * 用户添加留言
     * @param message 留言信息
     * @return  添加成功返回true否则返回false
     */
    boolean addMessage(String message);

}
