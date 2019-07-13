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
public class no5 {

    public static void main(String[] args) {
        segitiga(5);
    }

    static void segitiga(int nilai) {
        //bilangan prima
        int input = 1000;
        boolean isprima;
        int[] prima = new int[input];
        int idx = 2;
        int i = 0;
        prima[0] = 2;
        for (i = 1; i < input; i++) {
            isprima = false;
            while (!isprima) {
                idx++;
                for (int j = 0; j <= i - 1; j++) {
                    if ((idx % prima[j]) != 0) {
                        isprima = true;
                    } else {
                        isprima = false;
                        break;
                    }
                }
            }
            prima[i] = idx;
        }
        //membuat segitiga
        int j = 0;
        for (int k = 0; k < nilai; k++) {
            for (int l = 0; l <= k; l++) {
                System.out.print(prima[j] + " ");
                j += 1;
            }
            System.out.println();
        }
    }
}
