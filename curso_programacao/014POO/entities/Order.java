package entities;

import java.util.Date;

public class Order {
    
    private Date date;
    private Product5 product;

    public Order(Date date, Product5 product) {
        this.date = date;
        this.product = product;
        this.product.name = "TV";
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Product5 getProduct() {
        return product;
    }
    public void setProduct(Product5 product) {
        this.product = product;
    }
}
