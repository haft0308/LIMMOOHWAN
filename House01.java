import java.util.Scanner;


public class House01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("몇단을 알고 싶은지 입력하세요");
		int a = sc.nextInt();
		
		for(int i=1; i<10; i++ ) {
			System.out.println(a+"*"+i+"="+a*i);
		}


	}

}
