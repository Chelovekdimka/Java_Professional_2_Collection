//Використовуючи колекцію, підвійте слово:
//
//        1. Введіть із клавіатури 5 слів до списку рядків.
//
//        2. Метод doubleValues ​​повинен підвоювати слова за принципом a, b, c -> a, a, b, b, c, c.
//
//        3. Використовуючи цикл for виведіть результат на екран, кожне значення нового рядка.

package Ex_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            words.add(scanner.nextLine());
        }
        doubleValues(words);
        words.forEach(System.out::println);
        }
    public static void doubleValues (ArrayList<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i = i + 2) {
            String element = list.get(i);
            list.add(i + 1, element);
            size++;
        }
    }
}


