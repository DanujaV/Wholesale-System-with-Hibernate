package lk.ijse.pos.hibernate.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Orders implements SuperEntity{
    @Id
    private String oId;
    private String date;
    @ManyToOne
    private Customer customer;

    @OneToMany(mappedBy = "orders")
    private List<OrderDetail> orderDetails;



    public Orders() {
    }

    public Orders(String oId, String date, Customer customer) {
        this.oId = oId;
        this.date = date;
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public String getdate() {
        return date;
    }

    public void setdate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "oId='" + oId + '\'' +
                ", date='" + date + '\'' +
                ", customer=" + customer +
                '}';
    }
}
