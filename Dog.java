package com;

public class Dog extends Animal {

    String name;
    
    public Dog(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Dog [name=" + name + " " + super.toString() + "]";
    }
    
    @Override
    public String getVoice() {
        return this.name + " gav gav...";
    }
    
    @Override
    public void eat() {
        System.out.println(this.name + " eatyng");
    }
    
    @Override
    public void sleep() {
        System.out.println(this.name + " sleepyng");
    }
        
    }