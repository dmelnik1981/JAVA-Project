import java.util.Scanner;
class  Main {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String x = sc.nextLine();
    System.out.println((str.contains(x)) || (str.length()>20) ? "YES":"NO");
    }
}
