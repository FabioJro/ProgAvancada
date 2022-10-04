package Atv16;

import java.util.List;

public class Email {
    
	private int NomeDoEmail;
	List<Destinatario> destinatario;
	private Texto texto;
	private Assunto assunto;
	
	public void Escrever(){
		System.out.println("Escrevendo e-mail");
	}
	public void Excluir(){
		System.out.println("Excluindo e-mail");
	}
	public void Anexar(){
		System.out.println("E-mail anexado");
	}
	public void Responder(){
		System.out.println("Respondendo e-mail");
	}

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
    public Texto getTexto() {
        return texto;
    }
    public void setTexto(Texto texto) {
        this.texto = texto;
    }
    public Assunto getAssunto() {
        return assunto;
    }
    public void setAssunto(Assunto assunto) {
        this.assunto = assunto;
    }
	
	
}
