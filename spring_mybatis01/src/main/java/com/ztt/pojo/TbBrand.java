package com.ztt.pojo;

import java.util.Date;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
/**
 * (TbBrand)实体类
 *
 * @author makejava
 * @since 2023-05-22 15:28:17
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TbBrand implements Serializable {
    private static final long serialVersionUID = -10497052200436731L;
    
    private Integer id;
    
    private String brandName;
    
    private String companyName;
    
    private Integer ordered;
    
    private String description;
    
    private Integer status;
    
    private Date createDate;


}

