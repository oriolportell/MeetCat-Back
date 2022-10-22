package upc.fib.pes.grup121

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer


@SpringBootApplication
class Grup121Application : SpringBootServletInitializer()

fun main(args: Array<String>) {
	runApplication<Grup121Application>(*args)
}

@Override
fun configure(builder: SpringApplicationBuilder): SpringApplicationBuilder? {
	return builder.sources(Grup121Application::class.java)
}
