package com.demo.order.service;

import com.demo.order.pojo.Order;

import java.util.List;

/**
 * 宋艾衡
 * 2019/7/18 18:03
 */
public interface OrderService {
    List<Order> selectOrder(Integer userid);
}
