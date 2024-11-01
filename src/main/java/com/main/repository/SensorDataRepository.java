package com.main.repository;

import com.main.entity.SensorData;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface SensorDataRepository extends MongoRepository<SensorData, String> {
    List<SensorData> findByPondId(Long pondId);
}
