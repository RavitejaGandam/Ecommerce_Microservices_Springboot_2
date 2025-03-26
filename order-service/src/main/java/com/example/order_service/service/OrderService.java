package com.example.order_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.order_service.entity.OrderEntity;
import com.example.order_service.repository.OrderRepository;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;


    public OrderEntity save(OrderEntity orderEntity){
        return repository.save(orderEntity);
    }

}
