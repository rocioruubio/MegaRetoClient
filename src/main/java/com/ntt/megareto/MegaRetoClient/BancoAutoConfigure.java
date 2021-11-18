package com.ntt.megareto.MegaRetoClient;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ntt.megareto.MegaRetoClient.models.Banco;
import com.ntt.megareto.MegaRetoClient.models.BancoBuilder;

@Configuration
@ConditionalOnClass({Banco.class,BancoBuilder.class, BancoService.class})
public class BancoAutoConfigure {
	
	@Bean
	public BancoBuilder bancoBuilder() {
		return new BancoBuilder();
	}
	
	@Bean
	public BancoService bancoService() {
		return new BancoService();
	}

}
