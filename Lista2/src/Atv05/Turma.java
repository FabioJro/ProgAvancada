package Atv05;

import java.util.List;

public class Turma {

	private String cod;
	private Integer turno;
	private Integer sala;
	private List<Aluno> aluno;

	public List<Aluno> getAluno() {
		return aluno;
	}
	public void setAluno(List<Aluno> aluno) {
		this.aluno = aluno;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public Integer getTurno() {
		return turno;
	}
	public void setTurno(Integer turno) {
		this.turno = turno;
	}
	public Integer getSala() {
		return sala;
	}
	public void setSala(Integer sala) {
		this.sala = sala;
	}
	

	
}