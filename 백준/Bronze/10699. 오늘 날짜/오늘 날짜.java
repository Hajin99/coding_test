import java.util.Calendar;

public class Main {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		if(month>10) {
			if(day>10)
				System.out.println(year + "-" + month + "-" + day );
			else {
				System.out.println(year + "-" + month + "-0" + day);
			}
		}
		else {
			if(day>10) {
				System.out.println(year + "-0" + month + "-" + day);
			}
			else {
				System.out.println(year + "-0" + month + "-0" + day);
			}
		}
	}
}