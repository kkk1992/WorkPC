import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.function.Predicate;

public interface DateDemo {
	//Predicate<T>
	public static void main(String[] args) {
		
		LocalTime time = LocalTime.now();
		
		System.out.println("Time ="+time);
		
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDate date2 = LocalDate.of(2022, Month.JANUARY, 22);	
		
		System.out.println(date2);
	
		System.out.println("Convert");
		String strDate= "2020-02-03T10:15:30";
		
		LocalDateTime localDateTime = LocalDateTime.parse(strDate);
		
		System.out.println("localDateTime"+localDateTime);
		
		LocalDate now = LocalDate.now();
		
		String string1 = LocalDate.now().toString();
		
	}
}
