package org.tuniway.tp1.Service.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tuniway.tp1.Models.Customer;
import org.tuniway.tp1.Repository.CustomerRepository;

import java.util.List;

@Service
public class CustomerServiceImp implements CustomerService{
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomer(){return customerRepository.findAll();}

    @Override
    public Customer createCustomer(Customer customer){return customerRepository.save(customer) ;}

    @Override
    public Customer updateCustomer(Customer customer){return customerRepository.saveAndFlush(customer);}

    @Override
    public void deleteCustomer(Customer customer){
        customerRepository.delete(customer);
    }

}
