package com.principal;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vrmachado
 */
public class Vuelo {

    private String destino;
    private Double precio;
    private LocalDate fechaDeSalida;
    private LocalTime horaDeSalida;
    private LocalDate fechaDeLlegada;
    private LocalTime horaDeLlegada;
    private static final Integer numeroDePlazas = 3;
    private List<Pasajero> pasajeros;

    public Vuelo(String destino,
            Double precio,
            LocalDate fechaDeSalida,
            LocalTime horaDeSalida,
            LocalDate fechaDeLlegada,
            LocalTime horaDeLlegada,
            List<Pasajero> pasajeros) {
        this.destino = destino;
        this.precio = precio;
        this.fechaDeSalida = fechaDeSalida;
        this.horaDeSalida = horaDeSalida;
        this.fechaDeLlegada = fechaDeLlegada;
        this.horaDeLlegada = horaDeLlegada;
        this.pasajeros = pasajeros;
    }

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

    public LocalTime getHoraDeSalida() {
        return horaDeSalida;
    }

    public void setHoraDeSalida(LocalTime horaDeSalida) {
        this.horaDeSalida = horaDeSalida;
    }

    public LocalDate getFechaDeLlegada() {
        return fechaDeLlegada;
    }

    public void setFechaDeLlegada(LocalDate fechaDeLlegada) {
        this.fechaDeLlegada = fechaDeLlegada;
    }

    public LocalTime getHoraDeLlegada() {
        return horaDeLlegada;
    }

    public void setHoraDeLlegada(LocalTime horaDeLlegada) {
        this.horaDeLlegada = horaDeLlegada;
    }

    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(List<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public static Integer getNumeroDePlazas() {
        return numeroDePlazas;
    }

    //*** Crear listado de Vuelos ***//
    public static List<Vuelo> getlistaVuelos() {
        List<Vuelo> lista = new ArrayList<>();
        lista.add(new Vuelo("Madrid", 153.21, LocalDate.now(), LocalTime.of(14, 30), LocalDate.of(2018, Month.SEPTEMBER, 27),
                LocalTime.of(17, 50), Pasajero.pasajerosMadrid()));
        lista.add(new Vuelo("Murcia", 153.21, LocalDate.now(), LocalTime.of(11, 30), LocalDate.of(2018, Month.SEPTEMBER, 29),
                LocalTime.of(11, 29), Pasajero.pasajerosMurcia()));
        lista.add(new Vuelo("Alicante", 153.21, LocalDate.of(2018, Month.SEPTEMBER, 29), LocalTime.of(13, 30), LocalDate.of(2018, Month.SEPTEMBER, 29),
                LocalTime.of(23, 30), Pasajero.pasajerosAlicante()));
        lista.add(new Vuelo("Almeria", 153.21, LocalDate.of(2018, Month.SEPTEMBER, 30), LocalTime.of(14, 30), LocalDate.of(2018, Month.SEPTEMBER, 30),
                LocalTime.of(17, 50), Pasajero.pasajerosAlmeria()));
        lista.add(new Vuelo("Sevilla", 153.21, LocalDate.of(2018, Month.OCTOBER, 05), LocalTime.of(14, 30), LocalDate.of(2018, Month.SEPTEMBER, 26),
                LocalTime.of(17, 50), Pasajero.pasajerosSevilla()));

        return lista;
    }

    @Override
    public String toString() {
        return "Destino: " + destino; //To change body of generated methods, choose Tools | Templates.
    }

    
}

/*------------------------------------------------------COPIADO DEL PROFESOR--------------------------------------------------------------------------------*/

//package com.principal;
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.LocalTime;
//import java.time.Month;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Vuelo {
//
//	/*
//	 * Crear una clase Vuelo, con las siguientes propiedades:
//	 * 
//	 * 1. destino 2. precio 3. fechaDeSalida 4. horaDeSalida 5. fechaDeLlegada 6.
//	 * horaDeLlegada 7. numeroDePlazas es: static y final y integer 8. pasajeros
//	 * (Listado de pasajeros del vuelo)
//	 */
//
//	private String destino;
//	private Double precio;
//	private LocalDate fechaDeSalida;
//	private LocalDate fechaDeLlegada;
//	private LocalTime horaDeSalida;
//	private LocalTime horaDeLlegada;
//	private static final Integer numeroDePlazas = 10;
//	private Integer pasajeros;
//
//	public String getDestino() {
//		return destino;
//	}
//
//	public void setDestino(String destino) {
//		this.destino = destino;
//	}
//
//	public Double getPrecio() {
//		return precio;
//	}
//
//	public void setPrecio(Double precio) {
//		this.precio = precio;
//	}
//
//	public LocalDate getFechaDeSalida() {
//		return fechaDeSalida;
//	}
//
//	public void setFechaDeSalida(LocalDate fechaDeSalida) {
//		this.fechaDeSalida = fechaDeSalida;
//	}
//
//	public LocalDate getFechaDeLlegada() {
//		return fechaDeLlegada;
//	}
//
//	public void setFechaDeLlegada(LocalDate fechaDeLlegada) {
//		this.fechaDeLlegada = fechaDeLlegada;
//	}
//
//	public LocalTime getHoraDeSalida() {
//		return horaDeSalida;
//	}
//
//	public void setHoraDeSalida(LocalTime horaDeSalida) {
//		this.horaDeSalida = horaDeSalida;
//	}
//
//	public LocalTime getHoraDeLlegada() {
//		return horaDeLlegada;
//	}
//
//	public void setHoraDeLlegada(LocalTime horaDeLlegada) {
//		this.horaDeLlegada = horaDeLlegada;
//	}
//
//	public Integer getPasajeros() {
//		return pasajeros;
//	}
//
//	public void setPasajeros(Integer pasajeros) {
//		this.pasajeros = pasajeros;
//	}
//
//	public static Integer getNumerodeplazas() {
//		return numeroDePlazas;
//	}
//
//	public Vuelo(String destino, Double precio, LocalDate fechaDeSalida, LocalDate fechaDeLlegada,
//			LocalTime horaDeSalida, LocalTime horaDeLlegada, Integer pasajeros) {
//		super();
//		this.destino = destino;
//		this.precio = precio;
//		this.fechaDeSalida = fechaDeSalida;
//		this.fechaDeLlegada = fechaDeLlegada;
//		this.horaDeSalida = horaDeSalida;
//		this.horaDeLlegada = horaDeLlegada;
//		this.pasajeros = pasajeros;
//	}
//        
//        public static List<Vuelo> getVuelos() {
//		List<Vuelo> vuelos = new ArrayList<>();
//
//		vuelos.add(new Vuelo("Australia", 140.05, LocalDate.of(2018,  Month.OCTOBER, 03),
//				LocalDate.of(2018, Month.OCTOBER, 03), LocalTime.of(15, 00), LocalTime.of(20, 00), 7));
//
//		vuelos.add(new Vuelo("Belgica", 250.40, LocalDate.of(2018, Month.NOVEMBER, 01),
//				LocalDate.of(2018, Month.NOVEMBER, 10), LocalTime.of(12, 30), LocalTime.of(17, 45), 10));
//
//		vuelos.add(new Vuelo("Colombia", 700.97, LocalDate.of(2018, Month.DECEMBER, 19),
//				LocalDate.of(2018, Month.DECEMBER, 25), LocalTime.of(00, 00), LocalTime.of(23, 05), 8));
//		
//
//		vuelos.add(new Vuelo("Dinamarca", 40.00, LocalDate.of(2019, Month.FEBRUARY, 02),
//				LocalDate.of(2019, Month.FEBRUARY, 10), LocalTime.of(13, 00), LocalTime.of(19, 00), 3));
//
//		return vuelos;
//
//	} //fin lista vuelos
//
//
//
//	@Override
//	public String toString() {
//		return "Vuelo destino=" + destino + ", precio=" + precio + ", fechaDeSalida=" + fechaDeSalida
//				+ ", fechaDeLlegada=" + fechaDeLlegada + ", horaDeSalida=" + horaDeSalida + ", horaDeLlegada="
//				+ horaDeLlegada + ",pasajeros=" + pasajeros + "";
//	}
//} //fin main
