// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();


    }

    public static void task1() {
        System.out.println("Задача 1");
//Использовал текствоую переменную
        int[] weight = new int[]{1, 2, 3};
        System.out.println(weight[2]);

        float[] degrees = new float[]{1.57f, 7.654f, 9.986f};
        System.out.println(degrees[1]);

        float[] gram = new float[]{4.9f, 4.3f, 4.6f};
        System.out.println(gram[1]);

    }

    public static void task2() {
        System.out.println("Задача 2");
//Использовал текствоую переменную
        int[] weight = new int[]{1, 2, 3};
        double[] degrees = new double[]{1.57, 7.654, 9.986};
        String[] stringArray = new String[]{"значение1", "значение2", "значение3"};

// Печать элементов целочисленного массива
        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i]);
            if (i < weight.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

// Печать элементов массива дробных чисел
        for (int i = 0; i < degrees.length; i++) {
            System.out.print(degrees[i]);
            if (i < degrees.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

// Печать элементов массива строк
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i]);
            if (i < stringArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
//Использовал текствоую переменную
        int[] integerArray = new int[]{1, 2, 3};
        double[] decimalArray = new double[]{1.57, 7.654, 9.986};
        String[] stringArray = new String[]{"значение1", "значение2", "значение3"};

// Печать элементов целочисленного массива в обратном порядке
        for (int i = integerArray.length - 1; i >= 0; i--) {
            System.out.print(integerArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

// Печать элементов массива дробных чисел в обратном порядке
        for (int i = decimalArray.length - 1; i >= 0; i--) {
            System.out.print(decimalArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

// Печать элементов массива строк в обратном порядке
        for (int i = stringArray.length - 1; i >= 0; i--) {
            System.out.print(stringArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }


    public static void task4() {
        System.out.println("Задача 4");

        int[] integerArray = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] % 2 != 0) { // Проверка на нечетность
                integerArray[i]++; // Прибавление 1 для сделать число четным
            }
        }

// Вывод элементов массива после преобразования
        for (int i = 0; i < integerArray.length; i++) {
            System.out.print(integerArray[i] + " ");
        }
    }
}
