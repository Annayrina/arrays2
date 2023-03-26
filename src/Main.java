import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        long sum = 0;
        for (int number : arr) {
            sum += number;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Сумма трат за месяц составила " + sum);
    }


    public static void task2() {
        int[] arr = generateRandomArray();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) ;
            {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(min);
        System.out.println(max);
    }


    public static void task3() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double average = (double) sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + (average) + " рублей");
    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int index = 0; index <= reverseFullName.length - 1; index++) {

            System.out.println(reverseFullName[(reverseFullName.length - 1) - index]);

        }
    }
}


