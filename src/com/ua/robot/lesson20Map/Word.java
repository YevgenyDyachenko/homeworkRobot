package com.ua.robot.lesson20Map;

public class Word {



    private String ua;
    private String en;
    private String de;
    private String jap;


    public Word(String ua, String en, String de, String jap) {
        this.ua = ua;
        this.en = en;
        this.de = de;
        this.jap = jap;
    }


    public String getUa() {
        return ua;
    }

    public void setUa(String ua) {
        this.ua = ua;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getJap() {
        return jap;
    }

    public void setJap(String jap) {
        this.jap = jap;
    }
}
