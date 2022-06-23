package com.warehouse.projection;

import com.warehouse.entity.Client;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Client.class)
public interface CustomClient {
    Long getId();

    String getName();

    boolean getActive();

    String getPhone_number();
}
