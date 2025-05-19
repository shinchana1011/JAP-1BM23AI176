package apack;

public class A {
    int defaultvar =10;
    protected int protectedvar=20;
    private int privatevar=30;
    public int publicvar=40;
    public A(){
        System.out.println("inside constructor of class A");

    }
}


package bpack;
import apack.A;


public class B extends A{
    public void display(){
        System.out.println("Inside Constructor class B");
        //System.out.println("default variable in class A"+defaultvar);
        System.out.println("protected variable in class A"+protectedvar);
        //System.out.println("private variable in class A"+privatevar);
        System.out.println("public variable in class A"+publicvar);
    }
}


package cpack;
import apack.A;

public class C {
    A obj= new A();
    public void display(){
        System.out.println("Inside Constructor class B");
        //System.out.println("default variable in class A"+obj.defaultvar);
        //System.out.println("protected variable in class A"+obj.protectedvar);
        //System.out.println("private variable in class A"+obj.privatevar);
        System.out.println("public variable in class A"+obj.publicvar);
    }
}



package com.mycompany.mavenproject2;
import bpack.B;
import cpack.C;

public class Mavenproject2 {
    public static void main(String[] args ){
        B objB = new B();
        objB.display();
        C objC = new C();
        objC.display();
    }
}
