package com.franks.carshop.cars;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author suba
 *
 */
@Entity
@Table
public class Car {
@Id
	private  Integer id;

	private  String make;

	private String model;
	private Boolean licensed;
	private LocalDate date_added;
	private String fuel_type;
	private String img_url;
	private Integer price;
	private Integer co2;
	private String warehouse;

	public Car(Integer id, String make, String model, Boolean licensed, LocalDate date_added, String fuel_type,
			String img_url, Integer price, Integer co2, String warehouse) {
		this.id = id;
		this.make = make;
		this.model = model;
		this.licensed = licensed;
		this.date_added = date_added;
		this.fuel_type = fuel_type;
		this.img_url = img_url;
		this.price = price;
		this.co2 = co2;
		this.warehouse = warehouse;
	}
	
	public Car() {
		
	}

	public Integer getId() {
		return id;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public Boolean getLicensed() {
		return licensed;
	}

	public LocalDate getDate_added() {
		return date_added;
	}

	public String getFuel_type() {
		return fuel_type;
	}

	public String getImg_url() {
		return img_url;
	}

	public Integer getPrice() {
		return price;
	}

	public Integer getCo2() {
		return co2;
	}

	public String getWarehouse() {
		return warehouse;
	}
	
	

}
