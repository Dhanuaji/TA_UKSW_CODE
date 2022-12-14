/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tugas_akhir.TA.Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author danu_prat
 */
@Entity
@Table(name = "products")
@XmlRootElement
@NamedQueries({
     @NamedQuery(name = "Products.findAll", query = "SELECT p FROM Products p"),
     @NamedQuery(name = "Products.findById", query = "SELECT p FROM Products p WHERE p.id = :id"),
     @NamedQuery(name = "Products.findByName", query = "SELECT p FROM Products p WHERE p.name = :name"),
     @NamedQuery(name = "Products.findByStock", query = "SELECT p FROM Products p WHERE p.stock = :stock")})
public class Products implements Serializable {

     private static final long serialVersionUID = 1L;
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Basic(optional = false)
     @Column(name = "id")
     private Integer id;
     @Basic(optional = false)
     @Column(name = "name")
     private String name;
     @Basic(optional = false)
     @Column(name = "stock")
     private int stock;
     @Basic(optional = false)
     @Lob
     @Column(name = "image")
     private byte[] image;
     @JoinColumn(name = "type", referencedColumnName = "id")
     @ManyToOne(optional = false, fetch = FetchType.LAZY)
     private Types type;
     @JoinColumn(name = "event", referencedColumnName = "id")
     @ManyToOne(optional = false, fetch = FetchType.LAZY)
     private Events event;

     public Products() {
     }

     public Products(Integer id) {
          this.id = id;
     }

     public Products(Integer id, String name, int stock, byte[] image) {
          this.id = id;
          this.name = name;
          this.stock = stock;
          this.image = image;
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

     public int getStock() {
          return stock;
     }

     public void setStock(int stock) {
          this.stock = stock;
     }

     public byte[] getImage() {
          return image;
     }

     public void setImage(byte[] image) {
          this.image = image;
     }

     public Types getType() {
          return type;
     }

     public void setType(Types type) {
          this.type = type;
     }

     public Events getEvent() {
          return event;
     }

     public void setEvent(Events event) {
          this.event = event;
     }

     @Override
     public int hashCode() {
          int hash = 0;
          hash += (id != null ? id.hashCode() : 0);
          return hash;
     }

     @Override
     public boolean equals(Object object) {
          // TODO: Warning - this method won't work in the case the id fields are not set
          if (!(object instanceof Products)) {
               return false;
          }
          Products other = (Products) object;
          if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
               return false;
          }
          return true;
     }

     @Override
     public String toString() {
          return "com.tugas_akhir.TA.Entities.Products[ id=" + id + " ]";
     }
     
}
