package com.spring.repository;

import com.spring.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository
{
    @Override
    public List<Customer> findAll()
    {
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirstName("Johan");
        customer.setLastName("Veenstra");

        customers.add(customer);

        return customers;
    }

}
