package com.example.util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {


       private static final EntityManagerFactory emf= Persistence.createEntityManagerFactory("studentPU");

       public static EntityManagerFactory getEmf(){
           return emf;
       }
}
