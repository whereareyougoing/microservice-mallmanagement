package com.demo.order.controller;

import com.demo.order.pojo.Order;
import com.demo.order.service.OrderService;
import com.google.common.collect.Lists;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 宋艾衡
 * 2019/7/18 18:01
 */
@RestController
@RequestMapping("/order")
public class OrderController {


    @Autowired
    private OrderService orderService;

    @GetMapping(path = "/findOrders/{userid}")
    @HystrixCommand(fallbackMethod = "findOrderfallback") //熔断器
    public List<Order> findOrder(@PathVariable("userid")Integer userid){
        List<Order> orderList = orderService.selectOrder(userid);
        return orderList;
    }

    public List<Order> findOrderFallback(Integer userid){
        List<Order> orderList = Lists.newArrayList();
        return orderList;
    }


}
