/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtubil.common.application.service.impl;

import com.virtubil.common.application.repository.LawyerRepository;
import com.virtubil.common.application.service.LawyerService;
import com.virtubil.common.application.beans.Lawyer;
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
public class LawyerServiceImpl implements LawyerService{
    
    @Autowired
    private LawyerRepository lawyerRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
    public void addLawyer(Lawyer lawyer) throws DataAccessException {
        System.out.println("CALLED ServiceImpl========================");
        lawyerRepository.addLawyer(lawyer);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = true)
    public List<Lawyer> getAllLawyers() throws DataAccessException {
        return lawyerRepository.getAllLawyers();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = true)
    public boolean isUserNameExist(String userName) throws DataAccessException {
      return lawyerRepository.isUserNameExist(userName);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = true)
    public Lawyer getLawyer(String userName) throws DataAccessException {
        return lawyerRepository.getLawyer(userName);
    }
    
}
