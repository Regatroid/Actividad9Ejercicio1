package com.principal;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Vuelo {

	/*
	 * Crear una clase Vuelo, con las siguientes propiedades:
	 * 
	 * 1. destino 2. precio 3. fechaDeSalida 4. horaDeSalida 5. fechaDeLlegada 6.
	 * horaDeLlegada 7. numeroDePlazas es: static y final y integer 8. pasajeros
	 * (Listado de pasajeros del vuelo)
	 */

	private String destino;
	private Double precio;
	private LocalDate fechaDeSalida;
	private LocalDate fechaDeLlegada;
	private LocalTime horaDeSalida;
	private LocalTime horaDeLlegada;
	private static final Integer numeroDePlazas = 10;
	private Integer pasajeros;

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public LocalDate getFechaDeSalida() {
		return fechaDeSalida;
	}

	public void setFechaDeSalida(LocalDate fechaDeSalida) {
		this.fechaDeSalida = fechaDeSalida;
	}

	public LocalDate getFechaDeLlegada() {
		return fechaDeLlegada;
	}

	public void setFechaDeLlegada(LocalDate fechaDeLlegada) {
		this.fechaDeLlegada = fechaDeLlegada;
	}

	public LocalTime getHoraDeSalida() {
		return horaDeSalida;
	}

	public void setHoraDeSalida(LocalTime horaDeSalida) {
		this.horaDeSalida = horaDeSalida;
	}

	public LocalTime getHoraDeLlegada() {
		return horaDeLlegada;
	}

	public void setHoraDeLlegada(LocalTime horaDeLlegada) {
		this.horaDeLlegada = horaDeLlegada;
	}

	public Integer getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(Integer pasajeros) {
		this.pasajeros = pasajeros;
	}

	public static Integer getNumerodeplazas() {
		return numeroDePlazas;
	}

	public Vuelo(String destino, Double precio, LocalDate fechaDeSalida, LocalDate fechaDeLlegada,
			LocalTime horaDeSalida, LocalTime horaDeLlegada, Integer pasajeros) {
		super();
		this.destino = destino;
		this.precio = precio;
		this.fechaDeSalida = fechaDeSalida;
		this.fechaDeLlegada = fechaDeLlegada;
		this.horaDeSalida = horaDeSalida;
		this.horaDeLlegada = horaDeLlegada;
		this.pasajeros = pasajeros;
	}

	public Vuelo(String destino2, double precio2, LocalDate of, LocalDate of2, java.time.LocalTime of3,
			java.time.LocalTime of4, int pasajeros2) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Persona [destino=" + destino + ", precio=" + precio + ", fechaDeSalida=" + fechaDeSalida
				+ ", fechaDeLlegada=" + fechaDeLlegada + ", horaDeSalida=" + horaDeSalida + ", horaDeLlegada="
				+ horaDeLlegada + ",pasajeros=" + pasajeros + "]";
	}

	public static List<Vuelo> getVuelos() {
		List<Vuelo> vuelos;

		vuelos = new ArrayList<>();

		// numero de plazas las dejo en 10 para mayor facilidad y al ser final, es 10 en
		// todos
		vuelos.add(new Vuelo("Australia", 140.05, LocalDate.of(2018, Month.SEPTEMBER, 26),
				LocalDate.of(2018, Month.SEPTEMBER, 29), LocalTime.of(15, 00), LocalTime.of(20, 00), 7));

		vuelos.add(new Vuelo("Belgica", 250.40, LocalDate.of(2018, Month.NOVEMBER, 01),
				LocalDate.of(2018, Month.NOVEMBER, 10), LocalTime.of(12, 30), LocalTime.of(17, 45), 10));

		vuelos.add(new Vuelo("Colombia", 700.97, LocalDate.of(2018, Month.DECEMBER, 19),
				LocalDate.of(2018, Month.DECEMBER, 25), LocalTime.of(00, 00), LocalTime.of(23, 05), 11));

		vuelos.add(new Vuelo("Dinamarca", 40.00, LocalDate.of(2019, Month.FEBRUARY, 02),
				LocalDate.of(2019, Month.FEBRUARY, 10), LocalTime.of(13, 00), LocalTime.of(19, 00), 3));

		return vuelos;

	}
}
