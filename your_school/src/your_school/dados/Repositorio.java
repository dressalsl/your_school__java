package your_school.dados;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import your_school.entidades.Aluno;
import your_school.entidades.Professor;
import your_school.entidades.Turma;
import your_school.excecoes.TurmaInvalidoException;
import your_school.negocio.ControladorCadastroTurma;

public class Repositorio {
	
// ==================== ATRIBUTOS ESTATICOS

	private static Repositorio instancia;

	// ==================== ATRIBUTOS
	
	/**
	 * Conjunto de alunos que armazena todos os alunos cadastrados no sistema da escola.
	 */
	private Set<Aluno> alunos;
	private Set<Professor> professores;
	private Set<Turma> turmas;

	
	// ==================== CONSTRUTORES
	
	private Repositorio() {
		this.alunos = new HashSet<Aluno>();
		this.professores = new HashSet<Professor>();
		this.turmas = new HashSet<Turma>();
	}
	
	// ==================== METODOS ESTATICOS
	
	public static Repositorio getInstancia() {
		if (instancia == null) {
			instancia = new Repositorio();
		}
		
		return instancia;
	}

	// ==================== METODOS PUBLICOS
	
	// ==================== ALUNOS
	
	public void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public Set<Aluno> obterTodosAlunos() {
		return this.alunos;
	}

	public void atualizarAluno(Aluno alunoAtualizado) {
		for (Aluno alunoCadastrado : this.alunos) {
			if (alunoCadastrado.getCpf().equals(alunoAtualizado.getCpf())) {
				alunoCadastrado.setNome(alunoAtualizado.getNome());
				alunoCadastrado.setRg(alunoAtualizado.getRg());
				alunoCadastrado.setCpf(alunoAtualizado.getCpf());
				alunoCadastrado.setEndereco(alunoAtualizado.getEndereco());
				alunoCadastrado.setData_nasc(alunoAtualizado.getData_nasc());
				alunoCadastrado.setSexo(alunoAtualizado.getSexo());
				alunoCadastrado.setNome_responsavel(alunoAtualizado.getNome_responsavel());
				alunoCadastrado.setNaturalidade(alunoAtualizado.getNaturalidade());
				alunoCadastrado.setEmail(alunoAtualizado.getEmail());
				alunoCadastrado.setTipo_sanguineo(alunoAtualizado.getTipo_sanguineo());
				alunoCadastrado.setEstado_civil(alunoAtualizado.getEstado_civil());
				alunoCadastrado.setDefic(alunoAtualizado.isDefic());
				alunoCadastrado.setTipo_defic(alunoAtualizado.getTipo_defic());
				alunoCadastrado.setSerie(alunoAtualizado.getSerie());
				alunoCadastrado.setData_faltas(alunoAtualizado.getData_faltas());
				
				if(alunoAtualizado.getData_faltas()!=null) {
					alunoCadastrado.setData_faltas(alunoAtualizado.getData_faltas());
				}
				
				if(alunoAtualizado.getNota_disciplina()!=null) {
					alunoCadastrado.setNota_disciplina(alunoAtualizado.getNota_disciplina());
				}
				
				}	
			}
		}
		
	public void deletarAluno(Aluno aluno) {
	for (Turma turmaCadastrada : obterTodasTurmas()) {
		for(Aluno alunoTurma : turmaCadastrada.getAlunos()) {
			if(aluno.getCpf().equals(alunoTurma.getCpf())) {
				turmaCadastrada.removeAluno(alunoTurma);
				ControladorCadastroTurma controladorCadastroTurmas = new ControladorCadastroTurma();
				try {
					controladorCadastroTurmas.atualizarTurma(turmaCadastrada);
				} catch (TurmaInvalidoException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		}
	this.alunos.remove(aluno);

}

	// =================== PROFESSORES
	
	public void adicionarProfessor(Professor professor) {
		this.professores.add(professor);
	}
	
	public Set<Professor> obterTodosProfessores() {
		return this.professores;
	}

	public void atualizarProfessor(Professor professorAtualizado) {
		for (Professor professorCadastrado : this.professores) {
			if (professorCadastrado.getCpf().equals(professorAtualizado.getCpf())) {
				professorCadastrado.setNome(professorAtualizado.getNome());
				professorCadastrado.setRg(professorAtualizado.getRg());
				professorCadastrado.setCtps(professorAtualizado.getCtps());
				professorCadastrado.setEndereco(professorAtualizado.getEndereco());
				professorCadastrado.setData_nasc(professorAtualizado.getData_nasc());
				professorCadastrado.setSexo(professorAtualizado.getSexo());
				professorCadastrado.setNaturalidade(professorAtualizado.getNaturalidade());
				professorCadastrado.setEmail(professorAtualizado.getEmail());
				professorCadastrado.setTipo_sanguineo(professorAtualizado.getTipo_sanguineo());
				professorCadastrado.setEstado_civil(professorAtualizado.getEstado_civil());
				professorCadastrado.setDefic(professorAtualizado.isDefic());
				professorCadastrado.setTipo_defic(professorAtualizado.getTipo_defic());
				professorCadastrado.setDisciplinas(professorAtualizado.getDisciplinas());
				}	
		}
	}
	
	public void deletarProfessor(Professor professor) {
		this.professores.remove(professor);
	}

	// =================== TURMAS
	
	
	public void adicionarTurma(Turma turma) {
		this.turmas.add(turma);
	}
	
	public Set<Turma> obterTodasTurmas() {
		return this.turmas;
	}
	
	public void atualizarTurma(Turma turmaAtualizada) {
		for (Turma turmaCadastrada : this.turmas) {
			if (turmaCadastrada.getCodigo().equals(turmaAtualizada.getCodigo())) {
				turmaCadastrada.setSerie(turmaAtualizada.getSerie());
				turmaCadastrada.setTurno(turmaAtualizada.getTurno());
				turmaCadastrada.setProfessor(turmaAtualizada.getProfessor());
				if (turmaAtualizada.getAlunos() != null) {
					turmaCadastrada.setAlunos((ArrayList<Aluno>) turmaAtualizada.getAlunos());
				}
			}
		}
	}
	
	
	public void deletarTurma(Turma turma) {
		this.turmas.remove(turma);
	}

}
	
