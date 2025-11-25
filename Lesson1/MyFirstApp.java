import java.util.Scanner;

public class MyFirstApp {
    public static void main(String[] Args) {
        /*
        System.out.println("Написано однажды, работает везде");
        Scanner console = new Scanner(System.in, "cp866");
        System.out.print("Введите свое имя: ");
        System.out.println(console.nextLine());
        */

        // TODO: просуммировать числа от 1 до 5

        /*
        1 + 2 +3 + 4 + 5 = 15
        
        1 + 2 = 3
        3 + 3 = 6
        6 + 4 = 10
        10 + 5 = 15
        */
        System.out.println("Сумма чисел в диапазоне от 1 до 5");
        int sum1 = 1 + 2;
        int sum2 = sum1 + 3;
        int sum3 = sum2 + 4;
        int result = sum3 + 5;

        System.out.println();
        System.out.println(result);
//
        //Моя интерпретация суммы по диапазону с открытыми вх.параметрами
        System.out.println();
        System.out.println("Просуммировать числа в диапазоне");
        System.out.println();
        Scanner console = new Scanner(System.in, "cp866");
        System.out.print("Введите начало диапазона: ");
        int from = console.nextInt();
        System.out.print("Введите конец диапазона: ");
        int to = console.nextInt();

        int res = 0;
        for ( int i = from; i <= to; i++) {
            res += i;
        }

        System.out.println();
        System.out.println("Сумма диапазона равна " + res);
    }
}