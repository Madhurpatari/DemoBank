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
public class UserRequest {
    private String firstName;
    private String lastName;
    private String gender;
    private String address;
    private  String stateOfOrigin;
    private  String email;
    private  String phoneNumber;
    private  String alternativeNumber;
}
