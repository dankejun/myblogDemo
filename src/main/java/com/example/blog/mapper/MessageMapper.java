package com.example.blog.mapper;

import com.example.blog.entity.Message;
import com.example.blog.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MessageMapper {

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
     * @return  留言对象
     */
    Boolean addMessage(String message);

}
