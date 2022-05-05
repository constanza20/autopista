package entidades;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

import utils.Utilidades;
import validaciones.Validaciones;

public class Pago {
	
	//Atributos
	
	private long idPago; // idPago es un long mayor o igual que uno el cual no se puede repetir, y su
	// valor por defecto es #null
	private LocalDate fecha; // fecha indica la fecha actual
	private char tipoPago; // tipPago indica el tipo de pago, puede ser en efectivo o tarjeta asi que sus
	// valores validos son "e" o "t" y valor por defecto en #null
	private LocalTime hora; // hora indica la hora del pago
	private long idPeaje;
	
	public Peaje abonar;
	
	//Constructores
	
	public Pago() {
	}
	
	// Constructores con parámetros:

	public Pago(long idPago, LocalDate fecha, char tipoPago, LocalTime hora, long idPeaje, Peaje abonar) {
		this.setIdPago(idPago);
		this.setFecha(fecha);
		this.setTipoPago(tipoPago);
		this.setHora(hora);
		this.setIdPeaje(idPeaje);
		this.setAbonar(abonar);

	}

	
	// Metodos get y set 

	
	public long getIdPago() {
		return idPago;
	}

	public void setIdPago(long idPago) {
		this.idPago = idPago;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public char getTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(char tipPago) {
		this.tipoPago = tipPago;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public long getIdPeaje() {
		return idPeaje;
	}

	public void setIdPeaje(long idPeaje) {
		this.idPeaje = idPeaje;
	}

	public Peaje getAbonar() {
		return abonar;
	}

	public void setAbonar(Peaje abonar) {
		this.abonar = abonar;
	}

 // Metodo nuevoPago
	
	public static Pago nuevoPago() {
		Pago ret = null;
		long idPago = 1;
		char tipoPago = 1;
		long idPeaje = 0;
		Peaje abonar = null;


		Scanner in;
		boolean valido = false;
		do {
			System.out.println("Introduzca el id del pago:");
			in = new Scanner(System.in);
			idPago = in.nextLong();
			if (idPago > 0)
				valido = true;
			else
				System.out.println("Valor incorrecto del id.");
		} while (!valido);
		
		
		// Introducir fecha va aqui
		System.out.println("Introduzca la fecha de la nueva prueba");
		LocalDate fecha = Utilidades.leerFecha();
		// El tipo de pago va aqui
		do {
			System.out.println("Introduzca el id del Peaje");
			in = new Scanner(System.in);
			tipoPago = in.next().charAt(0);
			valido = Validaciones.validarIdPeaje(idPeaje);
		if (!valido)
			System.out.println("Valor incorrecto para la calle.");
		} while (!valido);

		valido = false; 
		System.out.println("Introduzca la fecha de la nueva prueba");
		LocalTime hora = Utilidades.leerHora();
		do {
			System.out.println("Introduzca el id del Peaje");
			in = new Scanner(System.in);
			idPeaje = in.nextLong();
			if (idPeaje > 0)
				valido = true;
			else
				System.out.println("Valor incorrecto para el id.");
		} while (!valido);

		valido = false;
		
		System.out.println("Introduzca ahora los datos del abono:");
		in = new Scanner(System.in);
		abonar = Peaje.nuevoPeaje();
		
		

		ret = new Pago(idPago, fecha, tipoPago, hora, idPeaje, abonar);
		return ret;
	}


}

	


