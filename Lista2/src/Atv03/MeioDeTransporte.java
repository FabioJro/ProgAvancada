package Atv03;

import java.util.Scanner;

public class MeioDeTransporte {

	private Integer id;
	private short ano;
	private String modelo;
	private double carga_maxima;
	private Terrestre terrestre;

	public double consumo() {
		Terrestre trans = new Terrestre();
		Scanner scan = new Scanner(System.in);
		double potencia = scan.nextDouble();
		trans.setPotencia(potencia);
		double calulo = this.carga_maxima*100*trans.getPotencia();
		
		return calulo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public short getAno() {
		return ano;
	}

	public void setAno(short ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getCarga_maxima() {
		return carga_maxima;
	}

	public void setCarga_maxima(double carga_maxima) {
		this.carga_maxima = carga_maxima;
	}

	public Terrestre getTerrestre() {
		return terrestre;
	}

	public void setTerrestre(Terrestre terrestre) {
		this.terrestre = terrestre;
	}
	
}

