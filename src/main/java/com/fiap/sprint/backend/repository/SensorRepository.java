package com.fiap.sprint.backend.repository;

import com.fiap.sprint.backend.model.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorRepository extends JpaRepository<Sensor, Long> {
}