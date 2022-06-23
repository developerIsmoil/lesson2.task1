package com.warehouse.projection;

import com.warehouse.entity.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = User.class)
public interface CustomUser {
    Long getId();

    String getFirstName();

    String getLastName();

    String getPhone_number();

    String getCode();

    String getPassword();

    boolean getActive();
}
