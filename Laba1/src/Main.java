import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        HW();
        Calc();
        InCalc();
    }

    public static void HW() {
        /*1*/
        System.out.println("Hello world!");
        /*1.1*/
        System.out.println("Hello");
        System.out.println("world!");
        /*2*/
        String h = "Hello";
        String w = " world!";
        System.out.println(h + w);
    }

    public static void Calc() {
        /*3*/
        int ch = 1;
        int a3 = 15;
        int b3 = 5;
        System.out.println("a=15 b=5 \n" +
                "Use commands:\n" +
                "1.Plus +\n" +
                "2.Minus -\n" +
                "3.Multiply *\n" +
                "4.Division /\n" +
                "5.? %\n");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            ch = sc.nextInt();
        }
        switch (ch){
            case 1:
                System.out.println("a+b");
                System.out.println(a3+b3);
                break;
            case 2:
                System.out.println("a-b:");
                System.out.println(a3-b3);
                System.out.println("b-a:");
                System.out.println(b3-a3);
                break;
            case 3:
                System.out.println("a*b");
                System.out.println(a3*b3);
                break;
            case 4:
                System.out.println("a/b");
                System.out.println((double) a3/b3);
                System.out.println("b/a");
                System.out.println((double) b3/a3);
                break;
            case 5:
                System.out.println("a%b");
                System.out.println((double) a3%b3);
                System.out.println("b%a");
                System.out.println((double) b3%a3);
                break;
            default:
                System.out.println("Error");
                break;

            }
        }

    public static void InCalc(){
        /*4*/
        int a = 10;
        int ch = 0;
        int inn = 0;
        System.out.println("a = 10 \n" +
                "1. += \n" +
                "2. -= \n" +
                "3. *= \n" +
                "4. /= \n");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            ch = sc.nextInt();
        }
        switch (ch){
            case 1:
                System.out.println("a+=");
                if (sc.hasNextInt()) {
                    inn = sc.nextInt();
                }
                System.out.println(a+inn);
                break;
            case 2:
                System.out.println("a-=");
                if (sc.hasNextInt()) {
                    inn = sc.nextInt();
                }
                System.out.println(a+inn);
                break;
            case 3:
                System.out.println("a*=");
                if (sc.hasNextInt()) {
                    inn = sc.nextInt();
                }
                System.out.println(a*inn);
                break;
            case 4:
                System.out.println("a/=");
                if (sc.hasNextInt()) {
                    inn = sc.nextInt();
                }
                System.out.println((double) a/inn);
                break;
        }
    }
    }
