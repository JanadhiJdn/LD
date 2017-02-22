package com.virtubil.common.application.beans;
// Generated Feb 9, 2017 11:21:33 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Lawyer generated by hbm2java
 */
@Entity
@Table(name = "lawyer",
         catalog = "diary"
)
public class Lawyer implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "lid", unique = true, nullable = false)
    private Integer lid;
    
    @Column(name = "userName", length = 20)
    private String userName;
    
    @Column(name = "password", length = 20)
    private String password;
    
    @Column(name = "firstName", length = 20)
    private String firstName;
    
    @Column(name = "lastName", length = 20)
    private String lastName;
    
    @Column(name = "mobile", length = 15)
    private String mobile;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "lawyer", cascade = CascadeType.PERSIST)
    private Set<Cases> caseses = new HashSet<Cases>(0);

    public Lawyer() {
    }

    public Lawyer(String userName, String password, String firstName, String lastName, String mobile, Set<Cases> caseses) {
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.caseses = caseses;
    }

    public Integer getLid() {
        return this.lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Set<Cases> getCaseses() {
        return this.caseses;
    }

    public void setCaseses(Set<Cases> caseses) {
        this.caseses = caseses;
    }

}