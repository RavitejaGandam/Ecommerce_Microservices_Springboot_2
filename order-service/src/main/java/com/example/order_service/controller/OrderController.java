package com.example.order_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.order_service.entity.OrderEntity;
import com.example.order_service.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/order")
public class OrderController {
    
    @Autowired
    private OrderService orderService;

    @PostMapping("/bookOrder")    
    public ResponseEntity<OrderEntity> bookOrder(@RequestBody OrderEntity orderEntity){
        return ResponseEntity.ok(orderService.save(orderEntity));
    }

}
