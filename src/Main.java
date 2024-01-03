import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        int[] array = new int[]{1, 5, 6, 7, 9, 11};
        for (int i = 0; i < array.length; i++)
        {
            if (number == array [i]) {
                System.out.println("Число " + number + " входит в массив");
                return;
            }
        }
        System.out.println("Число " + number + " не входит в массив");
    }
}
