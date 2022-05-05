package utils;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Utilidades {
	
	public static java.time.LocalDate leerFecha() {
		LocalDate ret = null;
		int dia, mes, anio;
		boolean correcto = false;
		Scanner in;
		do {
			System.out.println("Introduzca un valor para el día (1...31)");
			in = new Scanner(System.in, "ISO-8859-1");
			dia = in.nextInt();
			System.out.println("Introduzca un valor para el mes (1...12)");
			in = new Scanner(System.in, "ISO-8859-1");
			mes = in.nextInt();
			System.out.println("Introduzca un valor para el año");
			in = new Scanner(System.in, "ISO-8859-1");
			anio = in.nextInt();

			try {
				ret = LocalDate.of(anio, mes, dia);
				correcto = true;
			} catch (Exception e) {
				System.out.println("Fecha introducida incorrecta.");
				correcto = false;
			}
		} while (!correcto);
		return ret;
	}
	
	
	public static LocalTime leerHora() {
		LocalTime ret = null;
		int hora, minuto, segundo;
		boolean correcto = false;
		Scanner in;
		do {
			try {
				System.out.println("Introduzca un valor para la hora del dia (0...23)");
				in = new Scanner(System.in, "ISO-8859-1");
				hora = in.nextInt();
				System.out.println("Introduzca un valor para el minuto (0...59)");
				in = new Scanner(System.in, "ISO-8859-1");
				minuto = in.nextInt();
				System.out.println("Introduzca un valor para el segundo");
				in = new Scanner(System.in, "ISO-8859-1");
				segundo = in.nextInt();

				ret = LocalTime.of(hora, minuto, segundo);
				correcto = true;
			} catch (Exception e) {
				System.out.println("Hora introducida incorrecta. Primero ingrese la hora, luego el minuto y finalmente el segundo.");
				correcto = false;
			}
		} while (!correcto);
		return ret;
	}

}
