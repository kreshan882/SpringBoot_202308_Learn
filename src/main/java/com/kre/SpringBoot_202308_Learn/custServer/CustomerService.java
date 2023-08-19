package com.kre.SpringBoot_202308_Learn.custServer;

import java.util.List;

import com.kre.SpringBoot_202308_Learn.dto.CustomerDTO;
import com.kre.SpringBoot_202308_Learn.dto.CustomerSaveDTO;
import com.kre.SpringBoot_202308_Learn.dto.CustomerUpdateDTO;

public interface CustomerService {
	
    String addCustomer(CustomerSaveDTO customerSaveDTO);
    List<CustomerDTO> getAllCustomer();
    String updateCustomers(CustomerUpdateDTO customerUpdateDTO);
    boolean deleteCustomer(int id);
    
}
