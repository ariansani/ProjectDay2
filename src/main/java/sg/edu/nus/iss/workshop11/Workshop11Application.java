package sg.edu.nus.iss.workshop11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Workshop11Application {

	public static void main(String[] args) {
		SpringApplication.run(Workshop11Application.class, args);
	}

	// public static void main(String[] args) {
	// SpringApplication app = new SpringApplication(Workshop11Application.class);
	// String port = "8080";
	// ApplicationArguments cliOpts = new DefaultApplicationArguments(args);
	// if cliOpts.containsOption(“port”)
	// port = cliOpts.getOptionValues(“port”).get(0); // get the first value
	// app.setDefaultProperties(
	// Collections.singletonMap(“server.port”, port)
	// );
	// System.out.printf(“Application started on port %d\n”, port);
	// app.run(args);
	// }

}
