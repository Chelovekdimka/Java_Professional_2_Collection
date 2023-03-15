//Програма визначає, яка сім'я (прізвище) живе у місті:
//
//        Приклад введення:
//
//        · Москва
//
//        · Іванови
//
//        · Київ
//
//        · Петрови
//
//        · Лондон
//
//        · Абрамовичі
//
//        Приклад введення:
//
//        · Лондон
//
//        Приклад виведення:
//
//        · Абрамовичі



package Ex_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> families = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введіть місто (або 'end' для завершення вводу): ");
            String city = scanner.nextLine();
            if (city.equals("end")) {
                break;
            }
            System.out.print("Введіть прізвище сім'ї: ");
            String family = scanner.nextLine();
            families.put(city, family);
        }
        System.out.println("Введіть назву міста:");
        String city = scanner.nextLine();

        if (families.containsKey(city)) {
            System.out.println(families.get(city));
        } else {
            System.out.println("Сім'ю не знайдено");
        }
    }
}
