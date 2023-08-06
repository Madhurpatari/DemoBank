package com.demoBank.DemoBankingApplication.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransferRequest {
    private  String sourceAccountNumber; /*debited account*/
    private String destinationAccountNumber; /*credit account*/
    private BigDecimal amount;

}
