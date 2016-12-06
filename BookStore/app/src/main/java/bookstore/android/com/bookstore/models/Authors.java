package bookstore.android.com.bookstore.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vxhuy176 on 05/12/2016.
 */

public class Authors {
    private int id;
    private String name;
    private String recommend;
    private String contact;
    private String time;
    private ArrayList<Books> listBooks = new ArrayList<>();

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

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ArrayList<Books> getListBooks() {
        return listBooks;
    }

    public void setListBooks(ArrayList<Books> listBooks) {
        this.listBooks = listBooks;
    }
}
