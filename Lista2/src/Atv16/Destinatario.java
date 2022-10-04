package Atv16;

public class Destinatario extends Email {
	
	private int EmailDestinatario;
	
	public int getEmailDestinatario() {
		return EmailDestinatario;
	}

	public void setEmailDestinatario(int emailDestinatario) {
		EmailDestinatario = emailDestinatario;
	}

	private Destinatario Buscar() {
		Destinatario dest = new Destinatario();
		return dest;
		
	}
	
	private void Adicionar() {
		System.out.println("Email adicionado");
	}
	
	private void Apagar() {
		
		System.out.println("Email apagado");
	}
	

}
