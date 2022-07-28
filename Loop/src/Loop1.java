import java.util.Scanner;

public class Loop1 {

	public static void main(String[] args) {
		//54321 count backwards
		for(int i=5; i>0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		//Increment by 2 from 1 to 10
		for (int i=1; i<=10; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		//Sum from 1 to 100
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum +=i;
		}
		System.out.println("sum:" + sum);

		System.out.println();
		//Sum of even and odd number from 1 to 100 (using if else)
		int even = 0;
		int odd = 0;
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				even += i;
			} 
			else {
				odd += i;
			}
		}
		System.out.println("sum of odd:" + odd);
		System.out.println("sum of even:" + even );

		System.out.println();
		//print numbers that are multiples of 5 and multiples of 7 from 1 to 100
		for(int i=1; i<=100; i++) {
			if(i%5==0 && i%7==0) {
				System.out.print(i + " ");
			}
		} //for

		System.out.println("multiple table1");
		//print 7*1=7 7*2=14 ~ 7*9=63
		for(int i=7; i==7; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
		System.out.println("multiple table2");
		for(int i=1; i<10; i++) {
			System.out.println("7*" + i + "=" + 7*i);
		}

		//Print 26 letters from A to Z (A:65 in ASCII)
		System.out.println('A');
		for(char i=65; i<=90; i++) {
			System.out.print(i);
		}
		System.out.println();
		for(int i=65; i<=90; i++) {
			System.out.print((char)i);
		}
		System.out.println();

		//Input integer (using scanner) and find how many multiples of 7 are there and what is the sum of multiples of 7?
		Scanner sc = new Scanner(System.in);
		int sum1 = 0;
		int num = 0;
		int count = 0;
		System.out.println("Enter an Integer: ");
		num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			if(i%7==0) { //7 14 21 28 < 200
				System.out.print(i + " ");
				//count = count + 1;
				//count += 1;
				count++;
				sum1 += i;
			}
		}
		System.out.println();
		System.out.println("count: " + count);
		System.out.println("sum of 7: " + sum1);
		
		
		
	}
}
