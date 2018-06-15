package com.rbpd.core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.rbpd.entity.AuditAwareEntity;

@Entity
@Table(name = "product")
public class Product extends AuditAwareEntity {
	
	private static final long serialVersionUID = 7524825636283805317L;

	@Id
	@Column(name = "product_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;
	
	@Column(name = "product_name", nullable = false)
	private String productName;
	
	@Column(name = "product_type", nullable = false)
	private Integer productType;
	
	@Column(name = "product_desc", nullable = false)
	private String productDescription;
	
	@Column(name = "quantity_in_stock", nullable = false)
	private Integer quanityInStock;
	
	@Column(name = "cost_price", nullable = false)
	private Double buyPrice;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getProductType() {
		return productType;
	}

	public void setProductType(Integer productType) {
		this.productType = productType;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Integer getQuanityInStock() {
		return quanityInStock;
	}

	public void setQuanityInStock(Integer quanityInStock) {
		this.quanityInStock = quanityInStock;
	}

	public Double getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(Double buyPrice) {
		this.buyPrice = buyPrice;
	}

}
