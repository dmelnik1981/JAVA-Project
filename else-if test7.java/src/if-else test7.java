import java.util.Scanner;
class IfElseTest7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer num = sc.nextInt();
        System.out.println((num%7 == 0)? "YES":"NO");
        sc.close();
    }
}