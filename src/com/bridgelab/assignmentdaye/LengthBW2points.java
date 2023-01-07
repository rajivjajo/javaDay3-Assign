package com.bridgelab.assignmentdaye;

import java.util.Scanner;

public class LengthBW2points {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x1 ");
        int x1 = sc.nextInt();
        System.out.println("enter y1 ");
        int y1 = sc.nextInt();
        System.out.println("enter x2 ");
        int x2 = sc.nextInt();
        System.out.println("enter y2 ");
        int y2 = sc.nextInt();
        System.out.println("enter x3 ");
        int x3 = sc.nextInt();
        System.out.println("enter y3 ");
        int y3 = sc.nextInt();
        double length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double length1 = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));


        System.out.println("Length between co-ordinates" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ") is : " + length);
        System.out.println("Length between co-ordinates" + "(" + x1 + "," + y1 + ")," + "(" + x3 + "," + y3 + ") is : " + length1);
        if (length1 == length)
            System.out.println("Two lines are equal in length");
        else {
            System.out.println("Two lines are not equal");
        }
    }
}
