package org.example;

public class Light {
    private String place;
    public Light(String place) {
        this.place = place;
    }
    public void On() {
        System.out.println(place + " Light on");
    }
    public void Off() {
        System.out.println(place + " Light off");
    }
}
