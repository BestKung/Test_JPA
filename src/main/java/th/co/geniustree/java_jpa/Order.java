/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.java_jpa;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author BestKung
 */
@Entity
@Table(name = "Order")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Oid")
    private int Order_id;

    @Column(name = "Odate")
    private Date Order_date;

    @OneToMany
    private List<OrderItem> OrderItem;

    public Order() {
    }

    public List<OrderItem> getOrderItem() {
        return OrderItem;
    }

    public void setOrderItem(List<OrderItem> OrderItem) {
        this.OrderItem = OrderItem;
    }

    public Order(int Order_id, Date Order_date, List<OrderItem> OrderItem) {
        this.Order_id = Order_id;
        this.Order_date = Order_date;
        this.OrderItem = OrderItem;
    }

    public int getOrder_id() {
        return Order_id;
    }

    public void setOrder_id(int Order_id) {
        this.Order_id = Order_id;
    }

    public Date getOrder_date() {
        return Order_date;
    }

    public void setOrder_date(Date Order_date) {
        this.Order_date = Order_date;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.Order_id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Order other = (Order) obj;
        return true;
    }

}
