package com.example.entity;

import java.util.List;

public class PorkerHand {
    String suits;
    List<Integer> faces;

    public PorkerHand() {
    }

    public PorkerHand(String suits, List<Integer> faces) {
        this.suits = suits;
        this.faces = faces;
    }

    public String getSuits() {
        return suits;
    }

    public void setSuits(String suits) {
        this.suits = suits;
    }

    public List<Integer> getFaces() {
        return faces;
    }

    public void setFaces(List<Integer> faces) {
        this.faces = faces;
    }
}
