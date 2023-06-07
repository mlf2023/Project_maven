package com.ztt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Wife {

    private Integer wifeId;
    private Integer wifeAge;
    private String sex;
    private String wifeName;
    private Integer hid; //老公的id外建
    private Husband husband;

}
