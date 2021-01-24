package lk.ijse.pos.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class OrderDetail implements SuperEntity{

    @Id
    @ManyToOne
    private Orders orders;

    @Id
    @ManyToOne
    private Item item;

    private int qty;
    private double unitPrice;

    public OrderDetail() {
    }

    public OrderDetail(Orders orders, Item item, int qty, double unitPrice) {
        this.orders = orders;
        this.item = item;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orders=" + orders +
                ", item=" + item +
                ", qty=" + qty +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
