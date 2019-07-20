package SpringBootCloudFunction.SpringBootCloudFunction;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootCloudFunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCloudFunctionApplication.class, args);
	}
	
	@Bean public Consumer<String> consumerTest() {
		return value -> System.out.println("consumerTest {} you have entered --->" + value);
	}

	@Bean public Function<String, String> functionTest() {
		return value -> new String("supplier test using spring cloud function {}   and you have entered "+value);
	}
	
	@Bean Supplier<String> supplierTest() {
		return () -> new String("supplierTest {} supplier test using spring cloud function");
	}

}
