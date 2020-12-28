package com.example.study.model.enumClass;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PaymentType {
    CARD(0, "카드", "결제수단은 카드입니다."),
    CHECK_CARD(1, "체크 카드", "결제수단은 체크카드입니다."),
    BANK_TRANSFER(2, "계좌 이체", "결제수단은 계좌이체입니다.")
    ;

    private Integer id;
    private String title;
    private String description;
}
