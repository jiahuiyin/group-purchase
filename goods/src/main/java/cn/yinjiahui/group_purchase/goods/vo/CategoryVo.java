package cn.yinjiahui.group_purchase.goods.vo;

import io.swagger.annotations.ApiModelProperty;

public class CategoryVo {
    private Integer id;

    @ApiModelProperty(value = "商品分类名")
    private String name;

    @ApiModelProperty(value = "商品图片(uri)")
    private String image;
}
