package Atv3;

public class MeioDeTransporte {

	private Integer id;
	private short ano;
	private String modelo;
	private double carga_maxima;
	private Terrestre terrestre;

	public double consumo() {
		return this.carga_maxima*100;
	}
}

