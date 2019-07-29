package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



                Scanner in = new Scanner(System.in);
                System.out.print("Input a number: ");
                String S = in.nextLine();
                System.out.println("String: " + S);

                int X = Integer.parseInt (S);
                System.out.println("Int: " + X);

                double Y = (double) X;
                System.out.println("Double: " + Y);
            }
        }
