package com.study.ddd.order.command.domain;

import com.study.ddd.common.model.Address;
import jakarta.persistence.*;

@Embeddable
public class ShippingInfo {

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "zipCode", column = @Column(name="shipping_zip_code")),
            @AttributeOverride(name = "address1", column = @Column(name = "shipping_addr1")),
            @AttributeOverride(name = "address2", column = @Column(name = "shipping_addr2"))
    })
    private Address address;

    @Column(name= "shipping_message")
    private String message;

    @Embedded
    private Receiver receiver;
}
