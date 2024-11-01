package com.main.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Document(collection = "sensorData")
public class SensorData {
    @Id
    private String id;
    private Long pondId;
    private double ph;
    private double rain;
    private double waterLevel;
    private double oxygen;
    private double temperature;
    
    private LocalDateTime timestamp;

    // Constructor
    public SensorData() {
        this.timestamp = LocalDateTime.now(); // Set default timestamp to current local time
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public Long getPondId() { return pondId; }
    public void setPondId(Long pondId) { this.pondId = pondId; }

    public double getPh() { return ph; }
    public void setPh(double ph) { this.ph = ph; }

    public double getRain() { return rain; }
    public void setRain(double rain) { this.rain = rain; }

    public double getWaterLevel() { return waterLevel; }
    public void setWaterLevel(double waterLevel) { this.waterLevel = waterLevel; }

    public double getOxygen() { return oxygen; }
    public void setOxygen(double oxygen) { this.oxygen = oxygen; }

    public double getTemperature() { return temperature; }
    public void setTemperature(double temperature) { this.temperature = temperature; }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
}
