package bookstore.android.com.bookstore.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vxhuy176 on 05/12/2016.
 */

public class Books {
    private int id;
    private String title;
    private Authors author;
    private String status;
    private Categories category;
    private ArrayList<Images> listImages;
    private ArrayList<CustomerReviews> listReviews;
    private float price;
    private float sale;
    private String language;
    private String discription;
    private int countViews;
    private float rateAverage;
    private int quantityBuy;
    private String type;
    private String time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Authors getAuthor() {
        return author;
    }

    public void setAuthor(Authors author) {
        this.author = author;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }

    public ArrayList<Images> getListImages() {
        return listImages;
    }

    public void setListImages(ArrayList<Images> listImages) {
        this.listImages = listImages;
    }

    public ArrayList<CustomerReviews> getListReviews() {
        return listReviews;
    }

    public void setListReviews(ArrayList<CustomerReviews> listReviews) {
        this.listReviews = listReviews;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getSale() {
        return sale;
    }

    public void setSale(float sale) {
        this.sale = sale;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public int getCountViews() {
        return countViews;
    }

    public void setCountViews(int countViews) {
        this.countViews = countViews;
    }

    public float getRateAverage() {
        return rateAverage;
    }

    public void setRateAverage(float rateAverage) {
        this.rateAverage = rateAverage;
    }

    public int getQuantityBuy() {
        return quantityBuy;
    }

    public void setQuantityBuy(int quantityBuy) {
        this.quantityBuy = quantityBuy;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
