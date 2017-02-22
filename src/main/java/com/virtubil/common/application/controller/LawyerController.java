/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtubil.common.application.controller;

import com.virtubil.common.application.service.LawyerService;
import com.virtubil.common.application.beans.Lawyer;
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
public class LawyerController {

    @Autowired
    private LawyerService lawyerService;

    @RequestMapping(value = {"/lawyer/add"}, method = RequestMethod.POST)
    public ModelAndView addLawyer(HttpServletRequest request, HttpSession userSession) {
        System.out.println("CALLED controller------------------------");
        String userName = request.getParameter("user_name");

        System.out.println("username///////////////////" + userName);
        String password = request.getParameter("pw");
        String firstName = request.getParameter("first_name");
        String lastName = request.getParameter("last_name");
        String mobile = request.getParameter("mobile");

        Lawyer lawyer = new Lawyer();
        lawyer.setFirstName(firstName);
        lawyer.setLastName(lastName);
        lawyer.setUserName(userName);
        lawyer.setPassword(password);
        lawyer.setMobile(mobile);

        if (lawyerService.isUserNameExist(userName)) {
            request.setAttribute("result", "User Already added");
            System.out.println("Already exists................................");
        } else {
            lawyerService.addLawyer(lawyer);
            request.setAttribute("result", "Added Successfully");
        }

        ModelAndView view = new ModelAndView();
        view.setViewName("login");
        return view;
    }

    @RequestMapping(value = {"/lawyer/login"}, method = RequestMethod.POST)
    public ModelAndView getLawyer(HttpServletRequest request, HttpSession userSession) {
        System.out.println("CALLED controller Login------------------------");

        String userName = request.getParameter("user_name");
        String password = request.getParameter("pw");

        if (((userName == null) || (password == null)) || (userName.isEmpty() || password.isEmpty())) {
            request.setAttribute("$error", "Please fill required fields !");
            return new ModelAndView("login");
        } else {
            ModelAndView view = new ModelAndView();
            Lawyer lawyer = lawyerService.getLawyer(userName);

            if (lawyer != null) {
                System.out.println("CALLED controller Login(Lawyer exists :)....)------------------------" + lawyer.getFirstName() + " " + lawyer.getLastName());
                if (lawyer.getPassword().equals(password)) {
                    userSession.setAttribute("$LoggedLawyer", lawyer);
                    request.setAttribute("$result", "Successfully logged in");
                    view.setViewName("home");
                    return view;
                } else {
                    request.setAttribute("$result", "Please check your Password");
                    view.setViewName("login");
                    return view;
                }
            } else {
                System.out.println("CALLED controller Login(Lawyer doesn't exists :(....)------------------------");
                request.setAttribute("$userNotFound", "Please check your Username and Password");
                view.setViewName("login");
                return view;
            }
        }

    }
}
