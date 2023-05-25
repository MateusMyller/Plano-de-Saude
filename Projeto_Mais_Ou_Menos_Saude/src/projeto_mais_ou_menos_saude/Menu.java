package projeto_mais_ou_menos_saude;

import java.util.Scanner;

public class Menu {
Scanner sc = new Scanner(System.in);
   


        
    private void displayMenu() {
       
        
        System.out.println("\n**** MENU ****\n");
        System.out.println("O que deseja cadastrar? Segue as alternativas abaixo! \n");
        System.out.println("1 - Cadastrar Gerente");
        System.out.println("2 - Cadastrar Vendedor");
        System.out.println("3 - Cadastrar Atendente");
        System.out.println("4 - Cadastrar Cliente");
        System.out.println("5 - Cadastrar Dependente");
        System.out.println("6 - Cadastrar Plano de Saúde");
        System.out.println("7 - Cadastrar Especialidade");
        System.out.println("0 - Sair \n");
        System.out.print("Já decidiu? Então selecione uma opção conforme o número à sua esquerda: ");
        }
        
        public void Cadastrar() {
        int opcao;
        do {
            displayMenu();
            opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1 -> cadastrarGerente();
                case 2 -> cadastrarVendedor();
                case 3 -> cadastrarAtendente();
                case 4 -> cadastrarCliente();
                case 5 -> cadastrarDependente();
                case 6 -> cadastrarPlanoDeSaude();
                case 7 -> cadastrarEspecialidades();
                case 0 -> System.out.println("Cadastramento finalizado! Saindo do programa.");
                default -> System.out.println("Opção inválida. Por favor, selecione novamente.");
            }
        } while (opcao != 0);
        
        sc.close();
    }
        


    public void cadastrarGerente() {
        System.out.print("#### CADASTRANDO GERENTE ####");
        System.out.print("\nNome do gerente: ");
        String nome = sc.nextLine();
        
        System.out.print("Número do cpf do gerente: ");
        String cpf = sc.nextLine();
        
        System.out.print("Salário do gerente: ");
        double salario = sc.nextDouble();
        
        sc.nextLine();
        
        System.out.print("Data de nascimento do gerente: ");
        String dataNascimento = sc.nextLine();
        
        System.out.print("Endereço do gerente: ");
        String endereço = sc.nextLine();
        
        System.out.print("Telefone do Gerente: ");
        String telefone = sc.nextLine();
        
        System.out.print("Email do gerente: ");
        String email = sc.nextLine();
        
        System.out.print("Usuario do gerente: ");
        String usuario = sc.nextLine();
        
        System.out.print("Senha do gerente: ");
        String senha = sc.nextLine();
        
        System.out.println("Gerente cadastrado com sucesso!");
    }

    
    
    public void cadastrarVendedor() {
        System.out.print("#### CADASTRANDO VENDEDOR ####");
        System.out.print("\nNome do vendedor: ");
        String nome = sc.nextLine();
        
        System.out.print("Número do cpf do vendedor: ");
        String cpf = sc.nextLine();
        
        System.out.print("Salário do vendedor: ");
        double salario = sc.nextDouble();
        
        sc.nextLine();
        
        System.out.print("Data de nascimento do vendedor: ");
        String dataNascimento = sc.nextLine();
        
        System.out.print("Endereço do vendedor: ");
        String endereço = sc.nextLine();
        
        System.out.print("Telefone do vendedor: ");
        String telefone = sc.nextLine();
        
        System.out.print("Email do vendedor: ");
        String email = sc.nextLine();
        
        System.out.print("Usuario do vendedor: ");
        String usuario = sc.nextLine();
        
        System.out.print("Senha do vendedor: ");
        String senha = sc.nextLine();
        
        System.out.print("Vendedor cadastrado com sucesso!");
    }

    
    
    public void cadastrarAtendente() {
        System.out.print("#### CADASTRANDO ATENDENTE ####");
        System.out.print("\nNome do atendente: ");
        String nome = sc.nextLine();

        System.out.print("Número do CPF do atendente: ");
        String cpf = sc.nextLine();
        
        System.out.print("Salário do atendenter: ");
        double salario = sc.nextDouble();
        
        sc.nextLine();

        System.out.print("Data de nascimento do atendente: ");
        String dataNascimento = sc.nextLine();

        System.out.print("Endereço do atendente: ");
        String endereço = sc.nextLine();

        System.out.print("Telefone do atendente: ");
        String telefone = sc.nextLine();

        System.out.print("Email do atendente: ");
        String email = sc.nextLine();

        System.out.print("Usuário do atendente: ");
        String usuario = sc.nextLine();

        System.out.print("Senha do atendente: ");
        String senha = sc.nextLine();

        System.out.print("Atendente cadastrado com sucesso!");  
    }

    
    
    private void cadastrarCliente() {
        System.out.print("#### CADASTRANDO CLIENTE ####");
        System.out.print("\nNome do cliente: ");
        String nome = sc.nextLine();

        System.out.print("CPF do cliente: ");
        String cpf = sc.nextLine();
        
        System.out.print("Data de nascimento do cliente: ");
        String dataNascimento = sc.nextLine();

        System.out.print("Endereço do cliente: ");
        String endereço = sc.nextLine();

        System.out.print("Telefone do cliente: ");
        String telefone = sc.nextLine();

        System.out.print("Email do cliente: ");
        String email = sc.nextLine();
 
        System.out.print("Cliente cadastrado com sucesso!");     
    }

    
    
    private void cadastrarDependente() {
        System.out.print("#### CADASTRANDO DEPENDENTE ####");
        System.out.print("\nNome do dependente: ");
        String nome = sc.nextLine();

        System.out.print("CPF do dependente: ");
        String cpf = sc.nextLine();
        
        System.out.print("Data de nascimento do dependente: ");
        String dataNascimento = sc.nextLine();
        
        System.out.print("Grau de parentesco do dependente: ");
        String grauParentesco = sc.nextLine();
        
        System.out.print("Dependente cadastrado com sucesso!");
    }

    
    
    private void cadastrarPlanoDeSaude() {
        System.out.print("#### CADASTRANDO PLANO DE SAÚDE ####");
        System.out.print("\nNome do plano de saúde: ");
        String nome = sc.nextLine();
        
        System.out.print("Nome das especialidades fornecidas pelo plano: ");  
        String especialidades = sc.nextLine();
        
        System.out.print("Nome das Clínicas que aceita este plano: ");
        String clinicas = sc.nextLine();
        
        System.out.print("Plano de Saúde cadastrado com sucesso!");
        }
    
    
    private void cadastrarEspecialidades() {
        System.out.println("#### CADASTRANDO ESPECIALIDADES ####");
        System.out.print("\nDigite as especialidades: ");
        String nomeEspecialidades = sc.nextLine();
        
        System.out.print("Especialidades cadastradas com sucesso!");
      }  
    }