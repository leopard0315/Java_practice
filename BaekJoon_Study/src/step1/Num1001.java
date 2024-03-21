package step1;
import java.util.Scanner;
//두 정수를 입력받아 A-B를 출력하는 프로그램작성
public class Num1001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner scan = new Scanner(System.in);
		
		a = scan.nextInt();
		b = scan.nextInt();
		
		a = a-b;
		
		System.out.println(a);
		scan.close();
		
	}

}
