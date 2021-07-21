package com.gebriel.infrastructure.gatewayImpl;

import com.gebriel.domain.entity.Record;
import com.gebriel.domain.gateway.RecordGateway;
import com.gebriel.infrastructure.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author lizhenjiang
 */
public class RecordGatewayImpl implements RecordGateway {
    @Autowired
    private RecordRepository recordRepository;

    @Override
    public Integer saveRecord(Record record) {
        return recordRepository.saveRecord(record);
    }
}
