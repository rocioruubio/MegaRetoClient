package com.ntt.megareto.MegaRetoClient.models;

public class BancoBuilder {
	
	private Long numCuenta = null;
	private String nombreTitular = null;
	private String apellidosTitular = null;
	
	public BancoBuilder getnumCuentaB(Long numCuenta) {
		this.numCuenta = numCuenta;
		return this;
	}
	
	public BancoBuilder getnombreTitularB(String nombreTitular) {
		this.nombreTitular = nombreTitular;
		return this;
	}
	
	public BancoBuilder getapellidosTitularB(String apellidosTitular) {
		this.apellidosTitular = apellidosTitular;
		return this;
	}
	
	public Banco build() {
		return new Banco(this.numCuenta, this.nombreTitular, this.apellidosTitular);
	}
}
