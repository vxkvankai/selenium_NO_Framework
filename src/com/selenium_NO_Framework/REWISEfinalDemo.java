package com.selenium_NO_Framework;

// **** IMP KEYWORDS: this, super, "final,try/catch can go with finally", final, packages, import, inheritance, interfaces, runtime
// polymorphism as shown in BankingClientInterface, strings, HASHSET, HASHMAP
// PACKAGES - JAVA.LANG IS DEFAULT INBUILT
// USER DEFINED PACKAGE - EX: com.selenium_NO_Framework
// CLASS A CAN USE THE CLASS B DIRECTLY BY CREATING THE OBJECT OF CLASS B ONLY IF BOPTH CLASSES BELONG TO SAME PACKAGE.
// - IF NOT YOU NEED TO IMPORT THAT CLASS PACKAGE AND CREATE OBJECT OF THAT CLASS IN CLASS A


// DEFAULT MODIFIER - variable or method - ANYWHERE ONLY IN SAME PACKAGE
// PUBLIC: variable / method: then accessible anywhere ACROSS ALL PACKAGES
// PRIVATE: variable/method: CANNOT ACCESS OUTSIDE OF THE CLASS
// PROTECTED: variable /mehtod as private: ACCESS IN SUB-CLASS ONLY (INHERITING CLASS/CHILD CLASS) EITHER IS SAME PACKAGE OR **
// OTHER PACKAGES
//

public class REWISEfinalDemo {

    final void getData() {

    }

    public static void main(String[] args) {

        final int i = 4; // for constant variables
        // final for class: you cannot extend the class
        //final method cannot be overridden


    }

}
