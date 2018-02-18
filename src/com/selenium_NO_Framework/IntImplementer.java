package com.selenium_NO_Framework;

public class IntImplementer implements BankingclientInterface, DomainClient {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        IntImplementer d = new IntImplementer();
        d.checkingbalance();
        d.tranferbalance();
        BankingclientInterface bc = new IntImplementer(); // runtime polymorphism
        bc.checkingbalance();
        d.login();
        d.investments();
    }

    @Override
    public void paycreditcard() {
        // TODO Auto-generated method stub
        System.out.println("paycredicard implemented Test");
    }

    @Override
    public void tranferbalance() {
        // TODO Auto-generated method stub
        System.out.println("tranferbalance Test");
    }

    @Override
    public void checkingbalance() {
        // TODO Auto-generated method stub
        System.out.println("checkingbalance Test");
    }

    public void login() {
        System.out.println("loggedIn");
    }

    @Override
    public void investments() {
        System.out.println("Investments test");
    }



}
