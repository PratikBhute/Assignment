package com.example.orderagricateexample.modul;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
public class Order implements Serializable
{
    /**
     *
     */
    private static final long serialVersionUID = 255254974123684L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String shipmentAddress;
    private int price;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;

    @ManyToOne(cascade = CascadeType.ALL)
    private Costumar costumar;

    public Order() {
    }

    public Order(Long id, String shipmentAddress, int price, List<OrderItem> orderItems, Costumar costumar) {

        this.id = id;
        this.shipmentAddress = shipmentAddress;
        this.price = price;
        this.orderItems = orderItems;
        this.costumar = costumar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShipmentAddress() {
        return shipmentAddress;
    }

    public void setShipmentAddress(String shipmentAddress) {
        this.shipmentAddress = shipmentAddress;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public Costumar getCostumar() {
        return costumar;
    }

    public void setCostumar(Costumar costumar) {
        this.costumar = costumar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return price == order.price && Objects.equals(id, order.id) && Objects.equals(shipmentAddress, order.shipmentAddress) && Objects.equals(orderItems, order.orderItems) && Objects.equals(costumar, order.costumar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, shipmentAddress, price, orderItems, costumar);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", shipmentAddress='" + shipmentAddress + '\'' +
                ", price=" + price +
                ", orderItems=" + orderItems +
                ", costumar=" + costumar +
                '}';
    }
}