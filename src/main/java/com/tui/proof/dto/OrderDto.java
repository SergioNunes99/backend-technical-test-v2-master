package com.tui.proof.dto;

import com.tui.proof.model.Address;

public record OrderDto(String number, Address deliveryAddress, int pilotes, double orderTotal) {
}
