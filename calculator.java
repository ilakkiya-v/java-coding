package com.ilakkiya;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true){
            char ch = in.next().trim().charAt(0);
            if (ch =='+' || ch =='-' || ch =='/' || ch == '%' || ch == '*'){
                System.out.println("Enter two numbers");
                int a = in.nextInt();
                int b = in.nextInt();

                if (ch=='+'){
                    ans = a+b;
                }
                if (ch=='-'){
                    ans = a-b;
                }
                if (ch=='/'){
                    ans = a/b;
                }
                if (ch=='%'){
                    ans = a%b;
                }
                if (ch == '*')
                {
                    ans = a*b;
                }
            } else if (ch=='x' || ch == 'X'){
                break;
            } else
                System.out.println("Enter valid operation");
            System.out.println(ans);
        }


        }
        }
