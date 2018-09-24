package com.principal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;


public class AeroPuertoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Cuarto:
		 * 
		 * 1. Obtener un listado de los vuelos que no admiten mas pasajeros, es decir,
		 * que tienen el numero de plazas completo. 
		 * 
		 * 2. Obtener un listado de los vuelos
		 * que tienen fecha de salida prevista para el día de hoy. 3. Obtener un listado
		 * de los vuelos cuya duración sea mayor de 10 horas. 4. Obtener un listado de
		 * los vuelos que pueden demorar mas de un día en llegar a su destino. 5.
		 * Obtener una colección que almacene listado de pasajeros agrupado por destino
		 * del vuelo, ordenada por el destino del vuelo. 6. Mostrar los vuelos que
		 * saldrán dentro de una semana (mas haya de 7 dias). 7. Mostrar los vuelos que
		 * saldrán en los próximos 7 días. 8. Crear una colección que almacene listado
		 * de pasajeros, agrupado por el sexo y la edad del pasajero. 9. Recorrer y
		 * mostrar la colección creada en el punto 8, ordenada por el nombre y los
		 * apellidos de los pasajeros en orden natural. 10. Recorrer y mostrar la
		 * colección creada en el punto 8, ordenada en orden alfabético inverso por el
		 * primero apellido del pasajero. 11. Obtener una colección que almacene el
		 * nombre y los apellidos de los pasajeros, agrupados por el total de horas de
		 * la duración de su viaje. Mostrar la colección resultante. 12. Enviar un
		 * mensaje a los pasajeros cuyo vuelo saldrá en las próximas tres horas. 13.
		 * Enviar un mensaje a los pasajeros cuyo vuelo saldrá en los próximos tres
		 * días. 14. Crear una colección que almacene el listado de pasajeros agrupado
		 * por el día en que tiene lugar su vuelo, considerando que el vuelo tiene lugar
		 * en el mes en curso. Al mostrar la colección resultante, mostrar el nombre del
		 * día de la semana en español. 15. Crear una colección de los vuelos que no
		 * están previstos para el mes en curso y mostrar el nombre del mes para el cual
		 * esta prevista su fecha de salida, en español.
		 * 
		 */
		
				// creo una lista de vuelos
				List<Vuelo> vuelos;
				// obtengo todas las personas y las almaceno en variable personas
				vuelos = Vuelo.getVuelos();
				// vuelvo la variable vuelos en un array de tipo vuelo
				vuelos = new ArrayList<Vuelo>(vuelos);
				// creo una lista con los nombre que obtengo de personas
				List<Integer> pasajero = pasajero.stream().max(Comparator<Vuelo::getPasajeros, Vuelo::getPasajeros>).collect(Collectors.toList());
				// vuelvo la lista a un array
				pasajero = new ArrayList<Integer>(pasajero);
				System.out.println(pasajero);

//				List<String> nombres = personas.stream().map(Persona::getNombre).collect(Collectors.toList());
//
//				LocalDate ahora = LocalDate.now();
	}

}
