import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        first();
        second();
        third();
        fourth();
        fifth();
    }
    public static void  first(){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        if (a+b>=10&&a+b<=20){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    public static void second(){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        if(a<0){
            System.out.println("Отрицательное");
        } else{
            System.out.println("Положительное");
        }
    }
    public static void third(){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        if(a<0){
            System.out.println("Отрицательное");
        } else{
            System.out.println("Положительное");
        }
    }
    public static void fourth(){
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        String st;
        st=sc.nextLine();
        for (int i=0;i<num;i++){
            System.out.println(st);
        }
    }
    public static void fifth(){
        Scanner sc =new Scanner(System.in);
        int year= sc.nextInt();
        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    System.out.println(true);
                }else {
                    System.out.println(false);
                }
            }else{
                System.out.println(true);
            }
        } else{
            System.out.println(false);
        }
    }
}