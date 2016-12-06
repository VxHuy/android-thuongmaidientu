package bookstore.android.com.bookstore.models;

import java.util.ArrayList;

/**
 * Created by vxhuy176 on 06/12/2016.
 */

public class Types {
    private int id;
    private String Name;
    private ArrayList<Books> listBooks = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ArrayList<Books> getListBooks() {
        return listBooks;
    }

    public void setListBooks(ArrayList<Books> listBooks) {
        this.listBooks = listBooks;
    }
}
