package com.ecommerce.service;

import java.util.List;

import com.ecommerce.dto.productDto;
import com.ecommerce.entities.Product;
import com.ecommerce.exception.ProductNotFoundException;

public interface ProductService {

	public Product getProductByID(int product_id);

	public Product addProduct(productDto product);

	public void deleteProduct(int product_id);

	public Product updateProduct(Product product);

	public List<Product> getAllProduct() throws ProductNotFoundException;
}

