package com.bridgelab.assignmentdaye;

import java.util.Scanner;

public class LengthBW2points {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x1 ");
        int x1 =sc.nextInt();
        System.out.println("enter y1 ");
        int y1 =sc.nextInt();
        System.out.println("enter x2 ");
        int x2 =sc.nextInt();
        System.out.println("enter y2 ");
        int y2 = sc.nextInt();
        double length = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

        System.out.println("Length between co-ordinates"+"("+x1+","+y1+"),"+"("+x2+","+y2+") is : "+length);
    }
}
