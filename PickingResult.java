import java.util.Map;

public class PickingResult extends Initialize {
	public void pickProduct(String productId, int amountToPick)
	{
		
		System.out.println(QuantityMap);
		if(QuantityMap.get(productId) != null && QuantityMap.containsKey(productId) && amountToPick>0)
		{
		if(amountToPick<=getProduct(productId))//Check if the warehouse has the necessary quantity
			{
				QuantityMap.put(productId, getProduct(productId)-amountToPick); //Updating the stock in map
				System.out.println("Order for "+productId+" placed. Location: "+getLocation(productId));
				System.out.println(QuantityMap);
			}
			else
			{
				System.out.println("Sorry, we only have "+getProduct(productId)+" of "+productId+" in stock.");	
			}
		}
	else
	{//If product is spelled incorrectly or does not exist in Map
		System.out.println("NO SUCH ITEM OR INVALID QUANTITY. Please check the value you entered"); 
	}
	}
}
