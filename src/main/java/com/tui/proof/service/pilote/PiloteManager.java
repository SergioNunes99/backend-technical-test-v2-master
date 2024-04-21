package com.tui.proof.service.pilote;

import com.tui.proof.dto.pilote.OrderDto;

public interface PiloteManager {

    /**
     * Create new order
     * @param newOrder order to create
     */
    void createOrder(OrderDto newOrder);

    /**
     * Updates an order
     * @param order order to update
     */
    void updateOrder(OrderDto order);

    /**
     * Lists order, with filter
     * @param filter filter for the orders
     */
    void listOrders(String filter);
}
