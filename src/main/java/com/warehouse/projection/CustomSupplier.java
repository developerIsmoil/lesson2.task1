package com.warehouse.projection;

import com.warehouse.entity.Supplier;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Supplier.class)
public interface CustomSupplier {
    Long getId();

    String getName();

    boolean getActive();
}
