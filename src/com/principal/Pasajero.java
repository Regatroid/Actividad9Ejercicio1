package com.principal;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;;

public class Pasajero {
	/*
	1. nombre
    2. primerApellido
    3. segundoApellido
    4. fechaNacimiento
    5. sexo (tipo enumerable)
    6. mascotas (listado de mascotas (PERRO, GATO, MARMOTA). Mascota es un enumerable.
	 */


	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private LocalDate fechaDeNacimiento;
	private Sexo sexo;  enum Sexo {HOMBRE, MUJER}
	private Mascota mascota; enum Mascota {PERRO, GATO, MARMOTA}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getPrimerApellido() {
		return primerApellido;
	}



	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}



	public String getSegundoApellido() {
		return segundoApellido;
	}



	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}



	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}



	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}



	public Sexo getSexo() {
		return sexo;
	}



	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}



	public Mascota getMascota() {
		return mascota;
	}



	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}



	public Pasajero(String nombre, String primerApellido, String segundoApellido, LocalDate fechaDeNacimiento,
			Sexo sexo, Mascota mascota) {
		super();
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.sexo = sexo;
		this.mascota = mascota;
	}

	@Override
	public String toString() {
		return "Pasajero [nombre=" + nombre + ", primerApellido=" + primerApellido + ", segundoApellido="
				+ segundoApellido + ", fechaNacimiento=" + fechaDeNacimiento + ", sexo=" + sexo + ", mascota=" + mascota + "]";
	}
	public static List<Pasajero> getPasajeros() {
		List<Pasajero> Pasajeros;

		Pasajeros = new ArrayList<>();

		Pasajeros.add(new Pasajero("Antonio", "Angola", "Albatros", LocalDate.of(1987, Month.JANUARY, 26),
				Sexo.HOMBRE, Mascota.GATO));
		//australia
		Pasajeros.add(new Pasajero("Begoña", "Benitez", "Baños", LocalDate.of(1997, Month.APRIL, 06),
				Sexo.MUJER, Mascota.MARMOTA));
		//australia
		Pasajeros.add(new Pasajero("Clara", "Cazorla", "Calatrañas", LocalDate.of(1992, Month.DECEMBER, 12),
				Sexo.MUJER, Mascota.GATO));
		//colombia
		Pasajeros.add(new Pasajero("Delirio", "Donce", "Dulces", LocalDate.of(1961, Month.FEBRUARY, 13),
				Sexo.HOMBRE, Mascota.PERRO));
		//colombia
		Pasajeros.add(new Pasajero("Ernesto", "Ernes", "Entite", LocalDate.of(1988, Month.JULY, 11),
				Sexo.HOMBRE, Mascota.GATO));
		//belgica
		Pasajeros.add(new Pasajero("Fernando", "Fregona", "Flores", LocalDate.of(1978, Month.JUNE, 01),
				Sexo.HOMBRE, Mascota.MARMOTA));
		//belgica
		Pasajeros.add(new Pasajero("Gargantua", "Ganzua", "Gazapo", LocalDate.of(1987, Month.MAY, 20),
				Sexo.HOMBRE, Mascota.GATO));
		//australia
		Pasajeros.add(new Pasajero("Hulio", "Hulionez", "Huliense", LocalDate.of(1977, Month.JANUARY, 15),
				Sexo.HOMBRE, Mascota.PERRO));
		//colombia
		Pasajeros.add(new Pasajero("Inma", "Invento", "Iapple", LocalDate.of(1999, Month.MARCH, 22),
				Sexo.MUJER, Mascota.GATO));
		//belgica
		Pasajeros.add(new Pasajero("Jose", "Joroba", "Josejo", LocalDate.of(1993, Month.JANUARY, 17),
				Sexo.HOMBRE, Mascota.PERRO));
		//australia

		return Pasajeros;

	}

	
}