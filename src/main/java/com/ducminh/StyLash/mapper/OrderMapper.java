package com.ducminh.StyLash.mapper;

import com.ducminh.StyLash.model.Order;
import com.ducminh.StyLash.rest.dto.CreateOrderRequest;
import com.ducminh.StyLash.rest.dto.OrderDto;

public interface OrderMapper {

    Order toOrder(CreateOrderRequest createOrderRequest);

    OrderDto toOrderDto(Order order);
}