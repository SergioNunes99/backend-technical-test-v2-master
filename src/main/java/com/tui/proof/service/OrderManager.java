package com.tui.proof.service;

import com.tui.proof.dto.OrderDto;

public interface OrderManager {

    /**
     * Create new order
     * @param newOrder order to create
     */
    OrderDto createOrder(OrderDto newOrder);

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
