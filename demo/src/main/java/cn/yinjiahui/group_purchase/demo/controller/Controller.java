package cn.yinjiahui.group_purchase.demo.controller;

import cn.yinjiahui.group_purchase.common.entity.Result;
import cn.yinjiahui.group_purchase.demo.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private cn.yinjiahui.group_purchase.demo.service.Service service;
    @GetMapping("/create")
    public Result create() {
       return service.create();
    }
}
