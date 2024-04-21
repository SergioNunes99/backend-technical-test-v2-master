package com.tui.proof.service;

import com.tui.proof.dto.OrderDto;
import com.tui.proof.mapper.OrderMapper;
import com.tui.proof.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderManageImpl implements OrderManager {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public OrderDto createOrder(OrderDto newOrderDto) {

        Order orderToCreate = new Order( newOrderDto.deliveryAddress(), newOrderDto.pilotes(), newOrderDto.orderTotal());



    }

    @Override
    public void updateOrder(OrderDto order) {

    }

    @Override
    public void listOrders(String filter) {

    }

    public void setOrderMapper(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }
}
