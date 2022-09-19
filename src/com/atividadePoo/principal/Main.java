package com.atividadePoo.principal;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import javax.print.attribute.standard.Finishings;

import com.atividadePoo.fabrica.*;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
	public static ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
	public static ArrayList<Locacao> listaLocacao = new ArrayList<Locacao>();
	public static ArrayList<Fita> listaFitas = new ArrayList<Fita>();
	
	public static void main(String[] args) {
		listaClientes.add(new Cliente("João", "123.123.123-12", 123123123, 1, "10-11-2022", 3));
		listaClientes.add(new Cliente("João2", "123.123.123-12", 123123123, 2, "10-11-2022", 6));
		listaClientes.add(new Cliente("João3", "123.123.123-12", 123123123, 3, "10-11-2022", 9));
		listaClientes.add(new Cliente("João4", "123.123.123-12", 123123123, 4, "10-11-2022", 1));
		listaClientes.add(new Cliente("João5", "123.123.123-12", 123123123, 5, "10-11-2022", 3));
		
		listaFuncionarios.add(new Funcionario("Vitor", "123.123.123-12", 123123123, 1, 1000.99, 1));
		listaFuncionarios.add(new Funcionario("Vitor2", "123.123.123-12", 123123123, 2, 2000.99, 3));
		listaFuncionarios.add(new Funcionario("Vitor3", "123.123.123-12", 123123123, 3, 2500.99, 4));
		listaFuncionarios.add(new Funcionario("Vitor4", "123.123.123-12", 123123123, 4, 900.99, 10));
		listaFuncionarios.add(new Funcionario("Vitor5", "123.123.123-12", 123123123, 5, 10000.99, 4));
		
		listaFitas.add(new Fita(1, "Star Wars", "Aventura", 130));
		listaFitas.add(new Fita(2, "Star Wars2", "Aventura", 120));
		listaFitas.add(new Fita(3, "Star Wars3", "Aventura", 90));
		listaFitas.add(new Fita(4, "Star Wars4", "Aventura", 120));
		listaFitas.add(new Fita(5, "Star Wars5", "Aventura", 110));
		
		listaLocacao.add(new Locacao(1, listaClientes.get(1), listaFitas.get(2), listaFuncionarios.get(2), "19-09-2022", "26-09-2022", 10.99));
		listaLocacao.add(new Locacao(2, listaClientes.get(2), listaFitas.get(3), listaFuncionarios.get(3), "19-09-2022", "26-09-2022", 10.99));
		listaLocacao.add(new Locacao(3, listaClientes.get(3), listaFitas.get(4), listaFuncionarios.get(4), "19-09-2022", "26-09-2022", 10.99));
		listaLocacao.add(new Locacao(4, listaClientes.get(4), listaFitas.get(0), listaFuncionarios.get(0), "19-09-2022", "26-09-2022", 10.99));
		listaLocacao.add(new Locacao(5, listaClientes.get(0), listaFitas.get(1), listaFuncionarios.get(1), "19-09-2022", "26-09-2022", 10.99));
		
		boolean running = true;
		
		while (running) {
			System.out.println("Bem Vindo!");
			System.out.println("1 - Inserir");
			System.out.println("2 - Imprimir");
			int input = scanner.nextInt();
			scanner.nextLine();
			switch (input) {
			case 1:
				inserir();
			case 2:
				imprimir();
			}
		}
	}
	
	public static void inserir() {
		System.out.println("Inserir:");
		System.out.println("1 - Cliente");
		System.out.println("2 - Funcionário");
		System.out.println("3 - Locação");
		System.out.println("4 - Fita");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();
		
		int input = scanner.nextInt();
		scanner.nextLine();
		switch (input) {
		case 1:
			System.out.println("Digite o nome do cliente:");
			String nome = scanner.nextLine();
			System.out.println("Digite o cpf do cliente:");
			String cpf = scanner.nextLine();
			System.out.println("Digite o rg do cliente:");
			int rg = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Digite o registro do cliente:");
			int registro = scanner.nextInt();
			scanner.nextLine();
			String data = dtf.format(now);
			System.out.println("Digite a quantidade de locações do cliente:");
			int qtdLocacao = scanner.nextInt();
			scanner.nextLine();
			listaClientes.add(new Cliente(nome, cpf, rg, registro, data, qtdLocacao));
			break;
		case 2:
			System.out.println("Digite o nome do funcionário:");
			String nome1 = scanner.nextLine();
			System.out.println("Digite o cpf do funcionário:");
			String cpf1 = scanner.nextLine();
			System.out.println("Digite o rg do funcionário:");
			int rg1 = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Digite o registro do funcionário:");
			int registro1 = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Digite o salário do funcionário:");
			double salario1 = scanner.nextDouble();
			scanner.nextLine();
			System.out.println("Digite a quantidade de locações do funcionário:");
			int qtdLocacao1 = scanner.nextInt();
			scanner.nextLine();
			listaFuncionarios.add(new Funcionario(nome1, cpf1, rg1, registro1, salario1, qtdLocacao1));
			break;
		case 3:
			System.out.println("Digite o id da locação:");
			int id2 = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Digite o id do Cliente:");
			int idCliente2 = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Digite o id da Fita:");
			int idFita2 = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Digite o id do Funcionário:");
			int idFuncionario2 = scanner.nextInt();
			scanner.nextLine();
			String data2 = dtf.format(now);
			System.out.println("Digite a data de entrega:");
			String dataEntrega2 = scanner.nextLine();
			System.out.println("Digite o valor da locação:");
			double valorLocacao2 = scanner.nextDouble();
			Cliente cliente2 = pesquisarCliente(idCliente2);
			Funcionario funcionario2 = pesquisarFuncionario(idFuncionario2);
			Fita fita2 = pesquisarFita(idFita2);
			listaLocacao.add(new Locacao(id2, cliente2, fita2, funcionario2, data2, dataEntrega2, valorLocacao2));
			break;
		case 4:
			System.out.println("Digite o id da fita:");
			int id3 = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Digite o nome da fita:");
			String nome3 = scanner.nextLine();
			System.out.println("Digite genero da fita:");
			String genero3 = scanner.nextLine();
			System.out.println("Digite a duracao da fita:");
			int duracao3 = scanner.nextInt();
			scanner.nextLine();
			listaFitas.add(new Fita(id3, nome3, genero3, duracao3));
			break;
		default:
			inserir();
			break;
		}
		
	}
	
	public static void imprimir() {
		System.out.println("Imprimir:");
		System.out.println("1 - Cliente");
		System.out.println("2 - Funcionário");
		System.out.println("3 - Locação");
		System.out.println("4 - Fita");
		System.out.println("5 - Total de locações");
		System.out.println("6 - Ranking de locações por cliente");
		System.out.println("7 - Faturamento total");
		System.out.println("8 - Quantidade de fitas, clientes e funcionários cadastrados");
		System.out.println("9 - Calcular salário do funcionário");
		
		int input = scanner.nextInt();
		scanner.nextLine();
		switch (input) {
		case 1:
			listaClientes.forEach(System.out::println);
			break;
		case 2:
			listaFuncionarios.forEach(System.out::println);
			break;
		case 3:
			listaLocacao.forEach(System.out::println);
			break;
		case 4:
			listaFitas.forEach(System.out::println);
			break;
		case 5:
			int soma = 0;
			for (Funcionario funcionario : listaFuncionarios) {
				soma += funcionario.getQtdLocacao();
			}
			System.out.println("Quantidades de locações realizadas até hoje: " + soma);
			System.out.println("");
			break;
		case 6:
			System.out.println("Ranking: ");
			
			ArrayList<Cliente> listaOrdenada = listaClientes;
			listaOrdenada.sort(Comparator.comparing(Cliente::getQtdLocacao).reversed());
			for (int i = 0; i < listaOrdenada.size(); i++) {
				System.out.println((i + 1) + "º: " + listaOrdenada.get(i).getNome()); System.out.println("");
			}
			break;
		case 7:
			int soma2 = 0;
			for (Locacao locacao : listaLocacao) {
				soma2 += locacao.getValor();
			}
			System.out.println("Valor total de locações até hoje: " + soma2);
			System.out.println("");
			break;
		case 8:
			Funcionario funcionarioMelhor = null;
			for (Funcionario funcionario : listaFuncionarios) {
				if (funcionarioMelhor != null && (funcionarioMelhor.getQtdLocacao() < funcionario.getQtdLocacao())) {
					funcionarioMelhor = funcionario;
				}
			}
			System.out.println("Funcionario mais vendido: " + funcionarioMelhor);
			System.out.println("");
			break;
		case 9:
			System.out.println("Digite id do funcionario:");
			int funcId = scanner.nextInt();
			scanner.nextLine();
			Funcionario findFuncionario = pesquisarFuncionario(funcId);
			double salario = findFuncionario.getSalario() + 1500 + (findFuncionario.getQtdLocacao()*20);
			System.out.println("Salario e tals: " + salario);
			System.out.println("");
			break;
		default:
			imprimir();
			break;
		}
	}

	public static Cliente pesquisarCliente(int id) {
		for (Cliente cliente : listaClientes) {
			if (cliente.getRegistroCliente() == id) {
				return cliente;
			}
		}
		return null;
	}
	public static Funcionario pesquisarFuncionario(int id) {
		for (Funcionario funcionario : listaFuncionarios) {
			if (funcionario.getRegistroFuncionario() == id) {
				return funcionario;
			}
		}
		return null;
	}
	public static Fita pesquisarFita(int id) {
		for (Fita fita : listaFitas) {
			if (fita.getId() == id) {
				return fita;
			}
		}
		return null;
	}
	
}
