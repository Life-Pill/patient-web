package com.lifepill.customerservice.controller;

import com.lifepill.customerservice.model.PrescriptionOrder;
import com.lifepill.customerservice.service.PrescriptionOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("myOrders")
public class PrescriptionOrderController {
    @Autowired
    private PrescriptionOrderService prescriptionOrderService;

}
