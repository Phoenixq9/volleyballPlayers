package com.example.volleyballplayers;

import java.io.Serializable;

public class Players implements Serializable {


   private String name;
    private String age;
    private String length;
    private String position;
    private String country;
    private int pictureInteger;
    private  int pictureFlag;



    public Players(String name, String age, String length, String position, String country, int pictureInteger,int pictureFlag) {
        this.name = name;
        this.age=age;
        this.length = length;
        this.position = position;
        this.country = country;
        this.pictureInteger = pictureInteger;
        this.pictureFlag=pictureFlag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPictureInteger() {
        return pictureInteger;
    }

    public void pictureFlag(int pictureInteger) {
        this.pictureFlag = pictureInteger;
    }
    public int getPictureFlag() {
        return pictureFlag;
    }

    public void setPictureFlag(int pictureFlag) {
        this.pictureFlag = pictureFlag;
    }

}

