package com.example.carcompany.controllers;

import com.example.carcompany.models.Car;
import com.example.carcompany.models.User;
import com.example.carcompany.service.CarService;
import com.example.carcompany.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {

    private final CarService carService;
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping("/api/addcar")
    public ResponseEntity<?> addCar(@RequestBody Car car){
        carService.addCar(car);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    @GetMapping("/api/cars")
    public ResponseEntity<List<Car>> getCars(){
        List<Car> cars = carService.getCars();
        return new ResponseEntity<>(cars, HttpStatus.OK);
    }

    @GetMapping("/api/car/{id}")
    public ResponseEntity<Car> getCar(@PathVariable Long id){
        Car car = carService.getCar(id);
        return new ResponseEntity<>(car, HttpStatus.OK);
    }

    @GetMapping("/api/carupdate/{id}")
    public ResponseEntity<Car> updateCar(Car car){
        Car updatedCar = carService.updateCar(car);
        return new ResponseEntity<>(updatedCar, HttpStatus.OK);
    }

    @GetMapping("/api/deletecar/{id}")
    public ResponseEntity<?> deleteCar(@PathVariable Long id){
        carService.deleteCar(id);
        return new ResponseEntity<>( HttpStatus.OK);
    }
}
