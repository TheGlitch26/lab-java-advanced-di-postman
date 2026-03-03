package com.ironhack.lab_advanced_di.controller;


import com.ironhack.lab_advanced_di.config.DiscountFeatureConfig;
import com.ironhack.lab_advanced_di.service.EarlyBirdDiscountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class DiscountController {
    private final EarlyBirdDiscountService earlyBirdDiscountService;

    public DiscountController(EarlyBirdDiscountService earlyBirdDiscountService){
        this.earlyBirdDiscountService = earlyBirdDiscountService;
    }


    @GetMapping("/api/discount")
    public String getDiscount(@RequestParam LocalDate bookingDate, @RequestParam LocalDate eventDate){
        if(earlyBirdDiscountService == null){
            throw new NullPointerException("The Discount Service is disabled!");
        }
        return earlyBirdDiscountService.calculateDiscount(bookingDate, eventDate);
    }
}
