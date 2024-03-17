package com.zabinski.customer;


import org.springframework.stereotype.Service;

@Service // we want this to be bean
public record CustomerService(CustomerRepository customerRepository) {

    public void registerCustomer(CustomerRegistrationRequest request) {

        // we are using builder pattern
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.lastName())
                .build();

        // todo: check if email valid
        // todo: check if email not taken
        customerRepository.save(customer);

    }
}
