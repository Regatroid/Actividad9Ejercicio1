package com.principal;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
	private LocalDateTime fechaDeSalida;
	private LocalDateTime fechaDeLlegada;
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

	public LocalDateTime getFechaDeSalida() {
		return fechaDeSalida;
	}

	public void setFechaDeSalida(LocalDateTime fechaDeSalida) {
		this.fechaDeSalida = fechaDeSalida;
	}

	public LocalDateTime getFechaDeLlegada() {
		return fechaDeLlegada;
	}

	public void setFechaDeLlegada(LocalDateTime fechaDeLlegada) {
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

	public Vuelo(String destino, Double precio, LocalDateTime fechaDeSalida, LocalDateTime fechaDeLlegada,
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
        
        public static List<Vuelo> getVuelos() {
		List<Vuelo> vuelos = new ArrayList<>();

		vuelos.add(new Vuelo("Australia", 140.05, LocalDateTime.of(2018,  Month.OCTOBER, 03 , 00, 00, 00, 00),
				LocalDateTime.of(2018, Month.OCTOBER, 03, 00, 00, 00, 00), LocalTime.of(15, 00), LocalTime.of(20, 00), 7));

		vuelos.add(new Vuelo("Belgica", 250.40, LocalDateTime.of(2018, Month.NOVEMBER, 01, 14, 20, 00, 00),
				LocalDateTime.of(2018, Month.NOVEMBER, 10, 13, 00, 00, 00), LocalTime.of(12, 30), LocalTime.of(17, 45), 10));

		vuelos.add(new Vuelo("Colombia", 700.97, LocalDateTime.of(2018, Month.DECEMBER, 19, 15, 20, 30, 00),
				LocalDateTime.of(2018, Month.DECEMBER, 25, 20, 30, 00, 00), LocalTime.of(00, 00), LocalTime.of(23, 05), 8));
		

		vuelos.add(new Vuelo("Dinamarca", 40.00, LocalDateTime.of(2019, Month.FEBRUARY, 02, 23, 50, 00, 00),
				LocalDateTime.of(2019, Month.FEBRUARY, 10, 00, 00, 00, 00), LocalTime.of(13, 00), LocalTime.of(19, 00), 3));

		return vuelos;

	} //fin lista vuelos



	@Override
	public String toString() {
		return "Vuelo [destino=" + destino + ", precio=" + precio + ", fechaDeSalida=" + fechaDeSalida
				+ ", fechaDeLlegada=" + fechaDeLlegada + ", horaDeSalida=" + horaDeSalida + ", horaDeLlegada="
				+ horaDeLlegada + ",pasajeros=" + pasajeros + "]";
	}
} //fin main
