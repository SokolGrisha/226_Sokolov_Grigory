import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task9();
        Task11();
    }

    public static void Task1() {
        System.out.println("Task 1");
        System.out.println("Exmpl from Task:");
        double n = (double) 23.5 ;
        System.out.println(Math.ceil(n));
        System.out.println("Mine:");
        n = (double) 2/3 ;
        System.out.println(Math.ceil(n));

    }

    public static void Task2() {
        System.out.println("Task 2");
        double funt = 1.487;
        double frank = 0.172;
        double mark = 0.584;
        double yen = 0.00955;
        double dol = 0;
        System.out.println("Input dollars (exmp:12.4):");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextDouble()) {
            dol = sc.nextDouble();
        }
        System.out.println(String.format("%.3f",(dol/funt))+" british pound");
        System.out.println(String.format("%.3f",(dol/mark))+" german marks");
        System.out.println(String.format("%.3f",(dol/yen))+" yens");

    }

    public static void Task3(){
        System.out.println("Task 3");
        double transform = (double) 9/5;
        double inp = 0;
        System.out.println("Input Celsia (exmp:5):");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextDouble()) {
            inp = sc.nextDouble();
        }
        System.out.println("Faringeits:"+String.format("%.3f",(inp*transform)));
    }

    public static void Task4(){
        System.out.println("Task 4");
        double mn = 0;
        double ans = 0;
        double per = 0;
        int years = 0;
        System.out.println("Input amount for saving :");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextDouble()) {
            mn = sc.nextDouble();
        }
        System.out.println("Input years:");
        if (sc.hasNextInt()) {
            years = sc.nextInt();
        }
        System.out.println("Input percents from bank (exmp 5.5):");
        if (sc.hasNextDouble()) {
            per = sc.nextDouble();
        }
        per=per/100;
        ans=mn;
        for (int i=0; i < years;i++){
            ans=(ans*per)+ans;
        }
        System.out.println("After "+years+" years u got:"+String.format("%.2f",ans));
        for (int i=0; i < years;i++){
            System.out.println("Year: "+(i+1));
            System.out.println("Bank account: "+String.format("%.2f",mn));
            System.out.println("In end of the year: "+mn+" + "+String.format("%.2f",(mn*per))+" = "+String.format("%.2f",((mn*per)+mn)));
            mn=(mn*per)+mn;
        }

    }

    public static void Task5(){
        System.out.println("Task 5");
        for(int i = 25; i<63; i++){
            if(i % 2 ==0){
                System.out.println(i);
            }
        }
    }

    public static void Task6() {
        System.out.println("Task 6");
        int mn = 0;
        System.out.println("Input number :");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            mn = sc.nextInt();
        }
        if (mn % 2 == 0){
            System.out.println("Yes");
        }
        else {
            System.out.println("NO");
        }
    }

    public static void Task9() {
        System.out.println("Task 9");
        int mn = 1;
        int ans = 1;
        System.out.println("Input number :");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            mn = sc.nextInt();
        }
        for(int i = 1; i<(mn+1); i++){
            ans=ans*i;
        }
        System.out.println("Ans. : "+ans);
    }

    public static void Task11() {
        System.out.println("Task 11");
        int a = 0;
        int b = 0;
        System.out.println("Input number a:");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            a = sc.nextInt();
        }
        System.out.println("Input number b:");
        if (sc.hasNextInt()) {
            b = sc.nextInt();
        }
        for(int i = a; i<b; i++){
            if(i % 2 ==0){
                System.out.println(i);
            }
        }
    }


}
