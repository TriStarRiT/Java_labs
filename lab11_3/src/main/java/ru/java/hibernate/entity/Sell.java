package ru.java.hibernate.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Entity
@Table(name = "sell", schema = "public", catalog="db3")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Sell {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "customer_id", nullable = false)
    private int customerId;
    @Basic
    @Column(name = "product_id", nullable = false)
    private int productId;

    @Basic
    @Column(name = "price", nullable = false)

    /*public int getId() {return id;}

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sell sell = (Sell) o;
        return id == sell.id && customerId == sell.customerId && productId == sell.productId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customerId, productId);
    }
}
