package com.naveen.basic.naveen.project.repository;

import com.naveen.basic.naveen.project.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author naveen.chauhan on 24/09/22
 */
public interface ProductRepository extends JpaRepository<Product, Integer> {
	Product findByName(String productName);
}
