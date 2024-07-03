package com.study.ddd.order.command.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class OrderNo {

    @Column(name = "order_number")
    private String number;
}
