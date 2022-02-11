package cn.yinjiahui.group_purchase.goods.controller;

import cn.yinjiahui.group_purchase.common.entity.Result;
import cn.yinjiahui.group_purchase.goods.vo.SpuVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
@Api(value = "Controller|商品相关接口")
public class Controller {
    @ApiOperation(value = "更新/新增SPU")
    @PostMapping("/save_spu")
    public Result saveSpu(SpuVo spuVo) {
        return null;
    }
}
