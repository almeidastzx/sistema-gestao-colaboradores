package Cadastro_Interno;

public class Colaborador {
    public static final double SALARIO_BASE = 2000.00;

    // Atributos gerais do colaborador
    private String nome; 
    private int matricula;
    private int tipoColaborador; // 1 = Padrão, 2 = Comissionado, 3 = Produção

    // Atributos para colaborador comissionado
    private double ValorVendas; // Valor tototal das vendas realizadas
    private double percentualComissao; // Percentual de comissão sobre as vendas

    // Atributos para colaborador de produção
    private int quantidadeProduzida; // Quantidade de itens produzidos
    private double valorPorItem; // Valor pago por item produzido
     
    // Construtor para colaborador padrão (opção 1)
    public Colaborador(int matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
        this.tipoColaborador = 1; // Padrão
    }

    // Construtor para colaborador comissionado (opção 2)
    public Colaborador(int matricula, String nome, double ValorVendas, double percentualComissao){
        this.matricula = matricula;
        this.nome = nome;
        this.tipoColaborador = 2; // Comissionado
        this.ValorVendas = ValorVendas;
        this.percentualComissao = percentualComissao;
    }

    // Construtor para colaborador de produção (opção 3)
    public Colaborador(int matricula, String nome, int quantidadeProduzida, double valuePorItem){
        this.matricula = matricula;
        this.nome = nome;
        this.tipoColaborador = 3; // Produção
        this.quantidadeProduzida = quantidadeProduzida;
        this.valorPorItem = valuePorItem;
    }

    // Método para calcular o valor extra (Comissão ou Produtividade)
    public double calcularValorExtra(){
        if (this.tipoColaborador == 2) { // Comissionado
            return (this.ValorVendas * this.percentualComissao) / 100;
        } else if (this.tipoColaborador == 3) {// Produção
            return this.quantidadeProduzida * this.valorPorItem;
        } else { // Padrão
            return 0.0; // Colaborador padrão não tem valor extra
        }
    }
    // Método para calcular o salário final
    public double calcularSalarioFinal(){
        return SALARIO_BASE + calcularValorExtra();
    }

    // Métodos Getters para o Main conseguir ler os dados
    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getTipoColaborador() {
        return tipoColaborador;
    }
}
