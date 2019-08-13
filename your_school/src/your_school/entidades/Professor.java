package your_school.entidades;
import java.util.HashSet;

public class Professor {
	private String nome;
	private String cpf;
	private String rg;
	private String ctps;
	private String endereco;
	private String data_nasc;
	private char sexo;
	private String fone;
	private String naturalidade;
	private String email;
	private String tipo_sanguineo;
	private String estado_civil;
	private boolean defic;
	private String tipo_defic;
	private HashSet<String> disciplinas = new HashSet<String>();
	
	
	// ==================== CONSTRUTORES
	
	
	/**
	 * Construtor padrao sem parametros em situacoes que seja necessario criar um objeto Professor sem definir os valores iniciais dos atributos.
	 */
	public Professor() {
		
	}
	
	/**
	 * Construtor que recebe parametros para iniciar todos os atributos de um objeto Professor.
	 */
	
	public Professor(String nome, String cpf, String rg, String ctps, String endereco, String data_nasc, char sexo, 
			String fone, String naturalidade, String email, String tipo_sanguineo, String estado_civil, boolean defic,
			String tipo_defic, HashSet disciplinas) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.ctps = ctps;
		this.endereco = endereco;
		this.data_nasc = data_nasc;
		this.sexo = sexo;
		this.fone = fone;
		this.naturalidade = naturalidade;
		this.email = email;
		this.tipo_sanguineo = tipo_sanguineo;
		this.estado_civil = estado_civil;
		this.defic = defic;
		this.tipo_defic = tipo_defic;
		this.disciplinas = disciplinas;
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
	public String getCtps() {
		return ctps;
	}
	public void setCtps(String ctps) {
		this.ctps = ctps;
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
	public HashSet<String> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(HashSet<String> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
}
