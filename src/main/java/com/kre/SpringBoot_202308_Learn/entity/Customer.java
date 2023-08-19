package com.kre.SpringBoot_202308_Learn.entity;

import com.kre.SpringBoot_202308_Learn.dto.CustomerSaveDTO;

import jakarta.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "customer")
@Data
@NoArgsConstructor   //CustomerSaveDTO() {
@AllArgsConstructor  //public CustomerSaveDTO(String customername, String customeraddress, int mobile) {
public class Customer {
	
    @Id
    @Column(name = "customer_id", length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerid;
    
    
    @Column(name = "customer_name", length = 50)
    private String customername;
    
    @Column(name = "customer_address", length = 60)
    private String customeraddress;
    
    @Column(name = "mobile", length = 12)
    private int mobile;
    
    
//    public Customer(int customerid, String customername, String customeraddress, int mobile) {
//        this.customerid = customerid;
//        this.customername = customername;
//        this.customeraddress = customeraddress;
//        this.mobile = mobile;
//    }
//    public Customer() {
//    }
    
    // special case 3 argument constractor
    public Customer(String customername, String customeraddress, int mobile) {
        this.customername = customername;
        this.customeraddress = customeraddress;
        this.mobile = mobile;
    }
//    public int getCustomerid() {
//        return customerid;
//    }
//    public void setCustomerid(int customerid) {
//        this.customerid = customerid;
//    }
//    public String getCustomername() {
//        return customername;
//    }
//    public void setCustomername(String customername) {
//        this.customername = customername;
//    }
//    public String getCustomeraddress() {
//        return customeraddress;
//    }
//    public void setCustomeraddress(String customeraddress) {
//        this.customeraddress = customeraddress;
//    }
//    public int getMobile() {
//        return mobile;
//    }
//    public void setMobile(int mobile) {
//        this.mobile = mobile;
//    }
//    @Override
//    public String toString() {
//        return "Customer{" +
//                "customerid=" + customerid +
//                ", customername='" + customername + '\'' +
//                ", customeraddress='" + customeraddress + '\'' +
//                ", mobile=" + mobile +
//                '}';
//    }
}