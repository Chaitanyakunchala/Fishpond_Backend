package com.main.service;

import com.main.entity.SensorData;
import com.main.repository.SensorDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorDataService {
    @Autowired
    private SensorDataRepository sensorDataRepository;

    // Create a new sensor data record
    public SensorData createSensorData(SensorData sensorData) {
        return sensorDataRepository.save(sensorData);
    }

    // Read all sensor data
    public List<SensorData> getAllSensorData() {
        return sensorDataRepository.findAll();
    }

    // Read sensor data by pond ID
    public List<SensorData> getSensorDataByPondId(Long pondId) {
        return sensorDataRepository.findByPondId(pondId);
    }

    // Update sensor data by ID
    public SensorData updateSensorData(String id, SensorData sensorData) {
        sensorData.setId(id);
        return sensorDataRepository.save(sensorData);
    }

    // Delete sensor data by ID
    public void deleteSensorData(String id) {
        sensorDataRepository.deleteById(id);
    }
}
