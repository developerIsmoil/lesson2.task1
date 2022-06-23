package com.warehouse.projection;

import com.warehouse.entity.Category;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Category.class)
public interface CustomCategory {
    Long getId();

    String getName();

    boolean getActive();
}
