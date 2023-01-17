package mariajulia.devsuperior.modulo04.aula10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class TrabalhandoDate {

	public static void main(String[] args) throws ParseException {

		// dd/MM/yyyy 14/01/2023
		// dd/MM/yyyy HH:mm:ss 14/01/2023 23:31:50

		// SimpleDateFormat mostra a formatação que quero utilizar
		SimpleDateFormat data01 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat data02 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat data03 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		data03.setTimeZone(TimeZone.getTimeZone("GMT"));

		Date x1 = data01.parse("13/01/2023");
		Date x2 = data02.parse("13/01/2023 15:42:07");

		Date x3 = new Date();
		Date x4 = new Date(System.currentTimeMillis());
		Date x5 = new Date(0l);

		Date x6 = new Date(1000000l * 5l);
		Date y1 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		System.out.println("------------------------------");
		System.out.println("Sem formatação");
		System.out.println("x1: " + (x1));
		System.out.println("x2: " + (x2));
		System.out.println("x3: " + (x3));
		System.out.println("x4: " + (x4));
		System.out.println("x5: " + (x5));
		System.out.println("x6: " + (x6));
		System.out.println("y1: " + (y1));

		System.out.println("------------------------------");
		System.out.println("Horario de Brasilia");

		// objetoSimpleDateFormat.format transforma o argumento passado para a
		// formatação que exemplifiquei quando criei o objeto
		System.out.println("x1: " + data01.format(x1));
		System.out.println("x2: " + data02.format(x2));
		System.out.println("x3: " + data02.format(x3));
		System.out.println("x4: " + data02.format(x4));
		System.out.println("x5: " + data02.format(x5));
		System.out.println("x6: " + data02.format(x6));
		System.out.println("y1: " + data02.format(y1));

		System.out.println("------------------------------");
		System.out.println("Horario UTF");

		System.out.println("x1: " + data03.format(x1));
		System.out.println("x2: " + data03.format(x2));
		System.out.println("x3: " + data03.format(x3));
		System.out.println("x4: " + data03.format(x4));
		System.out.println("x5: " + data03.format(x5));
		System.out.println("x6: " + data03.format(x6));
		System.out.println("y1: " + data03.format(y1));

	}

}
