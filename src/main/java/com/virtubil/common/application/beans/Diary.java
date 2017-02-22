package com.virtubil.common.application.beans;
// Generated Feb 9, 2017 11:21:33 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Diary generated by hbm2java
 */
@Entity
@Table(name = "diary",
         catalog = "diary"
)
public class Diary implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "diaryID", unique = true, nullable = false)
    private Integer diaryId;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "caseID")
    private Cases cases;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "previousDate", length = 10)
    private Date previousDate;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "date", length = 10)
    private Date date;
    
    @Column(name = "step", length = 2000)
    private String step;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "nextDate", length = 10)
    private Date nextDate;
    
    @Column(name = "nextStep", length = 2000)
    private String nextStep;

    public Diary() {
    }

    public Diary(Cases cases, Date previousDate, Date date, String step, Date nextDate, String nextStep) {
        this.cases = cases;
        this.previousDate = previousDate;
        this.date = date;
        this.step = step;
        this.nextDate = nextDate;
        this.nextStep = nextStep;
    }

    public Integer getDiaryId() {
        return this.diaryId;
    }

    public void setDiaryId(Integer diaryId) {
        this.diaryId = diaryId;
    }

    public Cases getCases() {
        return this.cases;
    }

    public void setCases(Cases cases) {
        this.cases = cases;
    }

    public Date getPreviousDate() {
        return this.previousDate;
    }

    public void setPreviousDate(Date previousDate) {
        this.previousDate = previousDate;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStep() {
        return this.step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public Date getNextDate() {
        return this.nextDate;
    }

    public void setNextDate(Date nextDate) {
        this.nextDate = nextDate;
    }

    public String getNextStep() {
        return this.nextStep;
    }

    public void setNextStep(String nextStep) {
        this.nextStep = nextStep;
    }

}
