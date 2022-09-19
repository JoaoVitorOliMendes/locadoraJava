package com.atividadePoo.fabrica;

public class Funcionario extends Pessoa {
	private int registroFuncionario;
	private double salario;
	private int qtdLocacao = 0;
	
	public int getRegistroFuncionario() {
		return registroFuncionario;
	}
	public void setRegistroFuncionario(int registroFuncionario) {
		this.registroFuncionario = registroFuncionario;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getQtdLocacao() {
		return qtdLocacao;
	}
	public void setQtdLocacao(int qtdLocacao) {
		this.qtdLocacao = qtdLocacao;
	}
	public Funcionario(String nome, String cpf, int rg, int registroFuncionario, double salario, int qtdLocacao) {
		super(nome, cpf, rg);
		this.registroFuncionario = registroFuncionario;
		this.salario = salario;
		this.qtdLocacao = qtdLocacao;
	}
	public Funcionario(String nome, String cpf, int rg) {
		super(nome, cpf, rg);
	}
	public Funcionario() {
		super();
	}
	@Override
	public String toString() {
		return "Funcionario [registroFuncionario=" + registroFuncionario + ", salario=" + salario + ", qtdLocacao="
				+ qtdLocacao + "]";
	}
}
