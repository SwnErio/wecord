package com.erio.wecord.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Wecord容器pojo类
 * <p>
 * 用于容纳Wecord工作记录与其他冗余信息
 *
 * @author Erio
 * @since 1.0
 */
public class WecordContainer implements Serializable {

  private static final long serialVersionUID = -822740265116983325L;

  /**
   * wecord容器唯一标识
   */
  private String id;

  /**
   * wecord数据ID
   *
   * @see WecordData#id
   */
  private String dataId;

  /**
   * wecord历史数据ID
   *
   * @see WecordData#id
   */
  private List<String> historyDataIds;

  /**
   * wecord归属日期
   */
  private Date belongingDate;

  /**
   * wecord修改日期
   */
  private Date modifyDate;

  /**
   * wecord状态
   */
  private WecordContainerStatus status;

  /**
   * 查看人ID列表
   *
   * @see WecordUser#id
   */
  private List<String> viewerIds;

  /**
   * 评论ID列表
   *
   * @see WecordComments#id
   */
  private List<String> commentIds;

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

  public List<String> getHistoryDataIds() {
    return historyDataIds;
  }

  public void setHistoryDataIds(List<String> historyDataIds) {
    this.historyDataIds = historyDataIds;
  }

  public Date getBelongingDate() {
    return belongingDate;
  }

  public void setBelongingDate(Date belongingDate) {
    this.belongingDate = belongingDate;
  }

  public Date getModifyDate() {
    return modifyDate;
  }

  public void setModifyDate(Date modifyDate) {
    this.modifyDate = modifyDate;
  }

  public WecordContainerStatus getStatus() {
    return status;
  }

  public void setStatus(WecordContainerStatus status) {
    this.status = status;
  }

  public List<String> getViewerIds() {
    return viewerIds;
  }

  public void setViewerIds(List<String> viewerIds) {
    this.viewerIds = viewerIds;
  }

  public List<String> getCommentIds() {
    return commentIds;
  }

  public void setCommentIds(List<String> commentIds) {
    this.commentIds = commentIds;
  }
}
