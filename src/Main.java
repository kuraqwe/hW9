public class Main {
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        int array[] = new int[30];
        for (int i = 0; i < array.length; i++) {
            array = generateRandomArray();
        }
        //the first task
        int amount = 0;
        for (int i = 0; i < array.length; i++) {
            amount = amount + array[i];
        }
        System.out.println("Сумма трат за месяц составила " + amount + " рублей.");
        //the second task
        int minWaste = array[0];
        int maxWaste = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minWaste) {
                minWaste = array[i];
            }
            if (array[i] > maxWaste) {
                maxWaste = array[i];
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + minWaste + ". А максимальная " + maxWaste + ".");
        //the third task
        float middleWaste = amount;
        System.out.println(middleWaste / array.length);
        //the fourth task
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.println(reverseFullName[reverseFullName.length - 1 - i]);
        }
    }
}
