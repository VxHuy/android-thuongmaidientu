package bookstore.android.com.bookstore.models;

import java.util.ArrayList;

/**
 * Created by vxhuy176 on 05/12/2016.
 */

public class Categories {
    private int id;
    private ArrayList<Books> listBooks = new ArrayList<>();
    private String name;
    private String time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Books> getListBooks() {
        return listBooks;
    }

    public void setListBooks(ArrayList<Books> listBooks) {
        this.listBooks = listBooks;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
