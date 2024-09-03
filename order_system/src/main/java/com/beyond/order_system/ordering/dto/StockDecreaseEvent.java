package com.beyond.order_system.ordering.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockDecreaseEvent {
    private Long productId;
    private Integer productCount;
}
