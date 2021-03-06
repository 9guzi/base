/*
 * Copyright © 2013-2016 BLT, Co., Ltd. All Rights Reserved.
 */

package com.base.message.common.param;

import com.base.message.common.code.proto.IMBaseDefine;
import com.base.message.common.code.proto.IMBaseDefine;

/**
 * 
 * @author 袁贵
 * @version 1.0
 * @since  1.0
 */
public class MessageSendReq {

    private long userId;
    private long toId;
    private IMBaseDefine.MsgType msgType;
    private int createTime;
    @Deprecated
    private String msgContent;
    /** 用于替代msgContent,以支持语音 */
    private byte[] content;
    
    /**
     * @return the userId
     */
    public long getUserId() {
        return userId;
    }
    /**
     * @param userId the userId to set
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }
    
    /**
     * @return the toId
     */
    public long getToId() {
        return toId;
    }
    /**
     * @param toId the toId to set
     */
    public void setToId(long toId) {
        this.toId = toId;
    }
    /**
     * @return the msgType
     */
    public IMBaseDefine.MsgType getMsgType() {
        return msgType;
    }
    /**
     * @param msgType the msgType to set
     */
    public void setMsgType(IMBaseDefine.MsgType msgType) {
        this.msgType = msgType;
    }
    /**
     * @return the createTime
     */
    public int getCreateTime() {
        return createTime;
    }
    /**
     * @param createTime the createTime to set
     */
    public void setCreateTime(int createTime) {
        this.createTime = createTime;
    }
    /**
     * @return the msgContent
     */
    public String getMsgContent() {
        return msgContent;
    }
    /**
     * @param msgContent the msgContent to set
     */
    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }
    /**
     * @return the content
     */
    public byte[] getContent() {
        return content;
    }
    /**
     * @param content the content to set
     */
    public void setContent(byte[] content) {
        this.content = content;
    }
    
}
