package com.java.playground.saiplayground.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id; 

    @Column
    private String fieldName; 

    
    @Column
    private boolean isBatter;
    
    @Column
    private boolean isBowler; 

    @Column
    private boolean isWicketKeeper; 

    @Column
    private Integer battingAverage; 

    @Column
    private Integer bowlingAverage;
    
    @Column
    private boolean isAllRounder;


    public boolean isBatter() {
        return isBatter;
    }
    public void setBatter(boolean isBatter) {
        this.isBatter = isBatter;
    }
    public boolean isBowler() {
        return isBowler;
    }
    public void setBowler(boolean isBowler) {
        this.isBowler = isBowler;
    }
    public boolean isWicketKeeper() {
        return isWicketKeeper;
    }
    public void setWicketKeeper(boolean isWicketKeeper) {
        this.isWicketKeeper = isWicketKeeper;
    }
    public Integer getBattingAverage() {
        return battingAverage;
    }
    public void setBattingAverage(Integer battingAverage) {
        this.battingAverage = battingAverage;
    }
    public Integer getBowlingAverage() {
        return bowlingAverage;
    }
    public void setBowlingAverage(Integer bowlingAverage) {
        this.bowlingAverage = bowlingAverage;
    }
    public boolean isAllRounder() {
        return isAllRounder;
    }
    public void setAllRounder(boolean isAllRounder) {
        this.isAllRounder = isAllRounder;
    } 

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFieldName() {
        return fieldName;
    }
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
    
    
}
