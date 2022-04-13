package com.lisovski;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int secInStep = 10;
        int floor = 7;
        int stepInStraight = 15;
        int straightInFloor = 2;
        int result;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Наша программа позволяет узнать, на сколько секунд продлится " +
                "Ваша жизнь при подъеме на n-ное количество этажей");

        System.out.println("Введите номер этажа, на который вы хотите подняться: ");
        floor = scanner.nextInt();

        result = secInStep * floor * stepInStraight * straightInFloor;

        System.out.print( "Ваша жизнь увеличилась на " + result + " секунд.");

    }
}
