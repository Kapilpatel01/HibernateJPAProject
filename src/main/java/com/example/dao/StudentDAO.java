package com.example.dao;

import com.example.entity.Student;
import com.example.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.Transaction;

import java.util.List;

public class StudentDAO {
    private EntityManagerFactory entityManagerFactory= JPAUtil.getEmf();

    //create
    public void save(Student student) {
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
        em.close();
    }

    //view
    public Student find(int id){
        EntityManager em1=entityManagerFactory.createEntityManager();
        Student student1=em1.find(Student.class,1);
        em1.close();
        return student1;
        }

    //update
    public void update(int id,String name){
        EntityManager em2=entityManagerFactory.createEntityManager();
        em2.getTransaction().begin();
       Student student2= em2.find(Student.class,1);
       if(student2!=null){
           student2.setName(name);
       }
       em2.getTransaction().commit();
       em2.close();
    }

    // DELETE
    public void delete(int id) {
        EntityManager em3 = entityManagerFactory.createEntityManager();
        em3.getTransaction().begin();
        Student student3 = em3.find(Student.class, id);
        if (student3 != null) {
            em3.remove(student3);
        }
        em3.getTransaction().commit();
        em3.close();
    }


}
