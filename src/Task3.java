import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int size = (int) (Math.random() * 10);
        System.out.println("Если хотите воспользоваться методом рандом - введите 0, в ином случае введите число от 1 до 10");
        Scanner scanner = new Scanner(System.in);
        int userchouse = scanner.nextInt();
        if (userchouse == 0) {
            size = (int) (Math.random() * 10);
        } else
            size = userchouse;
        System.out.println("Размер массива равен " + size);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
    }
        System.out.println("Массив" + Arrays.toString(array));
        int max=array [0];
        int min=array [0];
        int average= 0;
        for (int i = 0; i < array.length; i++) {
            if (array [i]< min) {
                min=array [i];
            }
            if (array [i]> max) {
                max=array [i];
        }
            average= array[i]+average;
                    average= average/array.length;
        }
        System.out.println("Минимальное значение " + min);
        System.out.println("Максимальное значение " + max);
        System.out.println("Среднее арифметическое значение " + average);
    }
}
