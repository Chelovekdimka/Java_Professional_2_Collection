//Мінімальне з N чисел (використовувати LinkedList):
//
//        1. Введіть із клавіатури число N.
//
//        2. Вважати N цілих чисел і заповнити ними список - метод getIntegerList.
//
//        3. Знайти мінімальне число серед елементів списку – метод getMinimum.

package Ex_3;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = getIntegerList();
        int min = getMinimum(list);
        System.out.println("Мінімальне число серед елементів списку: " + min);
    }

    public static LinkedList<Integer> getIntegerList() {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть із клавіатури число N: ");
        int n = scanner.nextInt();
        System.out.printf("Введіть із клавіатури %d чисел типу int: ", n);
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            list.add(num);
        }
        return list;
    }

    public static int getMinimum(LinkedList<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (int num : list) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}


