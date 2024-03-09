import java.util.Scanner;
class MyProg {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
        Double num1 = sc.nextDouble();
        Double num2 = sc.nextDouble();
        System.out.println((num1<num2) ? "Бой продолжается!" : "Холифилд - чемпион!");
        sc.close();
    }   
        
}  