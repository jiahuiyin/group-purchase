package cn.yinjiahui.group_purchase.demo.service;

import cn.yinjiahui.group_purchase.common.entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Component
@FeignClient(value = "PROVIDER")
public interface Service {
    @PostMapping("/a")
    Result create();
}
