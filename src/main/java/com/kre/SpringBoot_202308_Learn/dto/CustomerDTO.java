package com.kre.SpringBoot_202308_Learn.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@NoArgsConstructor   //CustomerSaveDTO() {
@AllArgsConstructor  //public CustomerSaveDTO(String customername, String customeraddress, int mobile) {
public class CustomerDTO {   //DTO--Data Transfer Object / VO-Value Object
    private int customerid;
    private String customername;
    private String customeraddress;
    private int mobile;

}