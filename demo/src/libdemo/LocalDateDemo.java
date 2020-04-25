package libdemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class LocalDateDemo {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate first = LocalDate.of(2020, 1, 1);
		System.out.println(today);
		System.out.println(first.plusMonths(2));
		System.out.println(first);
		
		LocalTime singtime =
				LocalTime.now(ZoneId.of("Asia/Singapore"));
		System.out.println(singtime);
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);

	}

}
