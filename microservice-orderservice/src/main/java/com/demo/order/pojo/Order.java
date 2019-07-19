package com.demo.order.pojo;

import lombok.Data;

import java.util.Date;

/**
 * 宋艾衡
 * 2019/7/18 18:04
 */
@Data
public class Order {

    private Long id;
    private Date createtime;
    private String number;
    private Long userid;
}
