package com.project.dojosurvay.models;


public class Student{

    private String name;
    private String location;
    private String favLang;
    private String comment;

    public Student(){}

    public Student(String name, String location, String lang){
        setName(name);
        setLocation(location);
        setFavLang(lang);
    }

    public Student(String name, String location, String lang, String comment){
        setName(name);
        setLocation(location);
        setFavLang(lang);
        setComment(comment);
    }

    public String getName(){
        return this.name;
    }
    public String getLocation(){
        return this.location;
    }
    public String getFavLang(){
        return this.favLang;
    }
    public String getComment(){
        return this.comment;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public void setFavLang(String lang){
        this.favLang = lang;
    }
    public void setComment(String comment){
        this.comment = comment;
    }


}