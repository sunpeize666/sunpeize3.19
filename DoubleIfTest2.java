package chapter;

import java.util.Scanner;

public class DoubleIfTest2 {
	Scanner stdIn = new Scanner(System.in);
	System.out.print("수자를 입력:");
	int num = stdIn.nextInt();
	if(num % 2 == 0) {
	    System.out.println(num+"은(는) 짝수입니다");
    }if (num % 2 != 0){
	    System.out.println(num+"은(는) 홀수입니다");
    }
}
