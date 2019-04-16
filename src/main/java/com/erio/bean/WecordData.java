package com.erio.bean;

import java.io.Serializable;

/**
 * Wecord数据pojo类
 *
 * @author Erio
 * @since 1.0
 */
public class WecordData implements Serializable {

  private static final long serialVersionUID = -822740265116983325L;

  /**
   * wecord数据唯一标识
   */
  private String id;

  /**
   * wecord创建日期
   */
  private String createDate;

  /**
   * wecord创建人ID
   *
   * @see WecordUser#id
   */
  private String creatorId;

  /**
   * wecord内容
   */
  private String content;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  public String getCreatorId() {
    return creatorId;
  }

  public void setCreatorId(String creatorId) {
    this.creatorId = creatorId;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}