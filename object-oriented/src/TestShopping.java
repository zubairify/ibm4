import com.ibm.shop.Product;
import com.ibm.shop.ShoppingCart;

public class TestShopping {

	public static void main(String[] args) {
		ShoppingCart mycart = new ShoppingCart();
		Product p1 = new Product("iPhone 12", 54000, 4);
		Product p2 = new Product("iPad Mini", 39000, 5);
		
		mycart.addToCart(p1);
		mycart.addToCart(p2);
		mycart.addToCart(new Product("iWatch 7", 32000, 3));
		
		mycart.checkout();
		
	}
}
