package com.comcast.taxperson.dto;

import com.comcast.taxperson.enums.ItemType;

public class Item {

	private Double cost;
	private ItemType itemType;
	private Double costWithTax;

	public Item() {
	};

	public Item(Double cost, ItemType itemType) {
		this.cost = cost;
		this.itemType = itemType;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public ItemType getItemType() {
		return itemType;
	}

	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}

	public Double getCostWithTax() {
		return costWithTax;
	}

	public void setCostWithTax(Double costWithTax) {
		this.costWithTax = costWithTax;
	}

}
