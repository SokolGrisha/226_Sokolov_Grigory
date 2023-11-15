import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*HW();
        Calc();
        InCalc();
        Prim();*/
        Svnth();
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
                "4. /= \n" +
                "5. +=1 (++)\n" +
                "6. -=1 (--)");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            ch = sc.nextInt();
        }
        switch (ch){
            case 6:
                a--;
                System.out.println(a);
                break;
            case 5:
                a++;
                System.out.println(a);
                break;
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

    public static void Prim(){
        /*5*/
        System.out.println("25/13+12*(29-45+13/5):");
        Double ans = 0.0;
        ans = 13.0/5;
        ans = 29-45+ans;
        ans = 12*ans;
        ans += (25.0/13);
        System.out.println(ans);
    }

    public static void Svnth(){
        /*7*/
        int n = 87;/*99>n>1*/
        int ans = 0;

        if (n>10){
            ans += (int) n/10;
            ans += n-(ans*10);
        }
        else{
            ans = n;
        }

        System.out.println(ans);
    }
    }
