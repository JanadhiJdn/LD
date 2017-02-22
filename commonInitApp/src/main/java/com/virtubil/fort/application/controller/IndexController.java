/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtubil.fort.application.controller;

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

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public ModelAndView showindex() {
        return new ModelAndView("index");
    }
}
