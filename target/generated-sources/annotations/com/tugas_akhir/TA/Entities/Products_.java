package com.tugas_akhir.TA.Entities;

import com.tugas_akhir.TA.Entities.Events;
import com.tugas_akhir.TA.Entities.Types;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-12-15T03:55:37", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Products.class)
public class Products_ { 

    public static volatile SingularAttribute<Products, byte[]> image;
    public static volatile SingularAttribute<Products, String> name;
    public static volatile SingularAttribute<Products, Integer> id;
    public static volatile SingularAttribute<Products, Integer> stock;
    public static volatile SingularAttribute<Products, Types> type;
    public static volatile SingularAttribute<Products, Events> event;

}