package basics;

import java.util.Scanner;

public class DemoIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		if (val < 20)

			System.out.println(val);

		else
			System.out.println("Value has crossed the condition" + " " + val);

	}

}
