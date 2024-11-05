/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject5;

/**
 *
 * @author Oleh
 */
public class Mavenproject5 {

    public static void main(String[] args) {
    Car opel = new Car("mokka");
    opel.displayInfo();
    
    Car bmw = new Car("X5",2022);
    bmw.displayInfo();
    }
}    
class Car{
    String name;
    int age;
    
    Car(String name){
    this.name = name;
    this.age = 2004;
    }
    Car(String name,int age){
    this.name = name;
    this.age = age;
    }
    
    void displayInfo(){
        System.out.printf("Name: %s \t Age: %d\n",name,age);
    
    }
}
