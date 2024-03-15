package com.zabinski.customer;



// record is immutable
public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {


}
