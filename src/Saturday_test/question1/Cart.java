package Saturday_test.question1;

class Cart {
    private int cartId;
    private String userName;
    private Product product;

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void display() {
        System.out.println("Cart ID: " + cartId);
        System.out.println("User Name: " + userName);
        System.out.println("Product ID: " + product.getProductId());
        System.out.println("Product Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
    }
}