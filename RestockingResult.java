
public class RestockingResult extends Initialize{

	public void restockProduct(String productId, int amountToRestock)
	{
		if(QuantityMap.get(productId) != null && QuantityMap.containsKey(productId)&& amountToRestock>0)
		{
			if(QuantityMap.get(productId)+amountToRestock<=1000) //Space limit in warehouse=1000 products
				{
					QuantityMap.put(productId, QuantityMap.get(productId)+amountToRestock);//Updating the stock in map
					System.out.println("Restock Order for "+productId+" placed. Location: "+getLocation(productId));
					System.out.println(QuantityMap);
				}
			else
			{
				System.out.println("Please enter a lesser value. Yor value exceeds the space at "+getLocation(productId));
			}
		}
		else
		{
			System.out.println("NO SUCH ITEM OR INVALID QUANTITY. Please check the value you entered");
		}
		
	}
}
