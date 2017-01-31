public class Cart {

	private CartItem CartItems;
	public int id;	

	public Cart(int idIn, CartItem c) {
		id = idIn;
		CartItems = c;
	}

	public void printCart(){
		System.out.println("Printing Cart " + id);
	}

}
