package com.erio.wecord.bean;

/**
 * Wecord容器状态枚举类
 *
 * @author Erio
 * @since 1.0
 */
public enum WecordContainerStatus {

  ORIGINAL(0, "原创"),
  FORWARD(1, "转载");


  /**
   * 索引
   */
  private int index;

  /**
   * 描述
   */
  private String description;

  WecordContainerStatus(int index, String description) {
    this.index = index;
    this.description = description;
  }

  public int getIndex() {
    return index;
  }

  public void setIndex(int index) {
    this.index = index;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
