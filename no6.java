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
public class NewClass {

    public static void main(String[] args) {
        int[] a = {11,13,15};
        System.out.println(mrBruno("SUM", 20, a));
        int[] b = {12,15,17};
        System.out.println(mrBruno("MUL", 20, b));
    }

    static int mrBruno(String operasi, int N, int[] a) {
        int hasil = 0;
        if (operasi.equals("MUL")) {
            hasil = 1;
        }
        int[] Str = new int[21];
        String value = "";
        for (int i = 0; i < 21; i++) {
            Str[i] = i;
            value += Str[i];
        }
        int[] arr = new int[value.length()];
        for (int i = 0; i < value.length(); i++) {
            arr[i] = value.charAt(i) - 48;
        }
        if (operasi.equals("SUB")) {
            hasil = arr[a[0]] * 2;
        }
        if (operasi.equals("DIV")) {
            hasil = arr[a[0]] * arr[a[0]];
        }
        for (int i = 0; i < a.length; i++) {
            if (operasi.equals("SUM")) {
                hasil += arr[a[i]];
            } else if (operasi.equals("MUL")) {
                hasil *= arr[a[i]];
            } else if (operasi.equals("SUB")) {
                hasil -= arr[a[i]];
            } else if (operasi.equals("DIV")) {
                hasil /= arr[a[i]];
            }
        }
        return hasil;
    }
}
