package org.example;

public class Door {
    private  String place;
    public Door(String place) {
        this.place = place;
    }
    public void Open() {
        System.out.println(place +" Door is open");
    }
    public void Close() {
        System.out.println(place +" Door is closed");
    }
}
