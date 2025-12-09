import java.util.Scanner;

public class MyFirstAppIf {
    public static void main(String[] Args) {
        /*
        System.out.println("Написано однажды, работает везде");
        Scanner console = new Scanner(System.in, "cp866");
        System.out.print("Введите свое имя: ");
        System.out.println(console.nextLine());
        */

        // TODO: просуммировать числа от 1 до 5

        /*
        1 + 2 + 3 + 4 + 5 = 15
        
        1 + 2 = 3
        3 + 3 = 6
        6 + 4 = 10
        10 + 5 = 15
        */
        System.out.println("Сумма чисел в диапазоне от 1 до 5");

        int sum = 1 + 2;
        boolean isEvenNumber = sum % 2 == 0;
        if (isEvenNumber) {
            System.out.println("\nЧисло " + sum + " является четным");
        } else if (!isEvenNumber) {
            System.out.println("\nЧисло " + sum + " является нечетным");
        }

        int sum1 = sum + 3;
        boolean isEvenNumber1 = sum1 % 2 == 0;
        if (isEvenNumber1 == true) {
            System.out.println("Число " + sum1 + " является четным");
        } else if (isEvenNumber1 == false) {
            System.out.println("Число " + sum1 + " является нечетным");
        }

        int sum2 = sum1 + 4;
        boolean isEvenNumber2 = sum2 % 2 == 0;
        if (isEvenNumber2 == true) {
            System.out.println("Число " + sum2 + " является четным");
        } else if (isEvenNumber2 == false) {
            System.out.println("Число " + sum2 + " является нечетным");
        }

        int result = sum2 + 5;
        boolean isEvenNumberRes = result % 2 == 0;
        if (isEvenNumber == true) {
            System.out.println("Число " + result + " является четным");
        } else if (isEvenNumberRes == false) {
            System.out.println("Число " + result + " является нечетным");
        }

        System.out.println("\n1 + 2 + 3 + 4 + 5 = " + result);
        /*
        //Моя интерпретация суммы по диапазону с открытыми вх.параметрами
        System.out.println("\nПросуммировать числа в диапазоне");
        
        Scanner console = new Scanner(System.in, "cp866");
        System.out.print("\nВведите начало диапазона: ");
        int from = console.nextInt();
        
        System.out.print("Введите конец диапазона: ");
        int to = console.nextInt();

        int res = 0;
        for ( int i = from; i <= to; i++) {
            res += i;
        }
        System.out.println("\nСумма диапазона равна " + res);
        */
    }
}