/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtubil.common.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Chathura madushan
 */
@Controller
public class IndexController {

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public ModelAndView showindex() {
        return new ModelAndView("login");
    }
    @RequestMapping(value = {"/signup"}, method = RequestMethod.GET)
    public ModelAndView showSignup() {
        return new ModelAndView("signup");
    }
    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    public ModelAndView showLogin() {
        return new ModelAndView("login");
    }
    @RequestMapping(value = {"/home"}, method = RequestMethod.GET)
    public ModelAndView showHome() {
        return new ModelAndView("home");
    }
    @RequestMapping(value = {"/addClient"}, method = RequestMethod.GET)
    public ModelAndView showAddClient() {
        return new ModelAndView("addClient");
    }
    @RequestMapping(value = {"/viewClients"}, method = RequestMethod.GET)
    public ModelAndView showViewClients() {
        return new ModelAndView("viewClients");
    }
    @RequestMapping(value = {"/newjsp"}, method = RequestMethod.GET)
    public ModelAndView shownewjsp() {
        return new ModelAndView("newjsp");
    }
}
