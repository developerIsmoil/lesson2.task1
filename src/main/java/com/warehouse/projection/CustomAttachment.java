package com.warehouse.projection;

import com.warehouse.entity.Attachment;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Attachment.class)
public interface CustomAttachment {
    Long getId();

    String getName();

    long getSize();

    String getContentType();
}
