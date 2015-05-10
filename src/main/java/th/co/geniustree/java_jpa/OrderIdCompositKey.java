/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.java_jpa;

/**
 *
 * @author BestKung
 */
public class OrderIdCompositKey {
    
    private int ckPid;
    private int ckOid;

    public OrderIdCompositKey() {
    }

    public OrderIdCompositKey(int ckPid, int ckOid) {
        this.ckPid = ckPid;
        this.ckOid = ckOid;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + this.ckPid;
        hash = 41 * hash + this.ckOid;
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
        final OrderIdCompositKey other = (OrderIdCompositKey) obj;
        if (this.ckPid != other.ckPid) {
            return false;
        }
        if (this.ckOid != other.ckOid) {
            return false;
        }
        return true;
    }

    
    
    
    
}
