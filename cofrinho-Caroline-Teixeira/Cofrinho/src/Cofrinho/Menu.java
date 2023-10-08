package Cofrinho;

import java.util.Scanner;

public class Menu {
	private int opcao; //Os números que o usuário pode digitar 0, 1, 2, 3 ou 4 no menu inicial e 1, 2 ou 3 no menu de moeda 
	public boolean fecharPrograma; //encerra o programa se o valor for verdadeiro
	private boolean lacoMoeda; //verifica se a moeda correta foi adicionada
	
	private Cofrinho cofre = new Cofrinho(); //a classe cofrinho como objeto
	
	
	
	//Métodos para o Menu
	public void exibirMenu() {
		System.out.println("---------------------------------------------------------");
		System.out.println("COFRINHO:\n" + "Escolha a opção desejada: 1, 2, 3, 4, 0");
		System.out.println("1 - Adicionar Moeda\n" + "2 - Remover Moeda\n" + "3 - Listar Moedas\n" + "4 - Calcular total convertido para real\n" + "0 - Encerrar");

		Scanner teclado = new Scanner(System.in);
		
		try { 
			opcao = teclado.nextInt();
			itensMenu();
			
		}
		catch (Exception e){   //em caso de erro de digitação
			System.out.println("Operação Inválida. Digite um valor númerico entre 0 a 4.");
		}
		}
	
	//Método para adicionar Moedas
		private void itemAddMoeda() {
			this.lacoMoeda = true;
			while (lacoMoeda) {
				System.out.println("Escolha a moeda:\n" + " 1 - Real\n 2 - Dólar\n 3 - Euro");
				Scanner teclado = new Scanner(System.in);
			
				try 
				{
					opcao = teclado.nextInt();
					switch (opcao) {
						case 1:
							System.out.println("Você escolheu 'Real'. Digite o valor desejado:");
							cofre.adicionar(new Real(teclado.nextDouble()));
							System.out.println("Moeda adicionada ao cofre.");
							this.lacoMoeda = false;
							break;
						case 2:
							System.out.println("Você escolheu 'Dólar'. Digite o valor desejado:");
							cofre.adicionar(new Dolar(teclado.nextDouble()));
							System.out.println("Moeda adicionada ao cofre.");
							this.lacoMoeda = false;
							break;
						case 3:
							System.out.println("Você escolheu 'Euro'. Digite o valor desejado:");
							cofre.adicionar(new Euro(teclado.nextDouble()));
							System.out.println("Moeda adicionada ao cofre.");
							this.lacoMoeda = false;
							break;
						default:
							System.out.println("O número escolhido é inválido! Digite um número entre 1 a 3.");
					}
				}
				catch (Exception e){   //em caso de erro de digitação
					System.out.println("Operação inválida. Digite um valor númerico entre 1 a 3.");
					
				}
				
			}
			}
		
		
	//Método para remover moedas
		private void itemRemMoeda() {
			this.lacoMoeda = true;
			while (lacoMoeda) {
				System.out.println("Escolha a moeda que deseja remover:\n" + " 1 - Real\n 2 - Dólar\n 3 - Euro");
				Scanner teclado = new Scanner(System.in);
			
				try 
				{
					opcao = teclado.nextInt();
					switch (opcao) {
						case 1:
							System.out.println("Você escolheu 'Real'. Digite o valor desejado:");
							cofre.remover(new Real(teclado.nextDouble()));
							this.lacoMoeda = false;
							break;
						case 2:
							System.out.println("Você escolheu 'Dólar'. Digite o valor desejado:");
							cofre.remover(new Dolar(teclado.nextDouble()));
							this.lacoMoeda = false;
							break;
						case 3:
							System.out.println("Você escolheu 'Euro'. Digite o valor desejado:");
							cofre.remover(new Euro(teclado.nextDouble()));
							this.lacoMoeda = false;
							break;
						default:
							System.out.println("O número escolhido é inválido! Digite um número entre 1 a 3.");
					}
				}
				catch (Exception e){   //em caso de erro de digitação
					System.out.println("Operação inválida. Digite um valor númerico entre 1 a 3.");
					
				}
				
			}
			
		}  
			
	
	//Método do Menu Principal
		private void itensMenu() { 
			switch (opcao) {
				case 1:
					this.itemAddMoeda();
					break;
				case 2:
					System.out.println("Você escolheu remover moeda.");
					this.itemRemMoeda();
					break;
				case 3:
					System.out.println("Você escolheu listar moeda.");
					this.cofre.listagemMoedas();
					break;
				case 4:
					System.out.println("Calculando o total...");
					this.cofre.totalConvertido();
					break;
				case 0:
					System.out.println("Encerrando o programa... Programa encerrado.");
					this.fecharPrograma = true;
					break;
				default:
					System.out.println("O número escolhido é inválido!\n Digite um número entre 0 a 4.");
			}
			
		}
		
		}
	
			
		
	
	
	
	

	

