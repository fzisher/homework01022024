import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSing();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSing(){
        Scanner sc= new Scanner(System.in);
        int a;
        a = sc.nextInt();
        int b;
        b=sc.nextInt();
        if(a+b>0||a+b==0){
            System.out.println("Сумма положительная");
        }else{
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor(){
        Scanner sc= new Scanner(System.in);
        int value;
        value= sc.nextInt();
        if (value<0||value==0){
            System.out.println("Красный");
        } else if (value<=100) {
            System.out.println("Желтый");
        }else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(){
        Scanner sc= new Scanner(System.in);
        int a;
        a = sc.nextInt();
        int b;
        b=sc.nextInt();
        if (a>b||a==b){
            System.out.println("a>=b");
        }else{
            System.out.println("a<b");
        }
    }
}