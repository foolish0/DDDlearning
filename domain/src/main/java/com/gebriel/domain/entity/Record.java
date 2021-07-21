package com.gebriel.domain.entity;

import com.gebriel.domain.gateway.RecordGateway;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author lizhenjiang
 */
public class Record {
    private String name;
    private String message;

    @Autowired
    private RecordGateway recordGateway;

    public Integer saveRecord() {
        return recordGateway.saveRecord(this);
    }
}
