package com.tui.proof.ws.controller.pilote;

import com.tui.proof.dto.OrderDto;
import com.tui.proof.mapper.OrderMapper;
import com.tui.proof.model.Order;
import com.tui.proof.service.OrderManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderControllerImpl implements OrderController {

    @Autowired
    private OrderManager orderManager;

    @Override
    public OrderDto createOrder(OrderDto order) {
        return orderManager.createOrder(order);
    }



    public void setOrderManager(OrderManager orderManager) {
        this.orderManager = orderManager;
    }
}
