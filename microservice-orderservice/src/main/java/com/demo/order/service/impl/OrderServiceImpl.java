package com.demo.order.service.impl;

import com.demo.order.pojo.Order;
import com.demo.order.repository.OrderMapper;
import com.demo.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 宋艾衡
 * 2019/7/18 18:03
 */
@Service
public class OrderServiceImpl implements OrderService {


    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> selectOrder(Integer userid) {
        return orderMapper.selectOrder(userid);
    }
}
