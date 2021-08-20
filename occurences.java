package com.ilakkiya;

import java.util.Scanner;

public class occurences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cnt = 0;
        while (n>0){
            int rem = n%10;
            if (rem==3){
              cnt++;
            }
            n = n/10;
        }
        System.out.println(cnt);
    }
}
