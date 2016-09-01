
public abstract class Main implements InventoryManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PickingResult pick=new PickingResult();
		RestockingResult rick=new RestockingResult();
		pick.pickProduct("Facewashes", 20);
		rick.restockProduct("Facewashes", 100);
	}

}
