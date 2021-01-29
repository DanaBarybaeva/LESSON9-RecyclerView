package com.example.recycleviewactivity;

public class Film {
    String name;
    String genre;
    String minute;
    String photo;

    public Film(String name,String genre,String minute,String photo){
        this.minute = minute;
        this.name = name;
        this.genre = genre;
        this.photo = photo;
    }

    public String getname() {
        return name;

    }

    public String getGenre() {
        return  genre;
    }


    public String getminute() {
        return minute;
    }
    public String getPhoto() {
        return photo;
    }
}

