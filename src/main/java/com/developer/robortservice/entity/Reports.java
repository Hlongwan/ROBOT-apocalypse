package com.developer.robortservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Reports {

    @Id
    private int id;
    private int num_reports;

    private boolean infected;

    private boolean nonInfected;


    public Reports(int id, int num_reports, boolean infected, boolean nonInfected) {
        this.id = id;
        this.num_reports = num_reports;
        this.infected = infected;
        this.nonInfected = nonInfected;
    }

    public Reports( ) {

    }


    public int getId() {
        return id;
    }

    public int getNum_reports() {
        return num_reports;
    }

    public boolean isInfected() {
        return infected;
    }

    public boolean isNonInfected() {
        return nonInfected;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNum_reports(int num_reports) {
        this.num_reports = num_reports;
    }

    public void setInfected(boolean infected) {
        this.infected = infected;
    }

    public void setNonInfected(boolean nonInfected) {
        this.nonInfected = nonInfected;
    }
}
