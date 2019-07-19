package com.demo.user.controller;

import com.demo.order.pojo.Order;
import com.demo.user.pojo.User;
import com.demo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * 宋艾衡
 * 2019/7/19 11:08
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @Resource
    private RestTemplate restTemplate;
    @Autowired
    private UserService userService;
    @Value("${ORDERSERVICEURL}")
    private String ORDERSERVICEURL;

    @GetMapping(path = "/findOrders/{username}")
    public List<Order> getOrderByUsername(@PathVariable("username")String username){
        User user = userService.selectUser(username);
        // 使用Ribbon后，可以使用http://order-service/而不用使用IP+端口
        ResponseEntity<List<Order>> rateResponse = restTemplate.exchange(ORDERSERVICEURL + "/order/findOrders/" + user.getId(), HttpMethod.GET, null, new ParameterizedTypeReference<List<Order>>() {});
        List<Order> orderList = rateResponse.getBody();
        return orderList;
    }


}
