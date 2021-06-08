package com.company;

public class Main {

    public static void main(String[] args) {

        printDayOfTheWeek(-1);
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);


    }

    public static void printDayOfTheWeek(int day){

        switch (day) {

            case 0:
                System.out.println("Nichiyoubi");
                break;
            case 1:
                System.out.println("Getsuyoubi");
                break;
            case 2:
                System.out.println("Kayoubi");
                break;
            case 3:
                System.out.println("Suiyoubi");
                break;
            case 4:
                System.out.println("Mokuyoubi");
                break;
            case 5:
                System.out.println("Kinyoubi");
                break;
            case 6:
                System.out.println("Doyoubi");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }

    }
}

