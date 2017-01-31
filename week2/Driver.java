public class Driver {

	private Cart testCart;

	/**
	 * 
	 * @param args
	 */
	public void main(String[] args) {

		CartItem item1= new CartItem("Orange", 1);
		Cart c1 = new Cart(1, item1);
		c1.printCart();
	}

}
