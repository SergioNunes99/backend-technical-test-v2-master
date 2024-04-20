package com.tui.proof.service.pilote;

import com.tui.proof.dto.pilote.OrderDto;

public interface PiloteManager {

    void createOrder(OrderDto newOrderDto);

    void updateOrder(OrderDto order);

    void listOrders(String filter);
}
