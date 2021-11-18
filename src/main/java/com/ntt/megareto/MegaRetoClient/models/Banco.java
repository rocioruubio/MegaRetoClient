package com.ntt.megareto.MegaRetoClient.models;

public class Banco {

	private Long numCuenta;
	private String nombreTitular;
	private String apellidosTitular;

	public Banco() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Banco(Long numCuenta, String nombreTitular, String apellidosTitular) {
		super();
		this.numCuenta = numCuenta;
		this.nombreTitular = nombreTitular;
		this.apellidosTitular = apellidosTitular;
	}

	public Long getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(Long numCuenta) {
		this.numCuenta = numCuenta;
	}

	public String getNombreTitular() {
		return nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	public String getApellidosTitular() {
		return apellidosTitular;
	}

	public void setApellidosTitular(String apellidosTitular) {
		this.apellidosTitular = apellidosTitular;
	}

	@Override
	public String toString() {
		return "Banco [numCuenta=" + numCuenta + ", nombreTitular=" + nombreTitular + ", apellidosTitular="
				+ apellidosTitular + "]";
	}

}
