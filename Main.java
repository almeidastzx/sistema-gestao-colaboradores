package Cadastro_Interno;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Colaborador> colaboradores = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\nMenu de Cadastro de Colaboradores:");
            System.out.println("1. Cadastrar Colaborador Padrão");
            System.out.println("2. Cadastrar Colaborador Comissionado");
            System.out.println("3. Cadastrar Colaborador de Produção");
            System.out.println("4. Gerar Folha de Pagamento");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    // Cadastro de colaborador padrão
                    System.out.print("Digite a matrícula: ");
                    int matriculaPadrao = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Digite o nome: ");
                    String nomePadrao = scanner.nextLine();
                    colaboradores.add(new Colaborador(matriculaPadrao, nomePadrao));
                    System.out.println("Colaborador padrão cadastrado com sucesso!");
                    break;

                case 2:
                    // Cadastro de colaborador comissionado
                    System.out.print("Digite a matrícula: ");
                    int matriculaComissionado = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Digite o nome: ");
                    String nomeComissionado = scanner.nextLine();
                    System.out.print("Digite o valor total das vendas: ");
                    double valorVendas = scanner.nextDouble();
                    System.out.print("Digite o percentual de comissão: ");
                    double percentualComissao = scanner.nextDouble();
                    colaboradores.add(new Colaborador(matriculaComissionado, nomeComissionado, valorVendas, percentualComissao));
                    System.out.println("Colaborador comissionado cadastrado com sucesso!");
                    break;

                case 3:
                    // Cadastro de colaborador de produção
                    System.out.print("Digite a matrícula: ");
                    int matriculaProducao = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha
                    System.out.print("Digite o nome: ");
                    String nomeProducao = scanner.nextLine();
                    System.out.print("Digite a quantidade produzida: ");
                    int quantidadeProduzida = scanner.nextInt();
                    System.out.print("Digite o valor pago por item produzido: ");
                    double valorPorItem = scanner.nextDouble();
                    colaboradores.add(new Colaborador(matriculaProducao, nomeProducao, quantidadeProduzida, valorPorItem));
                    System.out.println("Colaborador de produção cadastrado com sucesso!");
                    break;

                case 4:
                    // Gerar folha de pagamento
                    System.out.println("\n--- FOLHA DE PAGAMENTO ---");
                    System.out.println("Total de colaboradores cadastrados: " + colaboradores.size());

                    for (Colaborador colaborador : colaboradores) {
                        System.out.println("-----------------------------------------");
                        System.out.println("Matrícula: " + colaborador.getMatricula());
                        System.out.println("Nome: " + colaborador.getNome());

                        if (colaborador.getTipoColaborador() == 2) {
                            System.out.printf("Comissão: R$ %.2f%n", colaborador.calcularValorExtra());
                        } else if (colaborador.getTipoColaborador() == 3) {
                            System.out.printf("Produtividade: R$ %.2f%n", colaborador.calcularValorExtra());
                        }

                        System.out.printf("Salário Final: R$ %.2f%n", colaborador.calcularSalarioFinal());
                    }
                    System.out.println("-----------------------------------------");
                    break;

                case 0:
                    System.out.println("Saindo...");
                    scanner.close(); 
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (opcao != 0); 
    }
}