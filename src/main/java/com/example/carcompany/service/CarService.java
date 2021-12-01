package com.example.carcompany.service;

import com.example.carcompany.models.Car;
import com.example.carcompany.repos.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }


    public void addCar(Car car){
        carRepository.save(car);
    }

    public List<Car> getCars(){
        return carRepository.findAll();
    }

    public Car getCar(Long id){
        return carRepository.getById(id);
    }

    public Car updateCar(Car car){
       return carRepository.save(car);
    }

    public void deleteCar(Long id){
        carRepository.deleteById(id);
    }
}
