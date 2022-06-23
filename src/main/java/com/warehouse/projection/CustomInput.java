package com.warehouse.projection;

import com.warehouse.entity.Input;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface CustomInput {
    Long getId();

    Timestamp getDate();

    String getFacture_number();

    String getCode();
}
