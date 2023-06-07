package com.ztt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.sql.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Emp implements Serializable {
        private static final long serialVersionUID = -89822489848437850L;

        private Integer eid;

        private String ename;

        private String esex;

        private Date estartime;

        private Float epay;

        private Integer did;

    }
