import java.util.Scanner;
class MyProg {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
        Integer num1 = sc.nextInt();
        Integer num2 = sc.nextInt();
        if (num1>num2){
            System.out.println("Махатма");
        } else System.out.println("Джавахарлал");
        sc.close();
	}
}