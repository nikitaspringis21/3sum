package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet x: ");
        double x = sc.nextDouble();

        double sum = 1/3.0;
        boolean zime = true;
        double skaititajs = x + 2;
        double saucejs = 3;
        int count = 0;


        if ((x >= -3) && (x <= 1)){
            while(count < 9){
                for (int i = 2; i <= 18 ; i+=2) {
                    for (int j = 2; j <= 10 ; j++) {
                        zime = !zime;
                        double newSk = Math.pow(skaititajs, i);
                        double newSauc = Math.pow(saucejs, j);
                        if(zime) sum += newSk / newSauc;
                        else sum -= newSk / newSauc;
                    }
                }
                count++;
            }
            System.out.println(sum);
            double dala = 1.0 / (x*x + 4*x + 7);
            System.out.println(dala);







        }

    }
}
