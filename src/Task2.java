import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        int[] array = new int[]{1, 5, 6, 7, 9, 11};
        int[] resultarray = new int[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            resultarray[index] = array[i];
            if (number != array[i]) {
                index++;
            }
        }
        if (index == resultarray.length) // если индекс равен размеру массива , значит я перенесла все числа, и ничего не удалила
        {
            System.out.println("Неверное число");
        }
        System.out.println(Arrays.toString((resultarray)));
    }
}

