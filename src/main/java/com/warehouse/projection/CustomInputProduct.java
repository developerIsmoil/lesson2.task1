package com.warehouse.projection;

import com.warehouse.entity.InputProduct;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {
    Long getId();

    Double getAmount();

    Double getPrice();

    Date getExpire_date();
}
