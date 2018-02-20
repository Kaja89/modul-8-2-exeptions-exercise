package com.kodilla.modul82zadanie.test;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException{
        try {
           if(b == 0){
               throw new ArithmeticException();
           } else {
               return a/b;
           }
        } catch (ArithmeticException ae){
            System.out.println("Nie można dzielić przez zero! " + ae);
            return 0;
        }
        finally {
            System.out.println("Dziękujemy za skorzystanie z naszego kalkulatora");
        }
    }

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3, 0);
        System.out.println("Twój wynik to: " + result);
    }
}
