package br.com.zup.gothamcity.dto;

public class AlteraFuncionarioDTO {

	private String nome;
	private String cpf;
	private Long idSecretaria;
	private String funcao;
	private double salario;
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
	public Long getIdSecretaria() {
		return idSecretaria;
	}
	public void setIdSecretaria(Long idSecretaria) {
		this.idSecretaria = idSecretaria;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
