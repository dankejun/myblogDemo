package com.example.blog.entity;

import java.sql.Timestamp;

public class MessageReply {
    private Integer replyId;
    private Integer userId;
    private Integer replyUserId;
    private String replyMessage;
    private Timestamp MsgReplyTime;
    private Integer replyMsgId;

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getReplyUserId() {
        return replyUserId;
    }

    public void setReplyUserId(Integer replyUserId) {
        this.replyUserId = replyUserId;
    }

    public String getReplyMessage() {
        return replyMessage;
    }

    public void setReplyMessage(String replyMessage) {
        this.replyMessage = replyMessage;
    }

    public Timestamp getMsgReplyTime() {
        return MsgReplyTime;
    }

    public void setMsgReplyTime(Timestamp msgReplyTime) {
        MsgReplyTime = msgReplyTime;
    }

    public Integer getReplyMsgId() {
        return replyMsgId;
    }

    public void setReplyMsgId(Integer replyMsgId) {
        this.replyMsgId = replyMsgId;
    }

    @Override
    public String toString() {
        return "MessageReply{" +
                "replyId=" + replyId +
                ", userId=" + userId +
                ", replyUserId=" + replyUserId +
                ", replyMessage='" + replyMessage + '\'' +
                ", MsgReplyTime=" + MsgReplyTime +
                ", replyMsgId=" + replyMsgId +
                '}';
    }
}
