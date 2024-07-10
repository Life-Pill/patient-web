package com.lifepill.customerservice.controller;

import com.lifepill.customerservice.model.PaymentRequest;
import com.lifepill.customerservice.service.StripeService;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @Autowired
    private StripeService stripeService;

    @PostMapping("/paymentIntent")
    public PaymentIntent createPaymentIntent(@RequestBody PaymentRequest paymentRequest) throws StripeException {
        return stripeService.createPaymentIntent(paymentRequest.getAmount(), paymentRequest.getCurrency());
    }
}