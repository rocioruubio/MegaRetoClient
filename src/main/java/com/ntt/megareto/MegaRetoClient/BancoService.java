package com.ntt.megareto.MegaRetoClient;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.ntt.megareto.MegaRetoClient.models.Banco;

public class BancoService {
	
	List<Banco> listaBanco;
	
	public BancoService() {
		this.listaBanco = new ArrayList<Banco>();
	}

	public List<Banco> getlistBanco() {
		return listaBanco;
	}

	public void setlistaBanco(List<Banco> dbPersonas) {
		this.listaBanco = dbPersonas;
	}
	
	public List<Banco> getAll(){
		return this.listaBanco;
	}
	
}
