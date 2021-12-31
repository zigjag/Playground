import java.util.Date;
public class DatePrintf2{
	public static void main(String args[]){
		Date date = new Date();

		System.out.printf("Due Date: %tB %<te, %<tY", date);
	}
}
