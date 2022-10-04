package Atv15;



public class Parceiro {
	
	private  String tipoPessoa;
	private float desempenho;
	private Fisica fisica;
	private Juridica juridica;
	
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

	public Fisica getFisica() {
		return fisica;
	}

	public void setFisica(Fisica fisica) {
		this.fisica = fisica;
	}

	public Juridica getJuridica() {
		return juridica;
	}

	public void setJuridica(Juridica juridica) {
		this.juridica = juridica;
	}

}
