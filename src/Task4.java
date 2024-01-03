import java.util.Arrays;
public class Task4 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 3, 5, 7, 9};
        System.out.println("Данные массива 1 это " + Arrays.toString(array1));
        int[] array2 = new int[]{2, 4, 6, 8, 10};
        System.out.println("Данные массива 2 это " + Arrays.toString(array2));
        int average1 = 0;
        int average2 = 0;
        for (int i = 0; i < array1.length; i++) {
            average1 += array1[i];
        }
        average1 = average1 / array1.length;
        System.out.println("Среднее число массива 1 это " + average1);

        for (int a = 0; a < array2.length; a++) {
            average2 += array2[a];
        }
        average2 = average2 / array2.length;
        System.out.println("Среднее число массива 2 это " + average2);
        if (average1 > average2) {
    System.out.println("Среднее число первого массива больше, чем среднее число второго массива");}
        else {
            System.out.println("Среднее число второго массива больше, чем среднее число первого массива");}
    }
}
