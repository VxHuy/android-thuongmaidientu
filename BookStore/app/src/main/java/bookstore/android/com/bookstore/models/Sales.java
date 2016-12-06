package bookstore.android.com.bookstore.models;

import java.util.ArrayList;

/**
 * Created by vxhuy176 on 05/12/2016.
 */

public class Sales {
    private int id;
    private ArrayList<Books> listBooks = new ArrayList<>();
    private String timeBegin;

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

    public String getTimeBegin() {
        return timeBegin;
    }

    public void setTimeBegin(String timeBegin) {
        this.timeBegin = timeBegin;
    }
}
