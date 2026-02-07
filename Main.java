import java.time.Year;

/**
 * Program description.
 * @author Aidon
 */
public class Main
{
	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION
		String SurName;
		String GivenName;
		String USCISNumFirst; 
		String USCISNumSecond;
		String USCISNumThird;
		String Category;
		String CardNum;
		String BirthCountry;
		String TermsAndConditions;
		String MonthBorn;
		String DayBorn;
		String YearBorn;
		char Sex;
		String ValidFromD;
		String ValidFromM;
		String ValidFromY;
		String CardExpD;
		String CardExpM;
		String CardExpY;
		//CALCULATION SECTION
		SurName = "Hutchinson";
		GivenName = "Aidon";
		USCISNumFirst = "6767";
		USCISNumSecond = "7676";
		USCISNumThird = "2121";
		Category = "1";
		CardNum = "111122223333";
		BirthCountry = "Zymbabwe";
		TermsAndConditions = "Be Cool";
		MonthBorn = "Apr";
		DayBorn = "09";
		YearBorn = "2048";
		Sex = 'M';
		ValidFromD = "6";
		ValidFromM = "9";
		ValidFromY = "9999";
		CardExpD = "1";
		CardExpM = "1";
		CardExpY = "10000";





		//OUTPUT SECTION
		System.out.println("╔══════════════════════════════════════════════════════════════════════");
		System.out.println("║         UNITED STATES OF AMERICA");
		System.out.println("║                                  EMPLOYMENT AUTHORIZATION CARD");
		System.out.println("║                       Surname:");
		System.out.println("║                       " + SurName + " ");
		System.out.println("║  .----.    .----.     Given Name:");
		System.out.println("║ (   ^  \\  /  ^   )    " + GivenName + "  ");
		System.out.println("║        |  |           USCIS#            Category:  Card#");
		System.out.println("║       _/  \\_          " + USCISNumFirst + "-" + USCISNumSecond +  "-" + USCISNumThird +"        " +  Category +"      " + CardNum + "" );
		System.out.println("║      (_    _)         Country of Birth:");
		System.out.println("║   ,    `--`    ,      " + BirthCountry + "");
		System.out.println("║   \\'-.______.-'/      Terms and Conditions");
		System.out.println("║    \\          /      " + "       "+ TermsAndConditions +"");
		System.out.println("║     '.--..--.'        Date of Birth:   Sex:");
		System.out.println("║       `\"\"\"\"\"`         "+ DayBorn +" " + MonthBorn + " " + YearBorn + "       "  + Sex + "");
		System.out.println("║                       Valid From:     "+ ValidFromD + "/" + ValidFromM + "/" + ValidFromY + "");
		System.out.println("║                       Card Expires:   " + CardExpD + "/" + CardExpM + "/" + CardExpY + "");
		System.out.println("║ ascii art by: jgs     NOT VALID FOR REENTRY TO U.S.");
		System.out.println("╚══════════════════════════════════════════════════════════════════════");
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
	}
}
