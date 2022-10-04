package Atv15;

public class Usuario {

	private String login;
	private String senha;
	private String permissao;
	private Colaborador colaborador;
	
	

	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getPermissao() {
		return permissao;
	}

	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}

	public void alterarSenha() {

		System.out.println("Senha alterada");

	}

	public void apagarUsuario() {

		System.out.println("Ususario deletado");

	}

	public void editarPerfil() {

		System.out.println("Perfil alterado");
	}

	public void criarUsuario() {
		System.out.println("Usuario criado");
	}

}
