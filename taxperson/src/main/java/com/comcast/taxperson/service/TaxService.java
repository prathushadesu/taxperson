package com.comcast.taxperson.service;

import com.comcast.taxperson.dto.Item;

public interface TaxService {

	public Item computeTotalCostWithTax(Item item);

}
