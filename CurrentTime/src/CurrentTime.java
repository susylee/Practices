import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {

	public static void main(String[] args) {
		//http://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
		Date currentDate = new Date(); //java.util import
		System.out.println(currentDate); //Sun Jul 03 19:29:40 EDT 2022
		
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
		System.out.println(timeFormat.format(currentDate)); //07:30:27
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(dateFormat.format(currentDate)); //07/03/2022

		SimpleDateFormat dayOfTheWeekFormat = new SimpleDateFormat("EEEE"); //E: Day name in week
		System.out.println(dayOfTheWeekFormat.format(currentDate)); //Sunday
		
		SimpleDateFormat clockFormat = new SimpleDateFormat("h:mm a"); // a: Am/pm marker
		System.out.println(clockFormat.format(currentDate)); //7:54 PM
		
		// when the English language doesn't work on eclipse console: 
		//Go to Window > Preferences > Java > Installed JREs > select preferred JRE > Edit and then add the following to Default VM arguments:
		//-Duser.language=en -Duser.country=US
		//https://java.tutorialink.com/how-to-set-eclipse-console-locale-language/
	}

}
