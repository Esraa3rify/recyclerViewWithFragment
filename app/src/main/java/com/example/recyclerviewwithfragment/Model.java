package com.example.recyclerviewwithfragment;


public class Model {
    int img;
    String name, time, question;


    Model(  int  image, String name, String time, String question) {
        this.img = image;
        this.name = name;
        this.time = time;
        this.question = question;

    }

    public   int  getImg() {
        return img;
    }

    public void setImg(  int  img) {
        this.img = img;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
