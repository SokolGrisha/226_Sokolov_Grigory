import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * public - ����������� �������, ������� �������, ��� ����� �������� ����
         * static - ����� ���������, � ������ ����������� ������, � �� �������,
         * ��������� ������ ����� �������� ������ �� ��������� �������
         * void - ������������ ��� ������, � ����� ������ ������ �� ����������
         * String[] args - ������ �����-����������, ���������� � ���������� ������� �������� javac
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
        // ���������� ��� ���������� ������� � ������ ����������,
        // ��� �������� �������� � ��� ������� ����� �������������
        int first_number; // ���������� ����������
        int second_number = 5; // ���������� ���������� � ��������������
        int x = 10, y = 15; // int - ������������� �������� �� -2**31 �� 2**31-1 4 �����
        int test_value = Integer.MAX_VALUE + 1; // ������ ������������ ����������
        System.out.println(Integer.MAX_VALUE);
        System.out.println(test_value);
        byte test_byte = 127; // byte - ������������� ��������, �� -2**7 �� 2**7-1 1 ����
        short test_short = Short.MAX_VALUE; // short - ������������� �������� �� -2**15 �� 2**15 - 1 2 �����
        long test_long = Long.MAX_VALUE;
        System.out.println(test_long); // long - ������������� �������� �� -2**31 �� 2**31 - 1 8 ����
        float test_float = Float.MAX_VALUE; // ����� � ��������� ������� ������� ��������
        test_float = 3.5F;
        System.out.println(test_float);
        double test_double = Double.MAX_VALUE; // ����� � ��������� ������� ���������� ��������
        test_double = 3.5;
        System.out.println(test_double);
        boolean test_boolean = true; // ���������� ��� ������
        char test_symbol = 61; // ���������� ��� ������, ������� ���������� ������� unicode ��� ������������ ������ � unicode ����� 2 �����
        System.out.println(test_symbol);
        String test_string = "Hello, world";
        System.out.println(test_string);
        //String test_new_string = new String("Hello, world");
        //System.out.println(test_new_string);

        final int CONST_NUMBER = 10; // �������� ����� final ������������ ��� ������������ ����������, ������� �� ����������
        //CONST_NUMBER = CONST_NUMBER + 10; ��� �� ����� �������� ��-�� final
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
        // �������������� ��������
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println((double)x / y);
        System.out.println(x / new_y);
        System.out.println(x % y); // ������� �� �������
        System.out.println(Math.pow(x, y)); // ���������� � �������
        System.out.println("---------------------");
        // ���������� ��������
        System.out.println(true || false); // ������� ���������� ���
        System.out.println(true && false); // ������� ���������� �
        System.out.println(!true); // ���������� ���������
        System.out.println(true & false); // ������ ���������� �
        System.out.println(true | false); // ������ ���������� ���
        System.out.println("---------------------");
        System.out.println("�������� �������");
        int[] mass = {1,2};
        if (mass.length > 2 && mass[2] == 0)
            System.out.println("Work");
        // �������� ���������
        System.out.println(5 > 4);
        System.out.println(4 < 7);
        System.out.println(3 == 3); // �������� ���������
        System.out.println(4 != 3); // �������� �����������
        System.out.println(5 >= 4);
        System.out.println(5 <= 5);
        // ������������
        System.out.println("���� " + "����" + 42); // ������ ������������
        //��������� � ��������� ��������� -- ���������� ���������� �� �������(���������) � ++ ���������� ���������� �� �������(���������)
        System.out.println("y++:" + y++); // ���� ��������� ����� ����������, �� �� ����������� � ��������� �������
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
