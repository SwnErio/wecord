package com.erio.controller;

import com.erio.bean.WecordContainer;
import com.erio.service.WecordContainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/operation")
public class WecordOperationController {

  private final WecordContainerService wecordContainerService;

  @Autowired
  public WecordOperationController(WecordContainerService wecordContainerService) {
    this.wecordContainerService = wecordContainerService;
  }

  @RequestMapping("/list")
  public List<WecordContainer> listAllWecordContainer(String wecordUserId) {
    return wecordContainerService.getAllWecordContainer(wecordUserId);
  }
}
