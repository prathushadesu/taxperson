package com.comcast.taxperson.service.impl;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.comcast.taxperson.dto.Item;
import com.comcast.taxperson.enums.ItemType;

public class TaxServiceImplTest {

	TaxServiceImpl taxServiceImpl = new TaxServiceImpl();

	@DataProvider
	public Object[][] ValidDataProvider() {

		Object[][] data = new Object[5][2];

		Item item1 = new Item(20.0, ItemType.NECESSITY);
		Item item2 = new Item(30.0, ItemType.LUXURY);
		Item item3 = new Item(40.0, ItemType.NECESSITY);
		Item item4 = new Item(50.0, ItemType.LUXURY);
		Item item5 = new Item(60.0, ItemType.NECESSITY);

		data[0][0] = item1;
		data[0][1] = 20.2;

		data[1][0] = item2;
		data[1][1] = 32.7;

		data[2][0] = item3;
		data[2][1] = 40.4;

		data[3][0] = item4;
		data[3][1] = 54.5;

		data[4][0] = item5;
		data[4][1] = 60.6;

		return data;
	}

	@Test(dataProvider = "ValidDataProvider")
	public void testTaxComputations(Item item, Double costWithTax) {
		Double taxWithCost = taxServiceImpl.computeTotalCostWithTax(item).getCostWithTax();
		Assert.assertEquals(taxWithCost, costWithTax);

	}

	@Test
	public void testNullItemCosts() {
		Item item  = new Item();
		Double taxWithCost = taxServiceImpl.computeTotalCostWithTax(item).getCostWithTax();
		Assert.assertEquals(taxWithCost, null);

	}

}
