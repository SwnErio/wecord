package com.erio.wecord.impl;

import com.erio.wecord.bean.WecordContainer;
import com.erio.wecord.service.WecordContainerService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 提供对Wecord容器进行相关操作的服务实现
 *
 * @author Erio
 * @since 1.0
 */
@Service
public class WecordContainerServiceImpl implements WecordContainerService {

  @Override
  public List<WecordContainer> getAllWecordContainer(String wecordUserId) {
    return null;
  }
}
