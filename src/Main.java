import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
1. Scanner
2. сканнер принимает арифметическую операцию, например 2 + 2 = 4
3. нужно посчитать и добавить оперцию в HashMap (ключ сама операция, значение - результат)
4. Перед тем как посчитать, нужно проверить нет ли уже таких данных в HashMap, если есть, то отдать из HashMap
5. Результат выводим на консоль
*/
public class Main {
    static String getCacheKey(int first, int second, String operation) {
        StringBuilder builder = new StringBuilder();
        builder.append(first);
        builder.append(operation);
        builder.append(second);
        return builder.toString();
    }
    public static void main(String[] args) {
        System.out.println("Нуриниса помогла, сам никак не смог проверить было ли такое решение до этого");
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int j = 2 - 1; j < 99; j++) {
            Scanner scan = new Scanner(System.in);
            int itog = 0;
            System.out.print("Первое число = ");
            int a = scan.nextInt();
            System.out.print("Операция = ");
            String operation = scan.next();
            System.out.print("Второе число = ");
            int b = scan.nextInt();

            if (hashMap.containsKey(getCacheKey(a, b, operation)) && hashMap.containsValue(itog)) {
                System.out.println(hashMap);
            }

            switch (operation) {
                case "+": {
                    itog = (a + b);
                    break;
                }
                case "-": {
                    itog = (a - b);
                    break;
                }
                case "*": {
                    itog = (a * b);
                    break;
                }
                case "/": {
                    itog = (a / b);
                    break;
                }
            }
            hashMap.put(getCacheKey(a, b, operation), itog);
            System.out.println(hashMap);
        }
    }
}
