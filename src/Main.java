public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_00) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задание 1");
        int[] arr = generateRandomArray();
        int arrSum = 0;
        for (int money :arr) {
                arrSum += money;
            System.out.println(money);
        }
        System.out.println("Сумма трат за месяц составила " + arrSum + " рублей");

    }

    public static void task2() {
        System.out.println("Задание 2");
        int[] arr = generateRandomArray();
        arr[0] = 99_000;
        arr[1] = 200_001;

        for (int money :arr) {
            if (money > arr[0] ){
                arr[0] = money;
            }
            if (money < arr[1] ){
                arr[1] = money;
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+ arr[1] + " рублей.Максимальная сумма трат за день составила" + arr[0] + "… рублей");
    }

    public static void task3() {
        System.out.println("Задание 3");
        int[] arr = generateRandomArray();
        int arrSum = 0;
        for (int money :arr) {
            arrSum += money;
            System.out.println(money);
        }
        double salary =(double) arrSum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила" + salary+" рублей");
    }
    public static void task4() {
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1 ; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

}