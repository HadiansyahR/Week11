package org.Utilities;

public class Main {
    public static void main(String[] args) {
        ConnectionManager conMan = new ConnectionManager();
        System.out.println(conMan.connect());
    }
}