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
public class no3 {

    public static void main(String[] args) {
        int a = find("banananananana");
        System.out.println("ditemukan " + a + " kali");
    }

    static int find(String teks) {
        int cnt = 0;
        char[] inp = teks.toCharArray();
        for (int i = 2; i < teks.length(); i++) {
            for (int j = i + 1; j < teks.length(); j++) {
                if (inp[i] == inp[j]) {
                    cnt++;
                    break;
                }
            }
        }
        return cnt/2 + 1;
    }
}
