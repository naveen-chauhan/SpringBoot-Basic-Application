package com.naveen.basic.naveen.project.dao;

import com.naveen.basic.naveen.project.models.Product;
import com.naveen.basic.naveen.project.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author naveen.chauhan on 24/09/22
 */

@Service
public class ProductDao {

	@Autowired
	private ProductRepository productRepository;

	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	public List<Product> saveProducts(List<Product> products) {
		return productRepository.saveAll(products);
	}

	public List<Product> getProducts() {
		return productRepository.findAll();
	}

	public Product getProductById(int id) {
		return productRepository.findById(id).orElse(null);
	}

	public Product getProductByName(String productName) {
		return productRepository.findByName(productName);
	}

	public String deleteProductById(Integer productId) {
		productRepository.deleteById(productId);
		return "Product deleted successfully";
	}

	public Product updateProduct(Product product) {
		Product existingProduct = productRepository.findById(product.getId()).orElse(null);

		if (existingProduct != null) {
			existingProduct.setId(product.getId());
			existingProduct.setName(product.getName());
			existingProduct.setQuantity(product.getQuantity());
			existingProduct.setPrice(product.getPrice());
			return productRepository.save(existingProduct);
		}
		return productRepository.save(product);
	}
}
