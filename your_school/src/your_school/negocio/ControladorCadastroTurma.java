package your_school.negocio;

import java.util.HashSet;
import java.util.Set;

import your_school.dados.Repositorio;
import your_school.entidades.Turma;
import your_school.excecoes.TurmaInvalidoException;

public class ControladorCadastroTurma {

	public void cadastrarTurma(Turma turma) throws TurmaInvalidoException {
		// Valida cada um dos atributos da turma
		
	TurmaInvalidoException TurmaInvalidoException = validarTurma(turma);
	if (turma.getSerie() == null || turma.getSerie().trim().isEmpty()) {
		// Levantar excecao caso os dados da turma nao tenham passado na validacao
		throw TurmaInvalidoException;
	} else {
		// Cadastrar a turma caso os dados tenham passado na validacao
		Repositorio.getInstancia().adicionarTurma(turma);
	}
}
	public Set<Turma> buscarTurmaPorNome(String nome) {
		Set<Turma> turmasEncontradas = new HashSet<Turma>();
		
		Set<Turma> todosTurma = Repositorio.getInstancia().obterTodasTurmas();
		for (Turma turma : todosTurma) {
			if (turma.getCodigo().toUpperCase().contains(turma.getCodigo().toUpperCase())) {
				turmasEncontradas.add(turma);
			}
		}
		
		return turmasEncontradas;
	}

public Set<Turma> obterTodosTurma() {
	return Repositorio.getInstancia().obterTodasTurmas();
}

public void atualizarTurma(Turma turma) throws TurmaInvalidoException  {
	// Valida cada um dos atributos da turma
	TurmaInvalidoException TurmaInvalidoException = validarTurma(turma);
	
	if (TurmaInvalidoException != null) {
		// Levantar excecao caso os dados da turma nao tenham passado na validacao
		throw TurmaInvalidoException;
	} else {
		// Atualiza os dados da turma caso os dados tenham passado na validacao
		Repositorio.getInstancia().atualizarTurma(turma);
	}
}

public void deletarTurma(Turma turma) {
	Repositorio.getInstancia().deletarTurma(turma);
}

// ==================== METODOS PRIVADOS

private TurmaInvalidoException validarTurma(Turma turma) {
	TurmaInvalidoException TurmaInvalidoException = null;
	
	if (turma.getSerie() == null || turma.getSerie().trim().isEmpty()) {
		if (TurmaInvalidoException == null) {
			TurmaInvalidoException = new TurmaInvalidoException();
		}
		
		TurmaInvalidoException.setSerieVazio(true);
	}
	
	if (turma.getCodigo() == null || turma.getCodigo().trim().isEmpty()) {
		if (TurmaInvalidoException == null) {
			TurmaInvalidoException = new TurmaInvalidoException();
		}
		
		TurmaInvalidoException.setCodigoVazio(true);
	}
	
	if (turma.getTurno() == null || turma.getTurno().trim().isEmpty()) {
		if (TurmaInvalidoException == null) {
			TurmaInvalidoException = new TurmaInvalidoException();
		}
		
		TurmaInvalidoException.setTurnoVazio(true);
	}
	
	return TurmaInvalidoException;
	
	}
	
}
