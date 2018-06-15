package com.rbpd.core;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "order_detail")
public class OrderDetail {
	
	@Id
	@Column(name = "order_detail_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderDetailId;
	
	@Column(name = "quantity_ordered", nullable = false)
	private Integer quantityOrdered;
	
	@Column(name = "wt_of_product", nullable = false)
	private Double weightOfProduct;
	
	@Column(name = "mrkt_rate", nullable = false)
	private Double marketRate;
	
	@Column(name = "gst", nullable = false)
	private Double gst;
	
	@Column(name = "labourCost", nullable = false)
	private Double labourCost;
	
	@Column(name = "selling_price", nullable = false)
	private Double sellingPrice;
	
	
	@Column(name = "profit", nullable = false)
	private Double profit;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Product product;

	public Long getOrderDetailId() {
		return orderDetailId;
	}

	public void setOrderDetailId(Long orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

	public Integer getQuantityOrdered() {
		return quantityOrdered;
	}

	public void setQuantityOrdered(Integer quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}

	public Double getWeightOfProduct() {
		return weightOfProduct;
	}

	public void setWeightOfProduct(Double weightOfProduct) {
		this.weightOfProduct = weightOfProduct;
	}

	public Double getMarketRate() {
		return marketRate;
	}

	public void setMarketRate(Double marketRate) {
		this.marketRate = marketRate;
	}

	public Double getGst() {
		return gst;
	}

	public void setGst(Double gst) {
		this.gst = gst;
	}

	public Double getLabourCost() {
		return labourCost;
	}

	public void setLabourCost(Double labourCost) {
		this.labourCost = labourCost;
	}

	public Double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(Double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public Double getProfit() {
		return profit;
	}

	public void setProfit(Double profit) {
		this.profit = profit;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}
	