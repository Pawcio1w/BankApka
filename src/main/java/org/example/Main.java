package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj w naszym banku!");
        System.out.println("Wprowadź imię");
        Scanner scanner=new Scanner(System.in);
        String name= scanner.nextLine();
        System.out.println("Wprowadź nazwisko");
        String surname= scanner.nextLine();
        System.out.println("Wprowadź pesel");
        int pesel=scanner.nextInt();

        System.out.println("Menu \n1.Informacja o koncie \n2.Wpłata pieniędzy \n3.Wypłata pieniędzy \n4.Wyjście ");

    }
}