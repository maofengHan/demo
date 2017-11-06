package top.ihmf.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApp {
	public static void main(String[] args) {
		SpringApplication.run(DemoApp.class, args);
	}

	@GetMapping(value = { "/", "/index", "/name" })
	public String index(@RequestParam(name = "name", required = false, defaultValue = "World") String name) {
		return String.format("Hello, %s!", name);
	}
}
