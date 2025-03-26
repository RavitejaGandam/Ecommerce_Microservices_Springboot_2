package com.example.payment_service.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.payment_service.entity.PaymentEntity;
import com.example.payment_service.repository.PaymentRepository;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository repository;


    public PaymentEntity doPayment(PaymentEntity paymentEntity){
        paymentEntity.setTransactionId(UUID.randomUUID().toString());
        return repository.save(paymentEntity);
    }
}
