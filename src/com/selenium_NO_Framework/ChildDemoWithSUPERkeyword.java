package com.selenium_NO_Framework;

public class ChildDemoWithSUPERkeyword extends ParentDemoforSUPERfromCHILD {


    String name = "TestAcademy";

    public ChildDemoWithSUPERkeyword() {
        super();
        System.out.println("This is a child class constructor");
    }



    public void getData() {
        super.getData();
        System.out.println("I am in child class");
    }

    public void getStringData() {
        System.out.println(name);// prints local variable of the class even if 
        System.out.println(this.name);// you can explicitly say this.name if you want to explicitly mean to use local variable
        System.out.println(super.name); // prints the super/extended class's variable
    }

    public static void main(String[] args) {
        ChildDemoWithSUPERkeyword cd = new ChildDemoWithSUPERkeyword();
        cd.getStringData();
    }

}
