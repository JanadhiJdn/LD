/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtubil.common.application.repository.impl;

import com.virtubil.common.application.beans.Client;
import com.virtubil.common.application.repository.ClientRepository;
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
public class ClientRepositoryImpl implements ClientRepository{
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addClient(Client client) throws DataAccessException {
        System.out.println("CALLED repository/////////////////////////");
        sessionFactory.getCurrentSession().saveOrUpdate(client);
    }

    @Override
    public List<Client> getAllClients() throws DataAccessException {
        return (List<Client>) sessionFactory.
                getCurrentSession()
                .createCriteria(Client.class)
                .setMaxResults(100)
                .list();
    }

    @Override
    public void editClient(Client client, int id) throws DataAccessException {
        sessionFactory
                .getCurrentSession()
                .createSQLQuery("update client SET firstName=:fn, lastName=:ln, address=:ad, mobile=:mob WHERE clientID=:id")
                .addEntity(Client.class)
                .setParameter("fn", client.getFirstName())
                .setParameter("ln", client.getLastName())
                .setParameter("ad", client.getAddress())
                .setParameter("mob", client.getMobile())
                .setParameter("id", id)
                .executeUpdate();
    }
}
