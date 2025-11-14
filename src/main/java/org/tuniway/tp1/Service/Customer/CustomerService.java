package org.tuniway.tp1.Service.Customer;

import org.tuniway.tp1.Models.Customer ;
import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomer();
    List<Customer> getCustomerByCity(String city) ;
    List<Customer> getCustomerByAddress(String address) ;
    Customer createCustomer(Customer customer) ;
    Customer updateCustomer(Customer customer);
    void deleteCustomer(Customer customer);
}
