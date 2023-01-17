package mariajulia.devsuperior.modulo04.aula10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TrabalhandoCalendar {

	public static void main(String[] args) {

		SimpleDateFormat data02 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

//		Date y1 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		Date x1 = new Date(System.currentTimeMillis());
		System.out.println("y1: " + data02.format(x1));

		Calendar cal = Calendar.getInstance();
		cal.setTime(x1);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		x1 = cal.getTime();

		System.out.println("x1: " + data02.format(x1));

		System.out.println("-------------");

		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(x1);

		System.out.println("Dia da semana: " + cal2.get(Calendar.DAY_OF_WEEK));
		System.out.println("Dia do mês: " + cal2.get(Calendar.DAY_OF_MONTH));
		System.out.println("Mês: " + (cal2.get(Calendar.MONTH) + 1));
		System.out.println("Ano: " + cal2.get(Calendar.YEAR));

	}

}
