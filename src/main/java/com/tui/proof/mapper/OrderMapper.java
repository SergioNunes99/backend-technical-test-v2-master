package com.tui.proof.mapper;

import com.tui.proof.dto.OrderDto;
import com.tui.proof.model.Order;
import org.mapstruct.Mapper;

@Mapper
public interface OrderMapper {
    OrderDto toDto(Order order);
}
