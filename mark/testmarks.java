package lad7.mark;

import java.util.Scanner;

public class testmarks {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);

        marks bangdiem = new marks();

        do {
            System.out.println("welcome to FPT - select operation you want to do.");
            System.out.println("**************************************************");
            System.out.println("1 -  add a subject and point.");
            System.out.println("2 - Search point of subject.");
            System.out.println("3 - Search subject hava your point.");
            System.out.println("4 - Display all point and Subject.");
            System.out.println("5 - Exit.");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    bangdiem.addpoint();
                    break;
                case 2:
                    bangdiem.searchBySub();
                    break;
                case 3:
                    bangdiem.searchByPoint();
                    break;
                case 4:
                    bangdiem.displaymarks();
                    break;

                default:
                    System.out.println("Invalid choice pls!");
                    break;
            }
        }

        while (choice!=5);
    }
}
