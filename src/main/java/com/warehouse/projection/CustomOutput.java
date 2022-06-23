package com.warehouse.projection;

import com.warehouse.entity.Output;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Timestamp;

@Projection(types = Output.class)
public interface CustomOutput {
    Long getId();

    Timestamp getDate();

    String getFacture_number();

    String getCode();
}
