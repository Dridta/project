package projects.random.Main;

import java.util.Scanner;

import projects.random.staff.CityTrans2;
import projects.random.staff.Clean3;
import projects.random.staff.Death4;
import projects.random.staff.Extrahelp5;
import projects.random.staff.Police1;;

public class Main1 {
    public static void main(String[] args) {

        System.out.print("У вас что то случилось?: y/n  ");
        Scanner scan = new Scanner(System.in);
        String answ = scan.nextLine();
        String answtrue = "y";
        if (answ.equalsIgnoreCase(answtrue)) {
            int randomSituation = (int) (Math.random() * 5) + 1;
            System.out.println("Ситуация номер: " + randomSituation);
            if (randomSituation == 1) {
                System.out.println("Ограбление: ");
                System.out.print("Введите номер машины: ");
                int number;
                number = scan.nextInt();
                Police1 police = new Police1();
                police.setNumber(number);
                System.out.print("Введите количество персонала: ");
                int peopleNumber = scan.nextInt();
                police.setCarNumberOfPeople1(peopleNumber);
                police.isCarGo();

            } else if (randomSituation == 2) {
                System.out.println("911: ");
                System.out.print("Введите номер машины скорой помощи: ");
                int number1;
                number1 = scan.nextInt();
                Extrahelp5 extrahelp5 = new Extrahelp5();
                extrahelp5.setNumber(number1);
                System.out.print("Введите количество персонала: ");
                int peopleNumber1 = scan.nextInt();
                extrahelp5.setCarNumberOfPeople1(peopleNumber1);
                System.out.print("Введите номер машины полиции: ");
                int number2;
                number2 = scan.nextInt();
                System.out.print("Введите количество полицейских: ");
                extrahelp5.setNumber2(number2);
                int peopleNumber2 = scan.nextInt();
                extrahelp5.setCarNumberOfPeople2(peopleNumber2);
                extrahelp5.isCarGoExtra();

            } else if (randomSituation == 3) {
                System.out.println("Смерть: ");
                System.out.print("Введите номер машины: ");
                int number;
                number = scan.nextInt();
                Death4 death4 = new Death4();
                death4.setNumber(number);
                System.out.print("Введите количество персонала: ");
                int peopleNumber = scan.nextInt();
                death4.setCarNumberOfPeople1(peopleNumber);
                death4.isCarGoDeath();

            } else if (randomSituation == 4) {
                System.out.println("Уборка: ");
                System.out.print("Введите номер машины: ");
                int number;
                number = scan.nextInt();
                Clean3 clean3 = new Clean3();
                clean3.setNumber(number);
                System.out.print("Введите количество персонала: ");
                int peopleNumber = scan.nextInt();
                clean3.setCarNumberOfPeople1(peopleNumber);
                clean3.isCargo();

            } else if (randomSituation == 5) {
                System.out.println("Экскурсия: ");
                System.out.print("Введите номер машины: ");
                int number;
                number = scan.nextInt();
                CityTrans2 cityTrans2 = new CityTrans2();
                cityTrans2.setNumber(number);
                System.out.print("Введите количество персонала: ");
                int peopleNumber = scan.nextInt();
                cityTrans2.setCarNumberOfPeople1(peopleNumber);
                cityTrans2.isCargoTo();
            }
        } else {
            System.out.println("Ложный вызов ");
        }

    }
}