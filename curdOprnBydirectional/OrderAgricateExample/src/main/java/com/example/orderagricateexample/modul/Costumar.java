package com.example.orderagricateexample.modul;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
public class Costumar implements Serializable{

        private static final long serialVersionUID = 255274178852963684L;
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String fullName;
        private String email;

        @OneToMany(cascade = CascadeType.ALL)
        private List<Order> orderlist;

        public Costumar() {
        }

        public Costumar(Long id, String fullName, String email, List<Order> orderlist) {
                this.id = id;
                this.fullName = fullName;
                this.email = email;
                this.orderlist = orderlist;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getFullName() {
                return fullName;
        }

        public void setFullName(String fullName) {
                this.fullName = fullName;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public List<Order> getOrderlist() {
                return orderlist;
        }

        public void setOrderlist(List<Order> orderlist) {
                this.orderlist = orderlist;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Costumar costumar = (Costumar) o;
                return Objects.equals(id, costumar.id) && Objects.equals(fullName, costumar.fullName) && Objects.equals(email, costumar.email) && Objects.equals(orderlist, costumar.orderlist);
        }

        @Override
        public int hashCode() {
                return Objects.hash(id, fullName, email, orderlist);
        }

        @Override
        public String toString() {
                return "Costumar{" +
                        "id=" + id +
                        ", fullName='" + fullName + '\'' +
                        ", email='" + email + '\'' +
                        ", orderlist=" + orderlist +
                        '}';
        }
}
