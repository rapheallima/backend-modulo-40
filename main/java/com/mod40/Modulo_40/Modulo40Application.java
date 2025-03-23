package com.mod40.Modulo_40;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.mod40.Modulo_40.main.Produto;
import com.mod40.Modulo_40.repository.ProdutoRepository;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
@Configuration
@EnableJpaRepositories(basePackages = "com.mod40.Modulo_40.repository")
@EntityScan("com.mod40.Modulo_40.*")
@ComponentScan(basePackages = "com.mod40.Modulo_40")
public class Modulo40Application implements CommandLineRunner {

	private static final Logger log = (Logger) LoggerFactory.getLogger(Modulo40Application.class);

	@Autowired
	private ProdutoRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Modulo40Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("StartApplication...");
		Produto produto = createProduto();
		repository.save(produto);
	}

	private Produto createProduto() {
		return Produto.builder().nome("celular").preco(1500.00).build();
	}

}
