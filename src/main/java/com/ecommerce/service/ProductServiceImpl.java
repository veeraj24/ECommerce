package com.ecommerce.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.ecommerce.dao.CategoryDao;
import com.ecommerce.dao.ProductDao;
import com.ecommerce.dto.productDto;
import com.ecommerce.entities.Category;
import com.ecommerce.entities.Customers;
import com.ecommerce.entities.Product;
import com.ecommerce.exception.ProductNotFoundException;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDao productDao;
//	@Autowired
//	private productDto productdto;
	
	@Autowired
	private CategoryDao catdao;
//	@Autowired
//	private Category cat;
	@Override
	public Product addProduct(productDto product) {
		// TODO Auto-generated method stub
//		product.setCategory(product.getCategory().getCategoryid());
//		Optional<Category> bookData = catdao.getById(product.getCategory());
//		Book bookList=bookData.get();
		Product pro = new Product();
		pro.setProductid(product.getProductid());
		pro.setProductname(product.getProductname());
		pro.setProductdiscription(product.getProductdiscription());
		pro.setPrice(product.getPrice());
		pro.setQuantity(product.getQuantity());
		pro.setProductavailable(product.getProductavailable());


		
		Optional<Category> cat =catdao.findById(product.getCategoryid());
		Category cattt = cat.get();
//			
		
		pro.setCategory(cattt);
		productDao.save(pro);
		return pro;
	}
	

	@Override
	public void deleteProduct(int product_id) {
		// TODO Auto-generated method stub
		Product prod= productDao.getOne(product_id);
		productDao.delete(prod);
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.save(product);
		return product;
	}

	@Override
	public List<Product> getAllProduct() throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return productDao.findAll();
	}
	
   @Override
    public Product getProductByID(int product_id) throws ProductNotFoundException {
        Product product;
        if (productDao.findById(product_id).isEmpty()) {
            throw new ProductNotFoundException();
        } else {
            product = productDao.findById(product_id).get();
        }
        return productDao.getOne(product_id);
    }
}