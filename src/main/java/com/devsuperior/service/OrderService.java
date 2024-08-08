package com.devsuperior.service;

import org.springframework.stereotype.Service;

import com.devsuperior.entities.Order;

@Service
public class OrderService {

    public double TotalValue(Order order) {
        ShippingService shippingService = new ShippingService();

        double ValueWithDiscount = order.getValueWithDiscount();

        double shipment = shippingService.shipment(order.getbasic());
        return ValueWithDiscount + shipment;
    }

    public OrderService() {
    }
}