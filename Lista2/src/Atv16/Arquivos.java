package Atv16;

public class  Arquivos extends Email {
	
	private String nomeArquivo;
	private int Tamanho;
	private String Formato;

 @Override
 public void Anexar(){
	System.out.println("Arquivo anexado");
}
	public void Remover(){

		System.out.println("Arquivo removido");
	}
	public String getNomeArquivo() {
		return nomeArquivo;
	}
	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	public int getTamanho() {
		return Tamanho;
	}
	public void setTamanho(int tamanho) {
		Tamanho = tamanho;
	}
	public String getFormato() {
		return Formato;
	}
	public void setFormato(String formato) {
		Formato = formato;
	}

	
	
	

}
