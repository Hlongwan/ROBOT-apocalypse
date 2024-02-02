package com.developer.robortservice.entity;

import jakarta.persistence.*;


@Entity
public class Survivor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private int age;
    private String gender;
    private double latitude;
    private double longitude;
    private int num_reports;


    private boolean status;
    private boolean infected;
    private  boolean nonInfected ;

    @OneToOne
    private Resource resource;



    public Survivor(boolean infected, Resource resource){
        this.infected = infected;

        this.resource = resource;
    }

    public Survivor(String name, int age, String gender, boolean status , double latitude,
                    double longitude, boolean infected, Resource resource) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.latitude = latitude;
        this.longitude=longitude;
        this.status = status;
        this.infected = infected;
        this.resource = resource;
        this.num_reports=num_reports;
        
    }

    public Survivor() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public boolean isStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum_reports() {
        return num_reports;
    }

    public void setNum_reports(int num_reports) {
        this.num_reports = num_reports;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void  setStatus(boolean status) {
        this.status = status;
    }

    public void setLocation(double longitude ,double latitude) {
        this.longitude=longitude;
        this.latitude=latitude;
    }

    public boolean isInfected() {
        return false;
    }

    public boolean isRobot() {
        return false;
    }
}
