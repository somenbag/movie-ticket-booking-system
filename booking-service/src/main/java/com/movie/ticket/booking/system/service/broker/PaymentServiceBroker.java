package com.movie.ticket.booking.system.service.broker;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient (name = "payment-service")
public interface PaymentServiceBroker {

    @GetMapping ("/payments")
    public String test ();
}
