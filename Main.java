package com;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("viscas", "white", 7, "Lusa");
        Animal dog = new Dog("pedigree", "black", 25, "Grey");
        System.out.println(dog.getVoice());
        System.out.println(cat.getVoice());
        Veterinarian veterinarian = new Veterinarian("Roman");
        veterinarian.treatment(cat);
    }

}





