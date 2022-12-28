package com;

public class Animal {
    
private String ration;
private String color;
private int weight;
private String name;

@Override
public String toString() {
    return "ration=" + ration + ", color=" + color + ", weight=" + weight;
}

public Animal(String ration, String color, int weight) {
    this.ration = ration;
    this.color = color;
    this.weight = weight;
}



public String getRation () {
    return this.ration; 
}

public String getColor () {
    return this.color; 
}

public int getWeight () {
    return this.weight; 
}

public String getName () {
    return this.name;
}

public void setRation (String ration) {
    this.ration = ration;
}

public void setColor (String color) {
    this.color = color;
}

public void setWeight (int weight) {
    this.weight = weight;
}

public String getVoice() {
    return "animal get voice";
}

public void eat() {
}

public void sleep() {
}



}

    
    
    
    
    
    


    
    

