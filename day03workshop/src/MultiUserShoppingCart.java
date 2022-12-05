public class MultiUserShoppingCart {
    public static void main(String[] args) {
        System.out.println("Welcome to MultiUser Shopping Cart.");

        ShoppingCartDB cart = new ShoppingCartDB(); // default folder: "db"
        cart.startShell();
    }
}