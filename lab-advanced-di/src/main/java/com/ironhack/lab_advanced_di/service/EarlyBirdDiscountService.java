package com.ironhack.lab_advanced_di.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class EarlyBirdDiscountService {
    public String calculateDiscount(LocalDate bookingDate, LocalDate eventDate){
        long dayDifference = ChronoUnit.DAYS.between(bookingDate, eventDate);
        if(dayDifference >= 30){
            return "You receive 15% discount!";
        }
        else {
            return "You do not get a discount!";
        }
    }
}
