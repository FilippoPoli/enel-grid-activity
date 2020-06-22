package com.enel.permitting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enel.permitting.entity.Car;
import com.enel.permitting.repository.CarRepository;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public int getTotalCarsByModel(String model) {
        return carRepository.getTotalCarsByModel(model);
    }
    
    public void getTotalCarsByModelProcedureName(String model) {
        //return carRepository.getTotalCarsByModelProcedureName(model);
        carRepository.getTotalCarsByModelProcedureName(model);
    }
    
    public int getTotalCarsByModelValue(String model) {
        return carRepository.getTotalCarsByModelValue(model);
    }
    
    public void getTotalCarsByModelExplicit(String model) {
        carRepository.GET_TOTAL_CARS_BY_MODEL(model);
    }
    
    public Integer getTotalCarsByModelEntity(String model) {
    	 return carRepository.getTotalCarsByModelValue(model);
        //return carRepository.getTotalCarsByModelEntiy(model);
    }

    public List<Car> findCarsAfterYear(Integer year) {
        return carRepository.findCarsAfterYear(year);
    }
}
