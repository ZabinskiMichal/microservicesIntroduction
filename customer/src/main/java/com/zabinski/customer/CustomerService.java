package com.zabinski.customer;

public record CustomerService() {


    public void registerCustomer(CustomerRegistrationRequest request) {

        // we are using builder pattern
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.lastName())
                .build();
    }
}
