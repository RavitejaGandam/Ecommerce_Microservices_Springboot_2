package com.example.payment_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.payment_service.entity.PaymentEntity;
import com.example.payment_service.service.PaymentService;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/doPayment")
    public ResponseEntity<PaymentEntity> doPayment(@RequestBody PaymentEntity paymentEntity){
        return ResponseEntity.ok(paymentService.doPayment(paymentEntity));
    }
}
