package com.example.demo.Service.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Product;
import com.example.demo.Repository.ProductRepository;
import com.example.demo.Service.ProductService;
import com.example.demo.utility.ResponseStructure;


@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository repository;
	ResponseStructure<Product> structure;
	super();
	this.productRepo=productRepo;
	this.structure = structure;
	
		
	}
	
	@Override
	public ResponseEntity<ResponseStructure<Product>> findProductById(int productId){
		return ProductRepo.findById(productId).map(product)->ResponseEntity.ok{
			.setMessage("Product Found")
			.setDate(product)
			.orElseThrow(()->new RuntimeException());
		}

//	}
//
//	@Override
//	public Product saveProduct(Product product) {
//		// TODO Auto-generated method stub
////		Optional<Product> optional=repository.saveProduct(productId);
////		if(optional.isPresent()) {
////			return optional.get();
////			
////		}
//		return repository.save(product);
//	}
//
//	@Override
//	public Product updateProduct(int productId,Product updatedProduct) {
//		// TODO Auto-generated method stub
//		Optional<Product> optional=repository.findById(productId);
//		if(optional.isPresent()) {
//			Product existingproduct=optional.get();
//			updatedProduct.setProductId(existingproduct.getProductId());
//			return repository.updatedProduct(updatedProduct);
//			}
//		return null;
//	}
//
//	@Override
//	public Product deleteProduct(int productId) {
//		Optional<Product> optional=repository.findById(productId);
//		if(optional.isPresent()) {
//			Product deleteproduct=optional.get();
//			repository.delete(deleteproduct);
//			return deleteproduct;
//			}else {
//		return null;
//			}
//	}
//
//	@Override
//	public Product findById(int productId) {
//		Optional<Product> optional=repository.findById(productId);
//		if(optional.isPresent()) {
//			Product find=optional.get();
//			return find;
//			
//			}else {
//		return null;
//			}
//
//	}
//
//	public List<Product> findAllProduct() {
//		List<Product> product=repository.findAll();
//		if(product!=null) {
//			return product ;
//			
//			}else {
//		      return null;
//			}
//		
//	}
//
//	
//
//	
//	
//	
//
//}
