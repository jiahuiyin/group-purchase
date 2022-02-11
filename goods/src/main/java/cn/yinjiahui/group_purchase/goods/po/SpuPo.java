package cn.yinjiahui.group_purchase.goods.po;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Data
@Table(name = "goods_spu")
public class SpuPo {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "account_id")
    private Integer accountId;

    @Column(name = "status")
    private Integer status;

    /**
     * spu图片 uri json
     */
    @Column(name = "images")
    private String images;

    @Column(name = "descImages")
    private String descImages;

    @Column(name = "sold_start_time")
    private Date soldStartTime;

    @Column(name = "sold_end_time")
    private Date soldEndTime;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;
}