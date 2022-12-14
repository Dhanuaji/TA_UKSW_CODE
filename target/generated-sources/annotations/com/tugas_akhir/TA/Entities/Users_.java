package com.tugas_akhir.TA.Entities;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-12-15T03:55:37", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> password;
    public static volatile SingularAttribute<Users, String> fullName;
    public static volatile SingularAttribute<Users, Integer> id;
    public static volatile SingularAttribute<Users, Boolean> isActive;
    public static volatile SingularAttribute<Users, String> username;

}