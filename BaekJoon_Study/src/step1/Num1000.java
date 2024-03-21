package step1;
import java.util.Scanner;
//정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오
public class Num1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int a,b;
		a = scan.nextInt();
		b = scan.nextInt();
		a = a+b;
		System.out.println(a);
		scan.close();
	}

}
