package com.virtubil.common.application.beans;
// Generated Feb 9, 2017 11:21:33 PM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Plantiff generated by hbm2java
 */
@Entity
@Table(name = "plantiff",
         catalog = "diary"
)
public class Plantiff implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "plantiffID", unique = true, nullable = false)
    private Integer plantiffId;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "caseID")
    private Cases cases;
    
    @Column(name = "firstName", length = 20)
    private String firstName;
    
    @Column(name = "lastName", length = 20)
    private String lastName;
    
    @Column(name = "address", length = 2000)
    private String address;
    
    @Column(name = "mobile", length = 15)
    private String mobile;

    public Plantiff() {
    }

    public Plantiff(Cases cases, String firstName, String lastName, String address, String mobile) {
        this.cases = cases;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.mobile = mobile;
    }

    public Integer getPlantiffId() {
        return this.plantiffId;
    }

    public void setPlantiffId(Integer plantiffId) {
        this.plantiffId = plantiffId;
    }

    public Cases getCases() {
        return this.cases;
    }

    public void setCases(Cases cases) {
        this.cases = cases;
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

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

}
