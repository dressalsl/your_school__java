package your_school.entidades;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Turma {
	private String serie;
	private String  turno;
	private String codigo;
	private Professor professor;
	private List<Aluno> alunos = new ArrayList();

	// ==================== CONSTRUTORES
	
	
	/**
	 * Construtor padrao sem parametros em situacoes que seja necessario criar um objeto Turma sem definir os valores iniciais dos atributos.
	 */
	public Turma() {
		
	}
	/**
	 * Construtor que recebe parametros para iniciar todos os atributos de um objeto Turma.
	 */
	
	public Turma(String serie, String turno, String codigo, Professor professor) {
		this.setSerie(serie);
		this.setTurno(turno);
		this.setCodigo(codigo);
		this.setProfessor(professor);
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	
	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	public void addAluno (Aluno aluno){
		this.alunos.add(aluno);
	}
	
	public void removeAluno (Aluno aluno){
		this.alunos.remove(aluno);
	}
	
	// ==================== GETs e SETs

	

}
