package bookstore.android.com.bookstore.models;

import java.util.List;

/**
 * Created by vxhuy176 on 05/12/2016.
 */

public class Bills {
    private int id;
    private Users user;
    private Carts cart;
    private String time;
    private CartBooks cartBooks; //biến dùng nếu người dùng mua mà không cho vào trong cart.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Carts getCart() {
        return cart;
    }

    public void setCart(Carts cart) {
        this.cart = cart;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public CartBooks getCartBooks() {
        return cartBooks;
    }

    public void setCartBooks(CartBooks cartBooks) {
        this.cartBooks = cartBooks;
    }
}
