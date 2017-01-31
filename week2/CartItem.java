public class CartItem {



String itemName;
int quantity;

	public CartItem(String n, int q) {		
		itemName = n;
		quantity = q;
	}

	public void print(){
		System.out.println("Item: " + itemName + ":\t" + quantity );		
	}

}
