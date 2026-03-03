package com.ironhack.lab_advanced_di.config;

import com.ironhack.lab_advanced_di.service.EarlyBirdDiscountService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DiscountFeatureConfig {

    @ConditionalOnProperty(name="feature.earlybird.enabled", havingValue = "true")
    @Bean
    public EarlyBirdDiscountService earlyBirdDiscountService(){
        return new EarlyBirdDiscountService();
    }
}
