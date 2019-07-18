package com.demo.order.repository;

import com.demo.order.pojo.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 宋艾衡
 * 2019/7/18 18:02
 */
@Repository
public interface OrderMapper {
    List<Order> selectOrder(Integer userid);
}
