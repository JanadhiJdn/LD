/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtubil.common.application.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Chathura madushan
 */
@Controller
public class ConfigurationsController {

    //Main DB Confs
    @Value("${db.mysql.driver:com.mysql.jdbc.Driver}")
    private String mysqlDriver;

    @Value("${db.mysql.dburl:jdbc:mysql://}")
    private String dbURL;

    @Value("${db.mysql.dbip:localhost}")
    private String dbIP;

    @Value("${db.mysql.dbport:3306}")
    private String dbport;

    @Value("${db.mysql.dbname:diary}")
    private String dbname;

    @Value("${db.mysql.dbuser:root}")
    private String dbuser;

    @Value("${db.mysql.dbpasswd:mysql}")
    private String dbpasswd;

    //Hibernate
    @Value("${prop.hibernate.format_sql}")
    private String propHibernateFormatSQL;

    @Value("${prop.hibernate.show_sql}")
    private String propHibernateShowSQL;

    @Value("${prop.hibernate.hbm2ddl.auto}")
    private String propHibernateDBCreate;

    @Value("${prop.hibernate.dialect}")
    private String propHibernateDialect;

    @Value("${prop.hibernate.c3p0.min_size}")
    private String propHibernateC3P0MinSize;

    @Value("${prop.hibernate.c3p0.max_size}")
    private String propHibernateC3P0MaxSize;

    @Value("${prop.hibernate.c3p0.acquire_increment}")
    private String propHibernateC3P0AcquireIncrement;

    @Value("${prop.hibernate.c3p0.idle_test_period}")
    private String propHibernateC3P0IdleRestPeriod;

    @Value("${prop.hibernate.c3p0.max_statements}")
    private String propHibernateC3P0MaxStatements;

    @Value("${prop.hibernate.c3p0.timeout}")
    private String propHibernateC3P0Timeout;

    private static final Logger logger
            = LoggerFactory.getLogger(ConfigurationsController.class);

    {
        logger.info("Starting application database configurations...");
        logger.info("Database name : " + getDbname());
        logger.info("URL           : " + getDbURL() + getDbIP() + ":" + getDbport());
        logger.info("With user     : " + getDbuser());
        logger.info("Hibernate propHibernateFormatSQL            : " + getPropHibernateFormatSQL());
        logger.info("Hibernate propHibernateShowSQL              : " + getPropHibernateShowSQL());
        logger.info("Hibernate propHibernateDBCreate             : " + getPropHibernateDBCreate());
        logger.info("Hibernate propHibernateDialect              : " + getPropHibernateDialect());
        logger.info("Hibernate propHibernateC3P0MinSize          : " + getPropHibernateC3P0MinSize());
        logger.info("Hibernate propHibernateC3P0MaxSize          : " + getPropHibernateC3P0MaxSize());
        logger.info("Hibernate propHibernateC3P0AcquireIncrement : " + getPropHibernateC3P0AcquireIncrement());
        logger.info("Hibernate propHibernateC3P0IdleRestPeriod   : " + getPropHibernateC3P0IdleRestPeriod());
        logger.info("Hibernate propHibernateC3P0MaxStatements    : " + getPropHibernateC3P0MaxStatements());
        logger.info("Hibernate propHibernateC3P0Timeout          : " + getPropHibernateC3P0Timeout());
        logger.info("Done ! loading configurations...");
    }

    /**
     * @return the mysqlDriver
     */
    public String getMysqlDriver() {
        return mysqlDriver;
    }

    /**
     * @param mysqlDriver the mysqlDriver to set
     */
    public void setMysqlDriver(String mysqlDriver) {
        this.mysqlDriver = mysqlDriver;
    }

    /**
     * @return the dbURL
     */
    public String getDbURL() {
        return dbURL;
    }

    /**
     * @param dbURL the dbURL to set
     */
    public void setDbURL(String dbURL) {
        this.dbURL = dbURL;
    }

    /**
     * @return the dbIP
     */
    public String getDbIP() {
        return dbIP;
    }

    /**
     * @param dbIP the dbIP to set
     */
    public void setDbIP(String dbIP) {
        this.dbIP = dbIP;
    }

    /**
     * @return the dbport
     */
    public String getDbport() {
        return dbport;
    }

    /**
     * @param dbport the dbport to set
     */
    public void setDbport(String dbport) {
        this.dbport = dbport;
    }

    /**
     * @return the dbname
     */
    public String getDbname() {
        return dbname;
    }

    /**
     * @param dbname the dbname to set
     */
    public void setDbname(String dbname) {
        this.dbname = dbname;
    }

    /**
     * @return the dbuser
     */
    public String getDbuser() {
        return dbuser;
    }

    /**
     * @param dbuser the dbuser to set
     */
    public void setDbuser(String dbuser) {
        this.dbuser = dbuser;
    }

    /**
     * @return the dbpasswd
     */
    public String getDbpasswd() {
        return dbpasswd;
    }

    /**
     * @param dbpasswd the dbpasswd to set
     */
    public void setDbpasswd(String dbpasswd) {
        this.dbpasswd = dbpasswd;
    }

    /**
     * @return the propHibernateFormatSQL
     */
    public String getPropHibernateFormatSQL() {
        return propHibernateFormatSQL;
    }

    /**
     * @param propHibernateFormatSQL the propHibernateFormatSQL to set
     */
    public void setPropHibernateFormatSQL(String propHibernateFormatSQL) {
        this.propHibernateFormatSQL = propHibernateFormatSQL;
    }

    /**
     * @return the propHibernateShowSQL
     */
    public String getPropHibernateShowSQL() {
        return propHibernateShowSQL;
    }

    /**
     * @param propHibernateShowSQL the propHibernateShowSQL to set
     */
    public void setPropHibernateShowSQL(String propHibernateShowSQL) {
        this.propHibernateShowSQL = propHibernateShowSQL;
    }

    /**
     * @return the propHibernateDBCreate
     */
    public String getPropHibernateDBCreate() {
        return propHibernateDBCreate;
    }

    /**
     * @param propHibernateDBCreate the propHibernateDBCreate to set
     */
    public void setPropHibernateDBCreate(String propHibernateDBCreate) {
        this.propHibernateDBCreate = propHibernateDBCreate;
    }

    /**
     * @return the propHibernateDialect
     */
    public String getPropHibernateDialect() {
        return propHibernateDialect;
    }

    /**
     * @param propHibernateDialect the propHibernateDialect to set
     */
    public void setPropHibernateDialect(String propHibernateDialect) {
        this.propHibernateDialect = propHibernateDialect;
    }

    /**
     * @return the propHibernateC3P0MinSize
     */
    public String getPropHibernateC3P0MinSize() {
        return propHibernateC3P0MinSize;
    }

    /**
     * @param propHibernateC3P0MinSize the propHibernateC3P0MinSize to set
     */
    public void setPropHibernateC3P0MinSize(String propHibernateC3P0MinSize) {
        this.propHibernateC3P0MinSize = propHibernateC3P0MinSize;
    }

    /**
     * @return the propHibernateC3P0MaxSize
     */
    public String getPropHibernateC3P0MaxSize() {
        return propHibernateC3P0MaxSize;
    }

    /**
     * @param propHibernateC3P0MaxSize the propHibernateC3P0MaxSize to set
     */
    public void setPropHibernateC3P0MaxSize(String propHibernateC3P0MaxSize) {
        this.propHibernateC3P0MaxSize = propHibernateC3P0MaxSize;
    }

    /**
     * @return the propHibernateC3P0AcquireIncrement
     */
    public String getPropHibernateC3P0AcquireIncrement() {
        return propHibernateC3P0AcquireIncrement;
    }

    /**
     * @param propHibernateC3P0AcquireIncrement the
     * propHibernateC3P0AcquireIncrement to set
     */
    public void setPropHibernateC3P0AcquireIncrement(String propHibernateC3P0AcquireIncrement) {
        this.propHibernateC3P0AcquireIncrement = propHibernateC3P0AcquireIncrement;
    }

    /**
     * @return the propHibernateC3P0IdleRestPeriod
     */
    public String getPropHibernateC3P0IdleRestPeriod() {
        return propHibernateC3P0IdleRestPeriod;
    }

    /**
     * @param propHibernateC3P0IdleRestPeriod the
     * propHibernateC3P0IdleRestPeriod to set
     */
    public void setPropHibernateC3P0IdleRestPeriod(String propHibernateC3P0IdleRestPeriod) {
        this.propHibernateC3P0IdleRestPeriod = propHibernateC3P0IdleRestPeriod;
    }

    /**
     * @return the propHibernateC3P0MaxStatements
     */
    public String getPropHibernateC3P0MaxStatements() {
        return propHibernateC3P0MaxStatements;
    }

    /**
     * @param propHibernateC3P0MaxStatements the propHibernateC3P0MaxStatements
     * to set
     */
    public void setPropHibernateC3P0MaxStatements(String propHibernateC3P0MaxStatements) {
        this.propHibernateC3P0MaxStatements = propHibernateC3P0MaxStatements;
    }

    /**
     * @return the propHibernateC3P0Timeout
     */
    public String getPropHibernateC3P0Timeout() {
        return propHibernateC3P0Timeout;
    }

    /**
     * @param propHibernateC3P0Timeout the propHibernateC3P0Timeout to set
     */
    public void setPropHibernateC3P0Timeout(String propHibernateC3P0Timeout) {
        this.propHibernateC3P0Timeout = propHibernateC3P0Timeout;
    }

}
