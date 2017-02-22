/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtubil.common.application.config.core;

import com.virtubil.common.application.config.AppConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 *
 * @author Chathura madushan
 */
public class SpringMvcInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    
    /**
     *
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{AppConfig.class};
    }

    /**
     *
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }

    /**
     *
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
