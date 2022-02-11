package cn.yinjiahui.group_purchase.goods.po;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "goods_sku")
public class SkuPo {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "spu_id")
    private Integer spuId;

    @Column(name = "name")
    private String name;

    @Column(name = "origin_amount")
    private Integer originAmount;

    @Column(name = "actual_amount")
    private Integer actualAmount;

    @Column(name = "stock_qty")
    private Integer stockQty;

    @Column(name = "frozen_qty")
    private String frozenQty;

    @Column(name = "sold_qty")
    private String soldQty;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;
}
