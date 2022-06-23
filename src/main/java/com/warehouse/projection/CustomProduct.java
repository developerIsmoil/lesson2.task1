package com.warehouse.projection;

import com.warehouse.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class)
public interface CustomProduct {
    Long getId();

    String getName();

    boolean getActive();

    String getCode();
}
