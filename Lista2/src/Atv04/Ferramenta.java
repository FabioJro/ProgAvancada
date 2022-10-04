package Atv04;

public class Ferramenta extends ItemDeLoja {

	private String categoria;
	private Integer serial;

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getSerial() {
		return serial;
	}

	public void setSerial(Integer serial) {
		this.serial = serial;
	}

	@Override
	public int getIdentificador() {
		return serial;
	}

	public void separar() {

		categoria = "outros";
	}

	public void separar(String valor) {

		categoria = valor;
	}

}