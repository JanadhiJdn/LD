/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtubil.common.application.config;

import java.util.Locale;
import java.util.Properties;
import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 *
 * @author Chathura madushan
 */
@EnableWebMvc
@Configuration
@ComponentScan({"com.virtubil.common.application"})
@PropertySources({
    @PropertySource("classpath:/properties/db/dbconfig.properties")
})
@EnableTransactionManagement
public class AppConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private ConfigurationsController configurationsController;

    /**
     *
     * @return
     */
    private ConfigurationsController getConfigurationsController() {
        return (this.configurationsController instanceof ConfigurationsController) ? this.configurationsController : null;
    }

    /**
     *
     * @return
     */
    @Bean
    public SessionFactory sessionFactory() {
        LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(getDataSource());
        builder
                .scanPackages("com.virtubil.common.application")
                .addProperties(getHibernateProperties());
        return builder.buildSessionFactory();
    }

    /**
     *
     * @return
     */
    @Bean(name = "dataSource")
    public BasicDataSource getDataSource() {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName(getConfigurationsController().getMysqlDriver());
        basicDataSource.setUrl(
                getConfigurationsController().getDbURL()
                + getConfigurationsController().getDbIP() + ":"
                + getConfigurationsController().getDbport() + "/"
                + getConfigurationsController().getDbname()
        );
        basicDataSource.setUsername(getConfigurationsController().getDbuser());
        basicDataSource.setPassword(getConfigurationsController().getDbpasswd());
        return basicDataSource;
    }

    /**
     *
     * @return
     */
    private Properties getHibernateProperties() {
        return new Properties() {
            {
                setProperty("hibernate.format_sql", getConfigurationsController().getPropHibernateFormatSQL());
                setProperty("hibernate.show_sql", getConfigurationsController().getPropHibernateShowSQL());
                setProperty("hibernate.hbm2ddl.auto", getConfigurationsController().getPropHibernateDBCreate());
                setProperty("hibernate.dialect", getConfigurationsController().getPropHibernateDialect());
                //c3p0 connection pool properties
                setProperty("hibernate.c3p0.min_size", getConfigurationsController().getPropHibernateC3P0MinSize());
                setProperty("hibernate.c3p0.max_size", getConfigurationsController().getPropHibernateC3P0MaxSize());
                setProperty("hibernate.c3p0.acquire_increment", getConfigurationsController().getPropHibernateC3P0AcquireIncrement());
                setProperty("hibernate.c3p0.idle_test_period", getConfigurationsController().getPropHibernateC3P0IdleRestPeriod());
                setProperty("hibernate.c3p0.max_statements", getConfigurationsController().getPropHibernateC3P0MaxStatements());
                setProperty("hibernate.c3p0.timeout", getConfigurationsController().getPropHibernateC3P0Timeout());
            }
        };
    }

    /**
     *
     * @return
     */
    @Bean
    public HibernateTransactionManager txManager() {
        return new HibernateTransactionManager(sessionFactory());
    }

    /**
     *
     * @return Access dbconfig.properties file content to resolve ${} in @Value.
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    /**
     *
     * @return
     */
    @Bean
    public CookieLocaleResolver localeResolver() {
        CookieLocaleResolver localeResolver = new CookieLocaleResolver();
        localeResolver.setDefaultLocale(Locale.ENGLISH);
        localeResolver.setCookieName("ft_lang");
        localeResolver.setCookieMaxAge(3600);
        return localeResolver;
    }

    /**
     *
     * @return
     */
    @Bean
    public LocaleChangeInterceptor localeInterceptor() {
        LocaleChangeInterceptor interceptor = new LocaleChangeInterceptor();
        interceptor.setParamName("lang");
        return interceptor;
    }

    /**
     *
     * @return
     */
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver view = new InternalResourceViewResolver();
        view.setViewClass(JstlView.class);
        view.setPrefix("/WEB-INF/jsp/");
        view.setSuffix(".jsp");
        return view;
    }

}
