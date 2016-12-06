package bookstore.android.com.bookstore.models;

import android.view.ViewStructure;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vxhuy176 on 05/12/2016.
 */

public class Users {
    private int id;
    private String name;
    private String email;
    private String password;
    private String address;
    private String phone;
    private String time;
    private ArrayList<Rates> listRate = new ArrayList<>();
    private ArrayList<Views> listView = new ArrayList<>();
    private ArrayList<Bills> listBills = new ArrayList<>();
    private ArrayList<CustomerReviews> listReviews = new ArrayList<>();
    private Carts cart;

    public Carts getCart() {
        return cart;
    }

    public void setCart(Carts cart) {
        this.cart = cart;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ArrayList<Rates> getListRate() {
        return listRate;
    }

    public void setListRate(ArrayList<Rates> listRate) {
        this.listRate = listRate;
    }

    public ArrayList<Views> getListView() {
        return listView;
    }

    public void setListView(ArrayList<Views> listView) {
        this.listView = listView;
    }

    public ArrayList<Bills> getListBills() {
        return listBills;
    }

    public void setListBills(ArrayList<Bills> listBills) {
        this.listBills = listBills;
    }

    public ArrayList<CustomerReviews> getListReviews() {
        return listReviews;
    }

    public void setListReviews(ArrayList<CustomerReviews> listReviews) {
        this.listReviews = listReviews;
    }
}
