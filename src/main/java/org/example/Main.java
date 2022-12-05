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


        User user1= new User(name, surname, pesel);

        System.out.println("Menu \n1.Informacja o koncie \n2.Wpłata pieniędzy \n3.Wypłata pieniędzy \n4.Wyjście ");
        System.out.println("Co byś chciał zrobić?");
        int select= scanner.nextInt();

        switch(select){
            case 1:
                System.out.println("Informacja o koncie");
                user1.userDetails();
                break;
            case 2:
                System.out.println("Ile chcesz wpłacić pieniędzy");
                double moneyToDeposit= scanner.nextDouble();
                user1.deposit(moneyToDeposit);
                System.out.println("Saldo twojego konta: "+user1.getBalance());
                break;
            case 3:
                System.out.println("Wypłata pieniędzy");
                break;
            case 4:
                System.out.println("Wyjście");
                break;
        }
    }

}