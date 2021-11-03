// Categoría, mensaje, reservación, cliente, machine
// 1. Modelo o entidad
// 2. Interfaces
// 3. Repositorio
// 4. Servicios
// 5. Controlador o Web




package reto3.inicial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"reto3.inicial.modelo"})
public class InicialApplication {

	public static void main(String[] args) {
		SpringApplication.run(InicialApplication.class, args);
	}

}
