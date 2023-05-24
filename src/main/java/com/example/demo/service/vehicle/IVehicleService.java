package com.example.demo.service.vehicle;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.demo.model.Vehicle;

@Service("vehicleService")
public interface IVehicleService {
    public ResponseEntity<List<Vehicle>> findAllVehicles();

    public ResponseEntity<Vehicle> findVehicleById(Long id);

    public ResponseEntity<Vehicle> updateVehicleById(Long id, Vehicle vehicle);

    public ResponseEntity<Vehicle> insertVehicle(Vehicle vehicle);
}
