package com.naveen.basic.naveen.project.resource;

import com.naveen.basic.naveen.project.dao.ProductDao;
import com.naveen.basic.naveen.project.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author naveen.chauhan on 24/09/22
 */
@RestController
public class ProductApiResouce {
	@Autowired
	private ProductDao productDao;

	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		return productDao.saveProduct(product);
	}

	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List<Product> products) {
		return productDao.saveProducts(products);
	}


	@GetMapping("/products")
	public List<Product> getAllProducts() {
		return productDao.getProducts();
	}

	//Note: PathVariable variable name and name given in the url path in brackets to be same.
	@GetMapping("/product/id/{productId}")
	public Product getProductById(@PathVariable Integer productId) {
		return productDao.getProductById(productId);
	}

	@GetMapping("/product/name/{productName}")
	public Product getProductByName(@PathVariable String productName) {
		return productDao.getProductByName(productName);
	}

	@PutMapping("/updateProduct")
	public Product updateProduct(@RequestBody Product product) {
		return productDao.updateProduct(product);
	}

	@DeleteMapping("/deleteProduct/{productId}")
	public String deleteProduct(@PathVariable Integer productId) {
		return productDao.deleteProductById(productId);
	}

}
