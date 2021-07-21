package com.gebriel.domain.gateway;

import com.gebriel.domain.entity.Record;

/**
 * @author lizhenjiang
 */
public interface RecordGateway {
    Integer saveRecord(Record record);
}
