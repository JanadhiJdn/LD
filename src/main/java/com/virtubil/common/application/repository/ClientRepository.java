/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtubil.common.application.repository;

import com.virtubil.common.application.beans.Client;
import java.util.List;
import org.springframework.dao.DataAccessException;

/**
 *
 * @author Janadhi Nanayakkara
 */
public interface ClientRepository {

    public void addClient(Client client) throws DataAccessException;
    public List<Client> getAllClients() throws DataAccessException;
    
}
