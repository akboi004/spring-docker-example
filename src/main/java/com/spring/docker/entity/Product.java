package com.spring.docker.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Product")
public class Product {

	@Id
	@Column(name = "id")
	private String id;
	@Column(name = "name")
	private String name;
	@Column(name = "qty")
	private int qty;
	@Column(name = "price")
	private double price;

	@PrePersist
	public void generateId() {
		this.id = UUID.randomUUID().toString();
	}
}
