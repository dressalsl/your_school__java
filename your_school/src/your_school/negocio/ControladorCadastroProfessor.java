package your_school.negocio;

import java.util.HashSet;
import java.util.Set;

import your_school.dados.Repositorio;
import your_school.entidades.Professor;
import your_school.excecoes.ProfessorInvalidoException;

public class ControladorCadastroProfessor {
	
	public void cadastrarProfessor(Professor professor) throws ProfessorInvalidoException {
		// Valida cada um dos atributos do aluno
		ProfessorInvalidoException ProfessorInvalidoException = validarProfessor(professor);
		
		if (ProfessorInvalidoException != null) {
			// Levantar excecao caso os dados do aluno nao tenham passado na validacao
			throw ProfessorInvalidoException;
		} else {
			// Cadastrar o aluno caso os dados tenham passado na validacao
			Repositorio.getInstancia().adicionarProfessor(professor);
		}
	}
	
	public Set<Professor> buscarProfessorPorNome(String nome) {
		Set<Professor> professoresEncontrados = new HashSet<Professor>();
		
		Set<Professor> todosProfessores = Repositorio.getInstancia().obterTodosProfessores();
		for (Professor professor : todosProfessores) {
			if (professor.getNome().toUpperCase().contains(nome.toUpperCase())) {
				professoresEncontrados.add(professor);
			}
		}
		return professoresEncontrados;
	}
	
	public Set<Professor> obterTodosProfessores() {
		return Repositorio.getInstancia().obterTodosProfessores();
	}
	
	public void atualizarProfessor(Professor professor) throws ProfessorInvalidoException  {
		// Valida cada um dos atributos do aluno
		ProfessorInvalidoException ProfessorInvalidoException = validarProfessor(professor);
		
		if (ProfessorInvalidoException != null) {
			// Levantar excecao caso os dados do aluno nao tenham passado na validacao
			throw ProfessorInvalidoException;
		} else {
			// Atualiza os dados do aluno caso os dados tenham passado na validacao
			Repositorio.getInstancia().atualizarProfessor(professor);
		}
	}
	
	public void deletarProfessor(Professor professor) {
		Repositorio.getInstancia().deletarProfessor(professor);
	}

	// ==================== METODOS PRIVADOS
	
	private ProfessorInvalidoException validarProfessor(Professor professor) {
		ProfessorInvalidoException professorInvalidoException = null;
				
		return professorInvalidoException;
	}
	
}
