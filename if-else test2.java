import java.util.Scanner;
class MyProg {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        Integer len1 = str1.length();
        Integer len2 = str2.length();
        if (len1>len2){
          System.out.println("Махатма");
        } else System.out.println("Джавахарлал");
        sc.close();
	}
}    