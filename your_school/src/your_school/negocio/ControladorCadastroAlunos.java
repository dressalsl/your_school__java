package your_school.negocio;


import java.util.HashSet;
import java.util.Set;
import your_school.dados.Repositorio;
import your_school.entidades.Aluno;
import your_school.excecoes.AlunoInvalidoException;

public class ControladorCadastroAlunos {
	
	public void cadastrarAluno(Aluno aluno) throws AlunoInvalidoException {
		// Valida cada um dos atributos do aluno
		AlunoInvalidoException AlunoInvalidoException = validarAluno(aluno);
		
		if (AlunoInvalidoException != null) {
			// Levantar excecao caso os dados do aluno nao tenham passado na validacao
			throw AlunoInvalidoException;
		} else {
			// Cadastrar o aluno caso os dados tenham passado na validacao
			Repositorio.getInstancia().adicionarAluno(aluno);
		}
	}
	
	public Set<Aluno> buscarAlunoPorNome(String nome) {
		Set<Aluno> alunosEncontrados = new HashSet<Aluno>();
		
		Set<Aluno> todosAlunos = Repositorio.getInstancia().obterTodosAlunos();
		for (Aluno aluno : todosAlunos) {
			if (aluno.getNome().toUpperCase().contains(nome.toUpperCase())) {
				alunosEncontrados.add(aluno);
			}
		}
		
		return alunosEncontrados;
	}
	public Set<Aluno> obterTodosAlunos() {
		return Repositorio.getInstancia().obterTodosAlunos();
	}
	
	public void atualizarAluno(Aluno aluno) throws AlunoInvalidoException  {
		// Valida cada um dos atributos do aluno
		AlunoInvalidoException AlunoInvalidoException = validarAluno(aluno);
		
		if (AlunoInvalidoException != null) {
			// Levantar excecao caso os dados do aluno nao tenham passado na validacao
			throw AlunoInvalidoException;
		} else {
			// Atualiza os dados do aluno caso os dados tenham passado na validacao
			Repositorio.getInstancia().atualizarAluno(aluno);
		}
	}
	
	public void deletarAluno(Aluno aluno) {
		Repositorio.getInstancia().deletarAluno(aluno);
	}
	
	// ==================== METODOS PRIVADOS
	
		private AlunoInvalidoException validarAluno(Aluno aluno) {
			AlunoInvalidoException alunoInvalidoException = null;
			
			if (aluno.getCpf() == null || aluno.getCpf().trim().isEmpty()) {
				if (alunoInvalidoException == null) {
					alunoInvalidoException = new AlunoInvalidoException();
				}
				
				alunoInvalidoException.setCpfVazio(true);
			}
			if (aluno.getCpf().matches("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\-\\d\\d")) {
				if (alunoInvalidoException == null) {
					alunoInvalidoException = new AlunoInvalidoException();
	}
	
				alunoInvalidoException.setCpfInvalido(true);
}

			if (aluno.getNome() == null || aluno.getNome().trim().isEmpty()) {
				if (alunoInvalidoException == null) {
					alunoInvalidoException = new AlunoInvalidoException();
				}
				
				alunoInvalidoException.setNomeVazio(true);
			}
			//rg
			if (aluno.getRg() == null || aluno.getRg().trim().isEmpty()) {
				if (alunoInvalidoException == null) {
					alunoInvalidoException = new AlunoInvalidoException();
				}
				
				alunoInvalidoException.setRgVazio(true);
			}
			if (aluno.getRg().matches("\\d\\d\\d\\d\\d\\d\\d\\d\\-\\d")) {
				if (alunoInvalidoException == null) {
					alunoInvalidoException = new AlunoInvalidoException();
	}
	
				alunoInvalidoException.setRgInvalido(true);
				
}
			if (aluno.getEndereco() == null) {
				if (alunoInvalidoException == null) {
					alunoInvalidoException = new AlunoInvalidoException();
				}
				
				alunoInvalidoException.setEnderecoInvalido(true);
			}
			if (aluno.getData_nasc() == null || aluno.getData_nasc().trim().isEmpty()) {
				if (alunoInvalidoException == null) {
						alunoInvalidoException = new AlunoInvalidoException();
					}
					
					alunoInvalidoException.setData_nascVazio(true);
				}
			return alunoInvalidoException;
}
}