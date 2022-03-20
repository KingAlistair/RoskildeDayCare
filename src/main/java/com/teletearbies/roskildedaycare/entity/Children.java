package com.teletearbies.roskildedaycare.entity;

import javax.persistence.*;
import java.util.Date;

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

        @Column(length = 45, nullable = false, name = "birthdate")
        private Date birthDate;

        public Children(Integer id, String name, Date birthDate) {
                this.id = id;
                this.name = name;
                this.birthDate = birthDate;
        }

        public Children() {

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

        public Date getBirthDate() {
                return birthDate;
        }

        public void setBirthDate(Date birthDate) {
                this.birthDate = birthDate;
        }
}
