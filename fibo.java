package com.ilakkiya;

import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int n = in.nextInt();
        int f = 0;
        int s = 1;
        int cnt = 2;

        while (cnt<=n){
            int temp = s;
            s = f + s;
            f = temp;
            cnt++;
        }

        System.out.println(s);
    }
}
