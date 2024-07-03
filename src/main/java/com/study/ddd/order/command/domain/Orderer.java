package com.study.ddd.order.command.domain;

import com.study.ddd.member.command.domain.MemberId;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Orderer {

    // memberId에 정의된 칼럼 이름 변경하기 위해
    // @AttributeOverride 애너테이션 사용
    @AttributeOverrides(
            @AttributeOverride(name = "id", column = @Column(name = "orderer_id"))
    )
    private MemberId memberId;

    @Column(name = "orderer_name")
    private String name;
}
