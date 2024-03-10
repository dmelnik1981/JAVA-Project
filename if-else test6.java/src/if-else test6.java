import java.util.Scanner;
class IfElseTest6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer num1 = sc.nextInt();
        System.out.println((num1==3 || num1==4 || num1==5 )? "YES":"NO");
    }
}