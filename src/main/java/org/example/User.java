package org.example;

public class User {
    private String name;
    private String surname;
    private String nickname;
    private int pesel;
    private int accountNumber;
    private double balance;

    public User(String name, String surname, int pesel) {

        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.nickname = nicknameGenerator(name, surname);
        this.balance=100;
        this.accountNumber=1;
    }
    public String nicknameGenerator(String name, String surname){
        return (name.substring(0,3)+surname.substring(0,3));
    }
    public void userDetails(){
        System.out.println("Numer konta:"+accountNumber+ "imie:"+name+ "Nazwisko:"+surname+ "Nickname"+nickname+ "pesel"+pesel+ "Saldo"+balance);
    }
    public double deposit(double money){
        return balance=balance+money;
    }

    public double getBalance() {
        return balance;
    }
}
