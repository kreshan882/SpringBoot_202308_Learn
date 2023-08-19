package com.kre.SpringBoot_202308_Learn.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor   //CustomerSaveDTO() {
@AllArgsConstructor  //public CustomerSaveDTO(String customername, String customeraddress, int mobile) {
public class CustomerSaveDTO {
    private String customername;
    private String customeraddress;
    private int mobile;

}