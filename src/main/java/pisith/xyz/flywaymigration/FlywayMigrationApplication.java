package pisith.xyz.flywaymigration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import pisith.xyz.flywaymigration.products.Product;
import pisith.xyz.flywaymigration.products.ProductRepository;

@SpringBootApplication
@EnableTransactionManagement
public class FlywayMigrationApplication implements CommandLineRunner {

	private final ProductRepository productRepository;

	FlywayMigrationApplication (ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(FlywayMigrationApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		productRepository.findAll().forEach(product -> {
			System.out.println(product.toString());
		});
	}
}
