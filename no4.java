/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Hp pavilion
 */
public class no4 {

    public static void main(String[] args) {
        System.out.println(buyEgg(25, 50000));
    }

    static int buyEgg(int tanggal, int uang) {
        int hasil;
        int pembelian = uang / 2000;
        int bonus = 0;
        if (pembelian < 1) {
            System.out.println("uang anda tidak cukup");
        }
        if (prima(tanggal) && (tanggal != 1)) {
            bonus += pembelian / 12;
        } else if (tanggal % 2 == 1) {
            bonus += (pembelian / 20) * 3;
        }
        if (tanggal % 5 == 0) {
            if (bonus % 2 == 0) {
                bonus *= 10;
            }
            if (bonus % 2 == 1) {
                bonus *= 5;
            }
        }
        hasil = pembelian + bonus;
        return hasil;
    }

    static boolean prima(int angka) {
        int temp;
        boolean prima = true;
        for (int i = 2; i <= angka / 2; i++) {
            temp = angka % i;
            if (temp == 0) {
                prima = false;
                break;
            }
        }
        return prima;
    }
}