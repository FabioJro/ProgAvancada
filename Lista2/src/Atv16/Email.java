package Atv16;

import java.util.List;

public class Email {
    
	private int NomeDoEmail;
	List<Destinatario> destinatario;
	public int getNomeDoEmail() {
		return NomeDoEmail;
	}
	public void setNomeDoEmail(int nomeDoEmail) {
		NomeDoEmail = nomeDoEmail;
	}
	public List<Destinatario> getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(List<Destinatario> destinatario) {
		this.destinatario = destinatario;
	}
	
	
}
