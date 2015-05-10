/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.java_jpa;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author BestKung
 */
@Entity
@Table(name = "OrderItem")
@IdClass(OrderIdCompositKey.class)
public class OrderItem implements Serializable {

    @Id
    @Column
    private int ckPid;

    @Id
    @Column
    private int ckOid;

    @ManyToOne
    @JoinColumn(name = "Oid")
    private int Oid;

    @ManyToOne
    @JoinColumn(name = "Pid")
    private int Pid;

    public OrderItem() {
    }

    public OrderItem(int ckPid, int ckOid, int Oid, int Pid) {
        this.ckPid = ckPid;
        this.ckOid = ckOid;
        this.Oid = Oid;
        this.Pid = Pid;
    }

    public int getCkPid() {
        return ckPid;
    }

    public void setCkPid(int ckPid) {
        this.ckPid = ckPid;
    }

    public int getCkOid() {
        return ckOid;
    }

    public void setCkOid(int ckOid) {
        this.ckOid = ckOid;
    }

    public int getOid() {
        return Oid;
    }

    public void setOid(int Oid) {
        this.Oid = Oid;
    }

    public int getPid() {
        return Pid;
    }

    public void setPid(int Pid) {
        this.Pid = Pid;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.ckPid;
        hash = 37 * hash + this.ckOid;
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
        final OrderItem other = (OrderItem) obj;
        if (this.ckPid != other.ckPid) {
            return false;
        }
        if (this.ckOid != other.ckOid) {
            return false;
        }
        return true;
    }

    

   

}
