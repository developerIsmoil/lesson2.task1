package com.warehouse.projection;

import com.warehouse.entity.Measurement;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Measurement.class)
public interface CustomMeasurement {
    Long getId();

    String getName();

    boolean getActive();
}
