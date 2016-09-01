
	import java.util.Collections;
import java.util.HashMap;
	import java.util.Map;

	public class Initialize {
		Map<String, Integer> QuantityMap = Collections.synchronizedMap(new HashMap<String, Integer>()); 
		Map<String, String> LocationMap=new HashMap<String, String>();
		 Initialize()
		{
	//map for product locations
		
			QuantityMap.put("Soaps",200);
			QuantityMap.put("Shampoos",250);
			QuantityMap.put("Conditioners",300);
			QuantityMap.put("Toothpastes",300);
			QuantityMap.put("Facewashes",500);
			
		
		
			LocationMap.put("Soaps","Warehouse1-Level1");
			LocationMap.put("Shampoos","Warehouse1-Level2");
			LocationMap.put("Conditioners","Warehouse2-Level1");
			LocationMap.put("Toothpastes","Warehouse2-Level2");
			LocationMap.put("Facewashes","Warehouse5");
		
		}
		String getLocation(String productId) 
		{
		String level=LocationMap.get(productId);
		return level;
		}
		int getProduct(String productId) 
		{
		int product=QuantityMap.get(productId);
		return product;
		}
		
	}



