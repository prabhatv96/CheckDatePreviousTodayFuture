import java.time.LocalDate;
import java.util.Date;

public class CheckDate {

	public boolean date(String checkdate)
	{
		String[] arr = checkdate.split("/");
		int yr = Integer.parseInt(arr[2]);
		int mon = Integer.parseInt(arr[1]);
		int dt = Integer.parseInt(arr[0]);
		
		LocalDate checkdt = LocalDate.of(yr, mon, dt);
		
		LocalDate currentdate = LocalDate.now();
	
		if(checkdt.isBefore(currentdate) || checkdt.equals(currentdate))
		{
			return true;			
		}
		else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckDate cd = new CheckDate();
		
		boolean result = cd.date("01/01/2020");
		System.out.println(result);
	}

}
