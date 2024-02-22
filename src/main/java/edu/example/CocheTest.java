package edu.example;


public class CocheTest {
    public static void main(String[] args) {

        Coche saab = new Coche("Saab", "93");
        Coche toyota = new Coche("Toyota", "Avensis");

        saab.recorre(30);
        saab.recorre(40);
        saab.recorre(220);
        toyota.recorre(60);
        toyota.recorre(150);
        toyota.recorre(90);
        System.out.println("El saab ha recorrido " + saab.getKilometraje() + "Km");
        System.out.println("El toyota ha recorrido " + toyota.getKilometraje() + "Km");
        System.out.println("El kilometraje total ha sido de " + Coche.getKilometrajeTotal() + "Km");
    }
}