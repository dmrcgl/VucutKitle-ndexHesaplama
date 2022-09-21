package com.kitleEndex;

import java.util.Scanner;

public class KitleİndexHesaplama {
    public static void main(String[] args) {

        double boy , kilo , vkt;

        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu Giriniz  metre cinsinde :");
        boy =sc.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz  :");
        kilo =sc.nextDouble();

        vkt = kilo / (boy * boy) ;
        System.out.println("Boyunuz : " + boy);
        System.out.println("Kilonuz : " + kilo);
        System.out.println("Vücut Kitle İndeksiniz :" + vkt);
    }
}
