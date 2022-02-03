package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhap so can doc");
        int number = scanner.nextInt();
        String letter = String.valueOf(number);

        for (int i = 0; i < letter.length(); i++) {
            char character = letter.charAt(i);

            switch (character){
                case 49:
                    System.out.print("một ");
                    break;
                case 50:
                    System.out.print("hai ");
                    break;
                case 51:
                    System.out.print("ba ");
                    break;
                case 52:
                    System.out.print("bốn ");
                    break;
                case 53:
                    System.out.print("năm ");
                    break;
                case 54:
                    System.out.print("sáu ");
                    break;
                case 55:
                    System.out.print("bảy ");
                    break;
                case 56:
                    System.out.print("tám ");
                    break;
                case 57:
                    System.out.print("chín ");
                    break;
                case 48:
                    System.out.print("không ");
                    break;
            }
        }
    }
}
