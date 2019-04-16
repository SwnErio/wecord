package com.erio.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Wecord评论pojo类
 *
 * @author Erio
 * @since 1.0
 */
public class WecordComments implements Serializable {

  private static final long serialVersionUID = -98763677878901143L;

  /**
   * wecord评论唯一标识
   */
  private String id;

  /**
   * wecord数据ID
   *
   * @see WecordData#id
   */
  private String dataId;

  /**
   * wecord评论人ID
   *
   * @see WecordUser#id
   */
  private String commentatorId;

  /**
   * wecord评论內容
   */
  private String commentContent;

  /**
   * wecord评论时间
   */
  private Date commentDate;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getDataId() {
    return dataId;
  }

  public void setDataId(String dataId) {
    this.dataId = dataId;
  }

  public String getCommentatorId() {
    return commentatorId;
  }

  public void setCommentatorId(String commentatorId) {
    this.commentatorId = commentatorId;
  }

  public String getCommentContent() {
    return commentContent;
  }

  public void setCommentContent(String commentContent) {
    this.commentContent = commentContent;
  }

  public Date getCommentDate() {
    return commentDate;
  }

  public void setCommentDate(Date commentDate) {
    this.commentDate = commentDate;
  }
}
