package com.example.blog.service.serviceimpl;

import com.example.blog.entity.Message;
import com.example.blog.entity.User;
import com.example.blog.mapper.MessageMapper;
import com.example.blog.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("messageService")
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageMapper messageMapper;

    @Override
    public List<Message> listAllMessage() {
        return messageMapper.listAllMessage();
    }

    @Override
    public User getMsgUserInfo(Integer id) {
        return messageMapper.getMsgUserInfo(id);
    }

    @Override
    public boolean addMessage(String message) {
        if (!messageMapper.addMessage(message)) {
            return false;
        }
//        Message addmsg = messageMapper.addMessage(message);
//        if (addmsg == null || addmsg.getMessage().equals("") || addmsg.getMessage() == "" || addmsg.getUserId() == null) {
//            return false;
//        }
        return true;
    }
}
