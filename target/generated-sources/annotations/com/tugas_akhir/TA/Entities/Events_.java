package com.tugas_akhir.TA.Entities;

import com.tugas_akhir.TA.Entities.Products;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-12-15T03:55:37", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Events.class)
public class Events_ { 

    public static volatile ListAttribute<Events, Products> productsList;
    public static volatile SingularAttribute<Events, String> name;
    public static volatile SingularAttribute<Events, Integer> id;

}