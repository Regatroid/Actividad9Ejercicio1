package com.principal;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Aeropuerto {

	public static void main(String[] args) {

		// creo una lista de vuelos
		List<Vuelo> vuelos;
		// obtengo todas los vuelos y las almaceno en variable vuelos
		vuelos = Vuelo.getlistaVuelos();

		// compruebo que no sale null
		// System.out.println(vuelos);

		/*
		 * 1. Obtener un listado de los List<Vuelo> que no admiten mas pasajeros, es
		 * decir, que tienen el numero de plazas completo.
		 */
		System.out.println("Ejercicio 1 *************************************************   ");

//		List<Vuelo> vuelosCompletos = vuelos.stream().filter(a -> a.getPasajeros() == Vuelo.getNumerodeplazas())
//				.collect(Collectors.toList());
//		vuelosCompletos.forEach(v -> System.out.println(v));

		List<Vuelo> vuelosCompletos;
		vuelosCompletos = vuelos.stream().filter(v -> v.getPasajeros().size() == Vuelo.getNumeroDePlazas())
				.collect(Collectors.toList());

		/*
		 * * 2. Obtener un listado de los vuelos que tienen fecha de salida prevista
		 * para el día de hoy.
		 */
		System.out.println("Ejercicio 2 *************************************************   ");

		List<Vuelo> fechaSalidaHoy = vuelos.stream().filter(b -> b.getFechaDeSalida().equals(LocalDate.now()))
				.collect(Collectors.toList());

		fechaSalidaHoy.stream().forEach(System.out::println);

		/*
		 * * 3. Obtener un listado de los vuelos cuya duración sea mayor de 10 horas.
		 */
		System.out.println("Ejercicio 3 *************************************************   ");

		List<Vuelo> masHoras = vuelos.stream()
				.filter(c -> ChronoUnit.HOURS.between(LocalDateTime.of(c.getFechaDeSalida(), c.getHoraDeSalida()),
						LocalDateTime.of(c.getFechaDeLlegada(), c.getHoraDeLlegada())) > 10)
				.collect(Collectors.toList());

		// periodo dias mes y años
		// duracion horas minutos y segundos

		// esta es una forma de usarlo con chronounit que originalmente no funcionaria

		System.out.println(masHoras);

		/* esto seria otra variante para el ejercicio */

		List<Vuelo> masHoras2 = vuelos.stream()
				.filter(c -> Duration.between(LocalDateTime.of(c.getFechaDeSalida(), c.getHoraDeSalida()),
						LocalDateTime.of(c.getFechaDeLlegada(), c.getHoraDeLlegada())).toHours() > 10)
				.collect(Collectors.toList());
		System.out.println(masHoras2);

		/*
		 * * 4. Obtener un listado de los vuelos que pueden demorar mas de un día en
		 * llegar a su destino.
		 */

		System.out.println("Ejercicio 4 *************************************************   ");

		List<Vuelo> masDia = vuelos.stream()
				.filter(c -> Duration.between(LocalDateTime.of(c.getFechaDeSalida(), c.getHoraDeSalida()),
						LocalDateTime.of(c.getFechaDeLlegada(), c.getHoraDeLlegada())).toDays() > 1)
				.collect(Collectors.toList());
		System.out.println(masDia);

		/*
		 * * 5. ES UNA LISTA DE UNA LISTA Obtener una colección que almacene listado de
		 * pasajeros agrupado por destino del vuelo, ordenada por el destino del vuelo.
		 */

		System.out.println("Ejercicio 5 *************************************************   ");

//		System.out.println("Ejercicio 5");
//		Map<String, List<List<Pasajero>>> pasajerosPorDestino;
//		pasajerosPorDestino = vuelos.stream().collect(Collectors.groupingBy(Vuelo::getDestino, Collectors.mapping(Vuelo::getPasajeros, Collectors.toList())));
//		//sin ordenar, para ordenarlo lo copiamos a un treemap
//		
//		//lo ordenamos
//		pasajerosPorDestino = new TreeMap<>((o1, o2) ->  {
//			return o1.compareTo(o2);
//		});
//		//recorrer el mapa no ordenado al ordenado
//		pasajerosPorDestino.putAll(pasajerosPorDestino);

//		/*
//		 * * 6. Mostrar los vuelos que saldrán dentro de una semana (mas haya de 7
//		 * dias).
//		 */
		System.out.println("Ejercicio 6 *************************************************   ");
//		List<Vuelo> vuelosMasSemana = vuelos.stream()
//				.filter(e -> e.getFechaDeSalida().equals(LocalDate.now().plusDays(7)))
//				.collect(Collectors.toList());
//		System.out.println(vuelosMasSemana);

		List<Vuelo> vuelosDentroDeUnaSemana = vuelos.stream()
				.filter(e -> e.getFechaDeSalida().isAfter(LocalDate.now().plusDays(7))).collect(Collectors.toList());
//
//		/* 7. Mostrar los vuelos que saldrán en los próximos 7 días. */
//
		System.out.println("Ejercicio 7 *************************************************   ");

		List<Vuelo> vuelosSieteDias = vuelos.stream()
				.filter(f -> f.getFechaDeSalida().isBefore(LocalDate.now().plusDays(7))).collect(Collectors.toList());
		System.out.println(vuelosSieteDias);

		/*
		 * * 8. Crear una colección que almacene listado de pasajeros, agrupado por el
		 * sexo y la edad del pasajero.
		 */
		System.out.println("Ejercicio 8 *************************************************   ");

//		vuelos.stream().map(Vuelo::getPasajeros)
//		.collect(Collectors.groupingBy(Pasajero::getSexo, 
//				Collectors.mapping(Pasajero::getEdad, Collectors.toList())));
		// no funciona, porque quiere que le devuelva un vuelo

		List<Map<Pasajero.Sexo, Map<Integer, List<Pasajero>>>> pasajerosPorEdadSexo = vuelos.stream()
				.map(v -> v.getPasajeros().stream()
				.collect(Collectors.groupingBy(Pasajero::getSexo, Collectors.groupingBy(Pasajero::getEdad))))
				.collect(Collectors.toList());
		
		System.out.println(pasajerosPorEdadSexo);

		/* 9. Recorrer y mostrar la colección creada en el punto 8, ordenada por el
		 * nombre y los apellidos de los pasajeros en orden natural.*/
		
		System.out.println("Ejercicio 9 *************************************************   ");
		
		
	
	} // fin de main
} // fin de clase