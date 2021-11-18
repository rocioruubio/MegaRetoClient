package com.ntt.megareto.MegaRetoClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.ntt.megareto.MegaRetoClient.models.BancoBuilder;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class MegaRetoClientApplication implements CommandLineRunner {
	
	@Autowired
	BancoBuilder builder;
	
	@Autowired
	BancoService servicio;
	
	public static void main(String[] args) {
		SpringApplication.run(MegaRetoClientApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		servicio.listaBanco.add(builder.getnumCuentaB(565495L).getnombreTitularB("ROCIO").getapellidosTitularB("RUBIO LADO").build());
		
	}
	
}
