package org.example;

public class Main {
    public static void main(String[] args) {
        ConnectionManager conMan = new ConnectionManager("root", "");
        System.out.println(conMan.connect());
    }
}