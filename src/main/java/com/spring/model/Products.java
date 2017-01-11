package com.spring.model;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table
public class Products implements Serializable  {
	@Id
	@Column(name="id") 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Transient
	private MultipartFile productImage;

	public MultipartFile getProductImage() {
		return productImage;
	}

	public void setProductImage(MultipartFile productImage) {
		this.productImage = productImage;
	}
	
	@NotEmpty(message="Product Name Is Mandatory")
	private String name;
	
	@NotEmpty(message="Category Is Mandatory")
	String category;
	
	@NotNull(message="Price Is Mandatory")
	int price;
	
	@NotEmpty(message="Product Description Is Mandatory")
	String description;
	
	@NotEmpty(message="Product Status Is Mandatory")
	String status;

	
	

	public Products() {
		super();
	}

	public Products(int id, String name, String category, int price, String description, String status) {
		//super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.description = description;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String toString(){
		return "id="+id+", name="+name+", category="+category+", Price="+price+", Description="+description+", Status="+status;
	}
}
