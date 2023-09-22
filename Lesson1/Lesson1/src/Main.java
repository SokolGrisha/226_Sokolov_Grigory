import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * public - модификатор доступа, который говорит, что метод доступен всем
         * static - метод статичный, а значит принадлежит классу, а не объекту,
         * СТАТИЧНЫЕ МЕТОДЫ МОЖНО ВЫЗЫВАТЬ ТОЛЬКО ИЗ СТАТИЧНЫХ МЕТОДОВ
         * void - возвращаемый тип данных, в нашем случае ничего не возвращает
         * String[] args - массив строк-аргументов, передаются в консольном запуске командой javac
         */
        aboutOperation();
    }
    public static void printMenu(){
        System.out.println("Pls, choice:\n" +
                "1. Sum number\n" +
                "2. Multiply number\n" +
                "3. Substract number\n" +
                "4. Division number\n");
    }

    public static void aboutVariablesAndDataType(){
        // Переменная это выделенная область в памяти компьютера,
        // где хранится значение и эта область имеет идентификатор
        int first_number; // объявление переменной
        int second_number = 5; // объявление переменной с инициализацией
        int x = 10, y = 15; // int - целочисленное значение от -2**31 до 2**31-1 4 байта
        int test_value = Integer.MAX_VALUE + 1; // Пример переполнения переменной
        System.out.println(Integer.MAX_VALUE);
        System.out.println(test_value);
        byte test_byte = 127; // byte - целочисленное значение, от -2**7 до 2**7-1 1 байт
        short test_short = Short.MAX_VALUE; // short - целочисленное значение от -2**15 до 2**15 - 1 2 байта
        long test_long = Long.MAX_VALUE;
        System.out.println(test_long); // long - целочисленное значение от -2**31 до 2**31 - 1 8 байт
        float test_float = Float.MAX_VALUE; // Число с плавающей запятой обычной точности
        test_float = 3.5F;
        System.out.println(test_float);
        double test_double = Double.MAX_VALUE; // Число с плавающей запятой повышенной точности
        test_double = 3.5;
        System.out.println(test_double);
        boolean test_boolean = true; // Логический тип данных
        char test_symbol = 61; // Символьный тип данных, который использует таблицу unicode для соответствия Символ в unicode весит 2 байта
        System.out.println(test_symbol);
        String test_string = "Hello, world";
        System.out.println(test_string);
        //String test_new_string = new String("Hello, world");
        //System.out.println(test_new_string);

        final int CONST_NUMBER = 10; // Ключевое слово final используется для константовых переменных, которые не изменяются
        //CONST_NUMBER = CONST_NUMBER + 10; Это не будет работать из-за final
    }

    public static void aboutCondition(){
        int x = 0;
        if (x > 10) {
            System.out.println("X > 10");
            System.out.println("Great");
        }
        else if (x <= 10 && x > 0) {
            System.out.println("0 <= X <= 10");
        }
        else if (x == 0) {
            System.out.println("X = 0");
        }
        else {
            System.out.println("X < 0");
            System.out.println("WOW");
        }
    }

    public static void aboutOperation(){
        int x = -7, y = 10;
        double new_y = 10;
        // Арифметические операции
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println((double)x / y);
        System.out.println(x / new_y);
        System.out.println(x % y); // Остаток от деления
        System.out.println(Math.pow(x, y)); // Возведение в степень
        System.out.println("---------------------");
        // Логические операции
        System.out.println(true || false); // Быстрое Логическое ИЛИ
        System.out.println(true && false); // Быстрое Логическое И
        System.out.println(!true); // Логическое отрицание
        System.out.println(true & false); // Полное Логическое И
        System.out.println(true | false); // Полное Логическое ИЛИ
        System.out.println("---------------------");
        System.out.println("Проверка быстрых");
        int[] mass = {1,2};
        if (mass.length > 2 && mass[2] == 0)
            System.out.println("Work");
        // Операции сравнения
        System.out.println(5 > 4);
        System.out.println(4 < 7);
        System.out.println(3 == 3); // Проверка равенства
        System.out.println(4 != 3); // Проверка неравенства
        System.out.println(5 >= 4);
        System.out.println(5 <= 5);
        // Конкатенация
        System.out.println("Мама " + "Мыла" + 42); // Пример конкатенации
        //Декремент и Инкремент Декремент -- уменьшение переменной на единицу(Декремент) и ++ увеличение переменной на единицу(Инкремент)
        System.out.println("y++:" + y++); // Если инкремент после переменной, то он выполняется в последнюю очередь
        System.out.println("y:" + y);
        System.out.println("y--:" + y--);
        System.out.println("y:" + y);
        System.out.println("++y:" + (++y));
        System.out.println("y:" + y);
        System.out.println("--y:" + (--y));

    }

    public static void aboutConsoleInputAndSwitch(){
        int x = 10, y = 5;
        int choicePunkt = -1;
        System.out.print("Input you punkt:");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt())
            choicePunkt = sc.nextInt();
        switch (choicePunkt) {
            case 1:
                System.out.println(x + y);
                break;
            case 2:
                System.out.println(x * y);
                break;
            case 3:
                System.out.println(x - y);
                break;
            case 4:
                System.out.println((double) x / y);
                break;
            default:
                System.out.println("Wrong punkt");
                System.err.println(choicePunkt);
        }
    }
}
