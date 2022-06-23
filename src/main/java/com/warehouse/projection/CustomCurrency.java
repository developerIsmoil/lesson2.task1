package com.warehouse.projection;

import com.warehouse.entity.Currency;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Currency.class)
public interface CustomCurrency {
    Long getId();

    String getName();

    boolean getActive();
}
