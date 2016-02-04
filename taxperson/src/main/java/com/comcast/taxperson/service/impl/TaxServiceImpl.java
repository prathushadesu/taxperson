package com.comcast.taxperson.service.impl;

import com.comcast.taxperson.constants.Tax;
import com.comcast.taxperson.dto.Item;
import com.comcast.taxperson.enums.ItemType;
import com.comcast.taxperson.service.TaxService;

public class TaxServiceImpl implements TaxService {

	public Item computeTotalCostWithTax(Item item) {
		if (null != item && null != item.getCost() && null != item.getItemType()) {
			Double itemCost = item.getCost();
			Float itemTax = Tax.ITEM_TYPE_TAX.get(item.getItemType());
			Double totalCost = itemCost + (itemTax * itemCost / 100.0f);
			item.setCostWithTax(totalCost);
		}
		return item;
	}

	public static void main(String[] args) {
		TaxServiceImpl taxService = new TaxServiceImpl();
		Item item = new Item(100.0, ItemType.LUXURY);
		System.out.println(taxService.computeTotalCostWithTax(item).getCostWithTax());
		item.setItemType(ItemType.NECESSITY);
		item.setCostWithTax(null);
		System.out.println(taxService.computeTotalCostWithTax(item).getCostWithTax());
	}
}
