package cn.yinjiahui.group_purchase.goods.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import java.util.Date;
import java.util.List;

@Data
public class SpuVo {

    private Integer id;

    @ApiModelProperty(value = "spu标题")
    private String title;

    @ApiModelProperty(value = "spu状态")
    private Integer status;

    @ApiModelProperty(value = "categoryId")
    private Integer categoryId;

    @ApiModelProperty(value = "商家id")
    private Integer accountId;

    @ApiModelProperty(value = "商品图片uri")
    private List<String> images;

    @ApiModelProperty(value = "商品详情图片uri")
    private List<String> descImages;

    @ApiModelProperty(value = "售卖开始时间")
    private Date soldStartTime;

    @Column(name = "售卖结束时间")
    private Date soldEndTime;

    @ApiModelProperty(value = "返回一个sku")
    private SkuVo skuVo;
}
