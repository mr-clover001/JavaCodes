package com.clover;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Animal animal;
        System.out.println("what animal do u want");
        System.out.println("(1=dog) and (2=cat)");

        int choice = sc.nextInt();

        if(choice==1){
            animal = new Dog();
            animal.speak();
        }
        else if(choice==2)
        {
            animal = new Cat();
            animal.speak();
        }

        else {
            animal = new Animal();
            animal.speak();
        }
    }
}
