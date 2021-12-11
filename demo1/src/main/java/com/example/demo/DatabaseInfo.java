package com.example.demo;

public class DatabaseInfo {
    public String id;
    public String first_name;
    public String last_name;
    public String date;
    public String points;

    public DatabaseInfo(String id, String first_name, String last_name, String date, String points) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.date = date;
        this.points = points;
    }

    @Override
    public String toString() {
        return String.format("ID: %s Név: %s %s Felvett dátum: %s Pontok: %s\n",this.id,this.first_name,this.last_name,this.date,this.points);
    }
}