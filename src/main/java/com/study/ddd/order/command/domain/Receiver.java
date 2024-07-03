package com.study.ddd.order.command.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Receiver {

    @Column(name = "receiver_name")
    private String name;

    @Column(name = "receiver_phone")
    private String phone;

    protected Receiver() {} // JPA를 적용하기 위해 기본 생성자 추가

    public Receiver(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}
