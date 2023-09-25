package com.example.fitzoneadmin;

public class Model {
    String name, email, Number, age, gender, hegith, img, weigth;
    Model()
    {

    }
    public Model(String name, String email, String number, String age, String gender, String hegith, String img, String weigth) {
        this.name = name;
        this.email = email;
        this.Number = number;
        this.age = age;
        this.gender = gender;
        this.hegith = hegith;
        this.img = img;
        this.weigth = weigth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHegith() {
        return hegith;
    }

    public void setHegith(String hegith) {
        this.hegith = hegith;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getWeigth() {
        return weigth;
    }

    public void setWeigth(String weigth) {
        this.weigth = weigth;
    }
}
