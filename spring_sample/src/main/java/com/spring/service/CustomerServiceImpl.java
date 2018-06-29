package com.spring.service;

import com.spring.model.Customer;
import com.spring.repository.CustomerRepository;
import com.spring.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService
{
    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll()
    {
        return customerRepository.findAll();
    }

}
