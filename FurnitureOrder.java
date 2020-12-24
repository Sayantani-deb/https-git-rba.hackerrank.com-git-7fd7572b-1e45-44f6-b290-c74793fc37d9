package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class FurnitureOrder implements FurnitureOrderInterface {
	/**
	 * TODO: Create a map of Furniture items to order quantities
	 */
	Map<Furniture, Integer> furnitureMap = new HashMap<Furniture, Integer>();

	/**
	 * Initialize a new mapping of Furniture types to order quantities.
	 */
	FurnitureOrder(Map<Furniture, Integer> furnitureMap) {
		this.furnitureMap = furnitureMap;
	}

	public void addToOrder(final Furniture type, final int furnitureCount) {
		furnitureMap.put(type, furnitureCount);
	}

	public HashMap<Furniture, Integer> getOrderedFurniture() {
		return (HashMap<Furniture, Integer>) furnitureMap;
	}

	public float getTotalOrderCost() {
		float count = 0.0f;
		Set<Furniture> furnitureSet = furnitureMap.keySet();
		for (Furniture f : furnitureSet) {
			count = Float.sum(count, f.cost());
		}
		return count;
	}

	public int getTypeCount(Furniture type) {
		return furnitureMap.get(type);
	}

	public float getTypeCost(Furniture type) {
		return type.cost();
	}

	public int getTotalOrderQuantity() {
		Set<Furniture> furnitureSet = furnitureMap.keySet();
		int val = 0;
		for (Furniture f : furnitureSet) {
			val = val + furnitureMap.get(f);
		}
		return val;
	}
}