
package th.co.geniustree.java_jpa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author BestKung
 */
@Entity
@Table(name = "tb_product")
public class Product implements Serializable{
    
    @Id
    @Column(name = "Pid")
    private int Product_id;
   
    @Column(name = "Pname" , nullable = false , length = 100)
    private String Product_name;
   
    @Column(name = "Pprice",nullable = false)
    private int Prodct_price;
    
    @Column(name = "Pqty",nullable = false)
    private int Producr_qty;
    
    @OneToMany
    private List<OrderItem> OrderItem;

    public List<OrderItem> getOrderItem() {
        return OrderItem;
    }

    public void setOrderItem(List<OrderItem> OrderItem) {
        this.OrderItem = OrderItem;
    }
    

    public Product() {
    }

    public Product(int Product_id, String Product_name, int Prodct_price, 
            int Producr_qty, List<OrderItem> OrderItem) {
        this.Product_id = Product_id;
        this.Product_name = Product_name;
        this.Prodct_price = Prodct_price;
        this.Producr_qty = Producr_qty;
        this.OrderItem = OrderItem;
    }

    public int getProduct_id() {
        return Product_id;
    }

    public void setProduct_id(int Product_id) {
        this.Product_id = Product_id;
    }

    public String getProduct_name() {
        return Product_name;
    }

    public void setProduct_name(String Product_name) {
        this.Product_name = Product_name;
    }

    public int getProdct_price() {
        return Prodct_price;
    }

    public void setProdct_price(int Prodct_price) {
        this.Prodct_price = Prodct_price;
    }

    public int getProducr_qty() {
        return Producr_qty;
    }

    public void setProducr_qty(int Producr_qty) {
        this.Producr_qty = Producr_qty;
    }

   

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.Product_id;
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
        final Product other = (Product) obj;
        return true;
    }
    
 }
