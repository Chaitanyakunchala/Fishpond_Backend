package com.main.controller;

import com.main.entity.SensorData;
import com.main.service.SensorDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sensor/data")
@CrossOrigin(origins = "http://localhost:4200") // Adjust for your frontend origin
public class SensorDataController {

    @Autowired
    private SensorDataService sensorDataService;

    // Create a new sensor data record
    @PostMapping
    public ResponseEntity<SensorData> createSensorData(@RequestBody SensorData sensorData) {
        SensorData createdData = sensorDataService.createSensorData(sensorData);
        return new ResponseEntity<>(createdData, HttpStatus.CREATED);
    }

    // Get all sensor data
    @GetMapping
    public ResponseEntity<List<SensorData>> getAllSensorData() {
        List<SensorData> sensorDataList = sensorDataService.getAllSensorData();
        return new ResponseEntity<>(sensorDataList, HttpStatus.OK);
    }

    // Get sensor data by pond ID
    @GetMapping("/{pondId}")
    public ResponseEntity<List<SensorData>> getSensorDataByPondId(@PathVariable Long pondId) {
        List<SensorData> sensorDataList = sensorDataService.getSensorDataByPondId(pondId);
        return new ResponseEntity<>(sensorDataList, HttpStatus.OK);
    }

    // Update sensor data by ID
    @PutMapping("/{id}")
    public ResponseEntity<SensorData> updateSensorData(@PathVariable String id, @RequestBody SensorData sensorData) {
        SensorData updatedData = sensorDataService.updateSensorData(id, sensorData);
        return new ResponseEntity<>(updatedData, HttpStatus.OK);
    }

    // Delete sensor data by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSensorData(@PathVariable String id) {
        sensorDataService.deleteSensorData(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
