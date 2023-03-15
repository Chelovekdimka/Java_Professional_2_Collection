//Вводити з клавіатури рядки, доки користувач не введе рядок 'end':
//
//        1. Створити перелік рядків.
//
//        2. Ввести рядки з клавіатури та додати їх до списку.
//
//        3. Вводити з клавіатури рядки, доки користувач не введе рядок "end". "end" не враховувати.
//
//        4. Вивести рядки на екран, кожен з нового рядка.

package Ex_5;

import java.util.LinkedList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть рядки (введіть 'end' для завершення вводу): ");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            list.add(input);
        }
        list.forEach(System.out::println);
    }
}
