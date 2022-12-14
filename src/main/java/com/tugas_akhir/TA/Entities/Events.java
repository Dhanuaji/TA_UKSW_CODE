/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tugas_akhir.TA.Entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author danu_prat
 */
@Entity
@Table(name = "events")
@XmlRootElement
@NamedQueries({
     @NamedQuery(name = "Events.findAll", query = "SELECT e FROM Events e"),
     @NamedQuery(name = "Events.findById", query = "SELECT e FROM Events e WHERE e.id = :id"),
     @NamedQuery(name = "Events.findByName", query = "SELECT e FROM Events e WHERE e.name = :name")})
public class Events implements Serializable {

     private static final long serialVersionUID = 1L;
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Basic(optional = false)
     @Column(name = "id")
     private Integer id;
     @Basic(optional = false)
     @Column(name = "name")
     private String name;
     @OneToMany(cascade = CascadeType.ALL, mappedBy = "event", fetch = FetchType.LAZY)
     private List<Products> productsList;

     public Events() {
     }

     public Events(Integer id) {
          this.id = id;
     }

     public Events(Integer id, String name) {
          this.id = id;
          this.name = name;
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

     @XmlTransient
     public List<Products> getProductsList() {
          return productsList;
     }

     public void setProductsList(List<Products> productsList) {
          this.productsList = productsList;
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
          if (!(object instanceof Events)) {
               return false;
          }
          Events other = (Events) object;
          if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
               return false;
          }
          return true;
     }

     @Override
     public String toString() {
          return "com.tugas_akhir.TA.Entities.Events[ id=" + id + " ]";
     }
     
}
