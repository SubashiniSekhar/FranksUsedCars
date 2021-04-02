package com.franks.carshop.cars;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

	private final CarDAO carDAO;

	@Autowired
	public CarService(CarDAO carDAO) {
		this.carDAO = carDAO;
	}

	public List<Car> getAllCars() {

		return carDAO.findAll();
	}

}
