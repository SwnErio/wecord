package com.erio.wecord.controller;

import com.erio.wecord.bean.WecordContainer;
import com.erio.wecord.service.WecordContainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WecordOperationController {

  private final WecordContainerService wecordContainerService;

  @Autowired
  public WecordOperationController(WecordContainerService wecordContainerService) {
    this.wecordContainerService = wecordContainerService;
  }

  @RequestMapping(path = {"/list"})
  public List<WecordContainer> listAllWecordContainer(String wecordUserId) {
    return wecordContainerService.getAllWecordContainer(wecordUserId);
  }
}
