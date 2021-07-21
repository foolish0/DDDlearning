package com.gebriel.infrastructure.repository;

import com.gebriel.domain.entity.Record;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author lizhenjiang
 */

@Component
@Mapper
public interface RecordRepository {
    Integer saveRecord(Record record);
}
