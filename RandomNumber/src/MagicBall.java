import java.util.Random;
import java.util.Scanner;

public class MagicBall {

	public static void main(String[] args) {
		System.out.println("Enter your question:");
		Scanner sc = new Scanner(System.in);
		sc.next();
		sc.close();

		Random rando = new Random(); //Random number
		int r = rando.nextInt(5); //range(0~4)
		System.out.println(r);

		if(r==0) {
			System.out.println("As I see, yes.");
		} else if(r==1) {
			System.out.println("Signs point to yes.");
		} else if(r==2) {
			System.out.println("Reply hazy, try again.");
		} else if(r==3) {
			System.out.println("Don't count on it.");
		} else if (r==4) {
			System.out.println("Outlook not so good.");
		}
	}

}
