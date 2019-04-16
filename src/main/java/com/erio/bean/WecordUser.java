package com.erio.bean;

import java.io.Serializable;

/**
 * Wecord用户pojo类
 *
 * @author Erio
 * @since 1.0
 */
public class WecordUser implements Serializable {

  private static final long serialVersionUID = -1965161420368435510L;

  /**
   * wecord用户唯一标识
   */
  private String id;

  /**
   * wecord用户姓名
   */
  private String name;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
