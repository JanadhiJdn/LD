/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtubil.common.application.service.impl;

import com.virtubil.common.application.beans.Client;
import com.virtubil.common.application.repository.ClientRepository;
import com.virtubil.common.application.service.ClientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Janadhi Nanayakkara
 */
@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    private ClientRepository clientRepository;
    
    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
    public void addClient(Client client) throws DataAccessException {
        System.out.println("CALLED ServiceImpl========================");
        clientRepository.addClient(client);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = true, isolation = Isolation.READ_COMMITTED)
    public List<Client> getAllClients() throws DataAccessException {
        System.out.println("CALLED ServiceImpl========================");
        return clientRepository.getAllClients();
    }
 
}
