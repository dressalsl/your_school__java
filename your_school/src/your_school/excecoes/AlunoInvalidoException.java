package your_school.excecoes;

public class AlunoInvalidoException extends Exception{
	
	private boolean nomeVazio;
	private boolean cpfVazio;
	private boolean cpfInvalido;
	private boolean rgVazio;
	private boolean rgInvalido;
	private boolean enderecoVazio;
	private boolean enderecoInvalido;
	private boolean data_nascVazio;
	private boolean data_nascInvalido;
	private boolean sexoVazio;
	private boolean foneVazio;
	private boolean nome_responsavelVazio;
	private boolean naturalidadeVazio;
	private boolean emailVazio;
	private boolean tipo_sanguineoVazio;
	private boolean estado_civilVazio;
	private boolean deficVazio;
	private boolean tipo_deficVazio;
	private boolean serieVazio;
	private boolean codigoVazio;

	
public AlunoInvalidoException() {
		
	}


public boolean isNomeVazio() {
	return nomeVazio;
}


public void setNomeVazio(boolean nomeVazio) {
	this.nomeVazio = nomeVazio;
}


public boolean isCpfVazio() {
	return cpfVazio;
}


public void setCpfVazio(boolean cpfVazio) {
	this.cpfVazio = cpfVazio;
}


public boolean isCpfInvalido() {
	return cpfInvalido;
}


public void setCpfInvalido(boolean cpfInvalido) {
	this.cpfInvalido = cpfInvalido;
}


public boolean isRgVazio() {
	return rgVazio;
}


public void setRgVazio(boolean rgVazio) {
	this.rgVazio = rgVazio;
}


public boolean isRgInvalido() {
	return rgInvalido;
}


public void setRgInvalido(boolean rgInvalido) {
	this.rgInvalido = rgInvalido;
}


public boolean isEnderecoVazio() {
	return enderecoVazio;
}


public void setEnderecoVazio(boolean enderecoVazio) {
	this.enderecoVazio = enderecoVazio;
}


public boolean isEnderecoInvalido() {
	return enderecoInvalido;
}


public void setEnderecoInvalido(boolean enderecoInvalido) {
	this.enderecoInvalido = enderecoInvalido;
}


public boolean isData_nascVazio() {
	return data_nascVazio;
}


public void setData_nascVazio(boolean data_nascVazio) {
	this.data_nascVazio = data_nascVazio;
}


public boolean isData_nascInvalido() {
	return data_nascInvalido;
}


public void setData_nascInvalido(boolean data_nascInvalido) {
	this.data_nascInvalido = data_nascInvalido;
}


public boolean isSexoVazio() {
	return sexoVazio;
}


public void setSexoVazio(boolean sexoVazio) {
	this.sexoVazio = sexoVazio;
}


public boolean isFoneVazio() {
	return foneVazio;
}


public void setFoneVazio(boolean foneVazio) {
	this.foneVazio = foneVazio;
}


public boolean isNome_responsavelVazio() {
	return nome_responsavelVazio;
}


public void setNome_responsavelVazio(boolean nome_responsavelVazio) {
	this.nome_responsavelVazio = nome_responsavelVazio;
}


public boolean isNaturalidadeVazio() {
	return naturalidadeVazio;
}


public void setNaturalidadeVazio(boolean naturalidadeVazio) {
	this.naturalidadeVazio = naturalidadeVazio;
}


public boolean isEmailVazio() {
	return emailVazio;
}


public void setEmailVazio(boolean emailVazio) {
	this.emailVazio = emailVazio;
}


public boolean isTipo_sanguineoVazio() {
	return tipo_sanguineoVazio;
}


public void setTipo_sanguineoVazio(boolean tipo_sanguineoVazio) {
	this.tipo_sanguineoVazio = tipo_sanguineoVazio;
}


public boolean isEstado_civilVazio() {
	return estado_civilVazio;
}


public void setEstado_civilVazio(boolean estado_civilVazio) {
	this.estado_civilVazio = estado_civilVazio;
}


public boolean isDeficVazio() {
	return deficVazio;
}


public void setDeficVazio(boolean deficVazio) {
	this.deficVazio = deficVazio;
}


public boolean isTipo_deficVazio() {
	return tipo_deficVazio;
}


public void setTipo_deficVazio(boolean tipo_deficVazio) {
	this.tipo_deficVazio = tipo_deficVazio;
}


public boolean isSerieVazio() {
	return serieVazio;
}


public void setSerieVazio(boolean serieVazio) {
	this.serieVazio = serieVazio;
}


public boolean isCodigoVazio() {
	return codigoVazio;
}


public void setCodigoVazio(boolean codigoVazio) {
	this.codigoVazio = codigoVazio;
}
}
