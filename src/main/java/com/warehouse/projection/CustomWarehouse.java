package com.warehouse.projection;

import com.warehouse.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Warehouse.class)
public interface CustomWarehouse {
    Long getId();

    String getName();

    boolean getActive();
}
