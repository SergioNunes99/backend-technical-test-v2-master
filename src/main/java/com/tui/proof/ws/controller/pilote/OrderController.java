package com.tui.proof.ws.controller.pilote;


import com.tui.proof.dto.OrderDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/pilote")
public interface OrderController {

    @GetMapping(value="/")
    OrderDto createOrder(OrderDto order);
}
