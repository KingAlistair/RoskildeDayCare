package com.teletearbies.roskildedaycare.entity;

import javax.persistence.*;

@Entity
@Table(name = "children")
public class Children {
        @Id
        //ID COLUMN WILL BE GENERATED AUTOMATICALLY
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        //nullable = false - means ITS REQUIRED
        @Column(nullable = false, unique = false, length = 45)
        private String name;

        @Column(length = 45, nullable = false, name = "address")
        private String address;
        @Column(length = 45, nullable = false, name = "phone_number")
        private String phoneNumber;

        public Children(String name, String address, String phoneNumber) {
                this.name = name;
                this.address = address;
                this.phoneNumber = phoneNumber;
        }

        public Children(){

        }

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getAddress() {
                return address;
        }

        public void setAddress(String address) {
                this.address = address;
        }

        public String getPhoneNumber() {
                return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
        }
}
