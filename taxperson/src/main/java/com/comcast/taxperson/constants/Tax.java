package com.comcast.taxperson.constants;

import java.util.HashMap;
import java.util.Map;

import com.comcast.taxperson.enums.ItemType;

public final class Tax {

	public static final Map<ItemType, Float> ITEM_TYPE_TAX = new HashMap<ItemType, Float>();

	static {
		ITEM_TYPE_TAX.put(ItemType.LUXURY, 9.0f);
		ITEM_TYPE_TAX.put(ItemType.NECESSITY, 1.0f);
	}

}
