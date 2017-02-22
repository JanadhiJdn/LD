/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtubil.common.application.repository;

import com.virtubil.common.application.beans.Lawyer;
import java.util.List;
import org.springframework.dao.DataAccessException;

/**
 *
 * @author Janadhi Nanayakkara
 */
public interface LawyerRepository {
    
    public void addLawyer(Lawyer lawyer) throws DataAccessException;
    public List<Lawyer> getAllLawyers() throws DataAccessException;
    public boolean isUserNameExist(String userName) throws DataAccessException;
    public Lawyer getLawyer(String userName) throws DataAccessException;
}
