import java.util.Scanner;
class MyProg {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
        Integer num1 = sc.nextInt();
        Integer num2 = sc.nextInt();
        Integer num3 = sc.nextInt();
        if ((num1>=num2) && (num1>=num3)){
          System.out.println(num1);
        } else if ((num2>=num1) && (num2>=num3)){
            System.out.println(num2);
          } else  if ((num3>=num1) && (num3>=num2)){
          System.out.println(num3);
        
       
        }   
        sc.close();
	}
}   