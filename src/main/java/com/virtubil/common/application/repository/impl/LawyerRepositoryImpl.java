/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtubil.common.application.repository.impl;

import com.virtubil.common.application.repository.LawyerRepository;
import com.virtubil.common.application.beans.Lawyer;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Janadhi Nanayakkara
 */
@Repository
public class LawyerRepositoryImpl implements LawyerRepository{

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void addLawyer(Lawyer lawyer) throws DataAccessException {
        System.out.println("CALLED repository/////////////////////////");
        sessionFactory.getCurrentSession().saveOrUpdate(lawyer);
    }
    
    @Override
    public List<Lawyer> getAllLawyers() throws DataAccessException {
        return (List<Lawyer>) sessionFactory.
                getCurrentSession()
                .createCriteria(Lawyer.class)
                .setMaxResults(100)
                .list();
    }

    @Override
    public boolean isUserNameExist(String userName) throws DataAccessException {
        System.out.println("check....................========================.................");
        boolean exist=false;
        Lawyer lawyer = (Lawyer) sessionFactory
                .getCurrentSession()
                .createSQLQuery("select * from Lawyer where userName=:lname")
                .addEntity(Lawyer.class)
                .setParameter("lname", userName)
                .uniqueResult();
        if(lawyer!=null){
            exist= true;
        }
        return exist;
    }

    @Override
    public Lawyer getLawyer(String userName) throws DataAccessException {
        System.out.println("check getLawyer....................========================.................");
        return (Lawyer) sessionFactory
                .getCurrentSession()
                .createSQLQuery("select * from Lawyer where userName=:lname")
                .addEntity(Lawyer.class)
                .setParameter("lname", userName)
                .uniqueResult();
    }

    
    
}
