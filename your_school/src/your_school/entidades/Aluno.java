package your_school.entidades;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Aluno {
	
	private String nome;
	private String cpf;
	private String rg;
	private String endereco;
	private String data_nasc;
	private char sexo;
	private String fone;
	private String nome_responsavel;
	private String naturalidade;
	private String email;
	private String tipo_sanguineo;
	private String estado_civil;
	private boolean defic;
	private String tipo_defic;
	private String serie;
	private Set<String> Disciplinas = new HashSet<String>();
	private Map<String, ArrayList<Double>> nota_disciplina = new HashMap<String, ArrayList<Double>>();
	private Map<String, Integer> data_faltas = new HashMap<String, Integer>();
	
	// ==================== CONSTRUTORES
	
	
	/**
	 * Construtor padrao sem parametros em situacoes que seja necessario criar um objeto Aluno sem definir os valores iniciais dos atributos.
	 */
	public Aluno() {
		
	}
	
	/**
	 * Construtor que recebe parametros para iniciar todos os atributos de um objeto Aluno.
	 */
	public Aluno(String nome, String cpf, String rg, String endereco, String data_nasc, char sexo, String fone, String nome_responsavel, String naturalidade, String email,
			String tipo_sanguineo, String estado_civil, boolean defic, String tipo_defic, String serie) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;
		this.data_nasc = data_nasc;
		this.sexo = sexo;
		this.fone = fone;
		this.nome_responsavel = nome_responsavel;
		this.naturalidade = naturalidade;
		this.email = email;
		this.tipo_sanguineo = tipo_sanguineo;
		this.estado_civil = estado_civil;
		this.defic = defic;
		this.tipo_defic = tipo_defic;
		this.serie = serie;
	}
	
	// ==================== GETs e SETs

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getData_nasc() {
		return data_nasc;
	}
	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getNome_responsavel() {
		return nome_responsavel;
	}
	public void setNome_responsavel(String nome_responsavel) {
		this.nome_responsavel = nome_responsavel;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTipo_sanguineo() {
		return tipo_sanguineo;
	}
	public void setTipo_sanguineo(String tipo_sanguineo) {
		this.tipo_sanguineo = tipo_sanguineo;
	}
	public String getEstado_civil() {
		return estado_civil;
	}
	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}
	public boolean isDefic() {
		return defic;
	}
	public void setDefic(boolean defic) {
		this.defic = defic;
	}
	public String getTipo_defic() {
		return tipo_defic;
	}
	public void setTipo_defic(String tipo_defic) {
		this.tipo_defic = tipo_defic;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public Map<String, ArrayList<Double>> getNota_disciplina() {
		return nota_disciplina;
	}
	public void setNota_disciplina(Map<String, ArrayList<Double>> nota_disciplina) {
		this.nota_disciplina = nota_disciplina;
	}

	public Map<String, Integer> getData_faltas() {
		return data_faltas;
	}

	public void setData_faltas(Map<String, Integer> data_faltas) {
		this.data_faltas = data_faltas;
	}
	
	public void setFalta(String data, int faltas) {
		this.data_faltas.put(data, faltas);
	}
	
	public void setNota(String disciplina, int index, double nota) {
		this.nota_disciplina.get(disciplina).set(index, nota);
	}

	public Set<String> getDisciplinas() {
		return Disciplinas;
	}
	
	public List<String> getListaDisciplinas() {
		List<String> listaDisciplinas = new ArrayList<String>();
		listaDisciplinas.addAll(this.getDisciplinas());
		return listaDisciplinas;
	}

	public void setDisciplinas(Set<String> disciplinas) {
		this.Disciplinas = disciplinas;
	}
}

