package com.erio.service;

import com.erio.bean.WecordContainer;

import java.util.List;

/**
 * 提供对Wecord容器进行相关操作的服务接口
 *
 * @author Erio
 * @since 1.0
 */
public interface WecordContainerService {

  /**
   * 获取wecord操作人的所有wecord容器
   *
   * @param wecordUserId wecord操作人ID
   * @return wecord容器
   */
  List<WecordContainer> getAllWecordContainer(String wecordUserId);
}

