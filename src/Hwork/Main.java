package Hwork;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.println("Lütfen Matematik notunu giriniz");
        int math= tara.nextInt();
        System.out.println("Lütfen Fizik notunu giriniz");
        int fizik= tara.nextInt();
        System.out.println("Lütfen Kimya notunu giriniz");
        int kimya= tara.nextInt();
        System.out.println("Lütfen Türkçe notunu giriniz");
        int turkce= tara.nextInt();
        System.out.println("Lütfen Tarih notunu giriniz");
        int tarih= tara.nextInt();
        System.out.println("Lütfen Müzik notunu giriniz");
        int muzik= tara.nextInt();


        int ort=(math+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println((ort>=60)?"Sınıfı Geçti ":"Sınıfta Kaldı" );
        System.out.println("Not Ortalaması:"+ ort);




    }
}