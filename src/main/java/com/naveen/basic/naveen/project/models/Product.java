package com.naveen.basic.naveen.project.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author naveen.chauhan on 24/09/22
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="product_details")
public class Product {

	@Id
	@GeneratedValue
	private int id;

	private String name;

	private int quantity;

	private double price;
}
