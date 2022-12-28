package com;

public class Veterinarian {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Veterinarian [name=" + name + "]";
    }

    public Veterinarian(String name) {
        this.name = name;
    }

   public void treatment(Animal animal) {
    System.out.println("Veterinarian " + this.name + " treat " + animal.getName());
   }
}
 