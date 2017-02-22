/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtubil.common.application.controller;

import com.virtubil.common.application.beans.Client;
import com.virtubil.common.application.service.ClientService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Janadhi Nanayakkara
 */
@Controller
public class ClientController {
    @Autowired
    private ClientService clientService;
    
    @RequestMapping(value = {"/client/add"}, method = RequestMethod.POST)
    public ModelAndView addClient(HttpServletRequest request, HttpSession userSession) {
        System.out.println("CALLED Client controller(addClient)------------------------");
        
        String firstName = request.getParameter("first_name");
        String lastName = request.getParameter("last_name");
        String mobile = request.getParameter("mobile");
        String address = request.getParameter("address");

        Client client=new Client();
        client.setFirstName(firstName);
        client.setLastName(lastName);
        client.setMobile(mobile);
        client.setAddress(address);
        
        if ( ((firstName == null) || (lastName == null) || (mobile == null) || (address == null)) || (firstName.isEmpty() || lastName.isEmpty()|| mobile.isEmpty()|| address.isEmpty())) {
            request.setAttribute("$error", "Please fill required fields !");
            return new ModelAndView("addClient");
        } else {
            clientService.addClient(client);
            request.setAttribute("$result", "Added Successfully");
            return new ModelAndView("addClient");
        }
    }
    
    @RequestMapping(value = {"/client/view"}, method = RequestMethod.POST)
    public ModelAndView getAllClients(HttpServletRequest request, HttpSession userSession) {
        ModelAndView view = new ModelAndView();
        List<Client> clientList = clientService.getAllClients();
        if(clientList!=null){
            int allClients = 0;
            for (Client client : clientList) {
                allClients++;
                System.out.println(client.getFirstName() + " " + client.getLastName());
            }
            System.out.println("All Clients=" + allClients);
            request.setAttribute("$clientList", clientList);
        }else{
            request.setAttribute("$error", "No clients exists...!!!");
        }
        
        view.setViewName("viewClients");
        return view;
    }
}

