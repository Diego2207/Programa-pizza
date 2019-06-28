package com.br.projeto.pizza.model;

public class PizzaModel {
	
	private String sabor;
	private String massa;
	private String borda;
	private double valor;
	
	
	public PizzaModel() {
		
	}


	public PizzaModel( String sabor, String massa, String borda, double valor) {
		
		this.sabor = sabor;
		this.massa = massa;
		this.borda = borda;
		this.valor = valor;
	}


	public String getSabor() {
		return sabor;
	}


	public void setSabor(String sabor) {
		this.sabor = sabor;
	}


	public String getMassa() {
		return massa;
	}


	public void setMassa(String massa) {
		this.massa = massa;
	}


	public String getBorda() {
		return borda;
	}


	public void setBorda(String borda) {
		this.borda = borda;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String toString() {
		StringBuilder modelo = new StringBuilder();
		
		modelo.append("Sabor: "+ this.sabor);
		modelo.append("Massa: "+ this.massa);
		modelo.append("Borda: "+ this.borda);
		modelo.append("valor: "+ this.valor);
		
		return modelo.toString();
		
		
	}
}
