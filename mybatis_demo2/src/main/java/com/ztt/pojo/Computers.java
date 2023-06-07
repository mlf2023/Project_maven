package com.ztt.pojo;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
/**
 * (Computers)实体类
 *
 * @author makejava
 * @since 2023-05-18 15:01:07
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Computers implements Serializable {
    private static final long serialVersionUID = 877647061535707229L;
    /**
     * 主键
     */
    private Long id;
    /**
     * 名牌
     */
    private String brand;
    /**
     * 价格
     */
    private Float price;
    /**
     * 内存
     */
    private Float runmem;
    /**
     * cpu类型
     */
    private String cpu;
    /**
     * 显卡
     */
    private Float xianka;
    /**
     * 1 显示  0隐藏
     */
    private String status;


}

