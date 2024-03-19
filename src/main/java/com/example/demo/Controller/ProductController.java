package com.example.demo.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Product;
import com.example.demo.Service.ProductService;
import com.example.demo.utility.ErrorStructure;
import com.example.demo.utility.ResponseStructure;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
@RestController
public class ProductController {

	
	private ProductService productService;
	
	@PostMapping(value="product/saveProduct")
	public Product saveProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	
	}
	@Operation(description = "The endpoint is used o fetch the product based on the ID", responses = {
					@ApiResponse(responseCode = "200", description = "Product found"),
					@ApiResponse(responseCode = "404", description = "product not found by given Id", content = {
							@Content(schema = @Schema(implementation = ErrorStructure.class)) }) })
	
	@PutMapping(value="product/updateProduct")
	public ResponseEntity<ResponseStructure<Product>>findProduct(@PathVariable int productId){
		return productService.findProduct(productId);
	}
	
	@DeleteMapping(value="product/deleteProduct")
	public Product deleteProduct(@RequestParam int productId) {
		return productService.deleteProduct(productId);
		
	}
	
	@GetMapping(value="product/findById")
	public Product findById(@RequestParam int productId) {
		return productService.findById(productId);
		
	}
	
	@GetMapping(value="product/findAll")
	public List<Product> findAllProduct() {
		return productService.findAllProduct();
		
	}
	
	
	
	
}
