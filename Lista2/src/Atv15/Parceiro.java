package Atv15;

import java.util.List;

public class Parceiro {
	
	private  String tipoPessoa;
	private float desempenho;
	private List<Fisica> fisica;
	public List<Fisica> getFisica() {
		return fisica;
	}

	public void setFisica(List<Fisica> fisica) {
		this.fisica = fisica;
	}

	private List<Juridica> juridica;
	
	public List<Juridica> getJuridica() {
		return juridica;
	}

	public void setJuridica(List<Juridica> juridica) {
		this.juridica = juridica;
	}

	public void cadastrar() {
		System.out.println("Parceiro foi cadastrado");
	}
	
	public void bloquear() {
		
		System.out.println("Parceiro foi bloqueado");
	}
	
	public void excluir() {
		
		System.out.println("Parceiro excluido");
	}

	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public float getDesempenho() {
		return desempenho;
	}

	public void setDesempenho(float desempenho) {
		this.desempenho = desempenho;
	}

	

}
