package com.warehouse.projection;

import com.warehouse.entity.OutputProduct;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
    Long getId();

    Double getAmount();

    Double getPrice();
}
