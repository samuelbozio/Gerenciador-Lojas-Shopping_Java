import java.lang.reflect.Array;
import java.util.Arrays;

public class Loja {

    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco Endereco;
    private Data DataFundacao;
    private Produto[] estoqueProdutos;


    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        DataFundacao = dataFundacao;
        Endereco = endereco;
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];


    }

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao,int quantidadeMaximaProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.Endereco = endereco;
        this.DataFundacao = dataFundacao;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];



    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public Endereco getEndereco() {
        return Endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.Endereco = endereco;
    }

    public Data getDataFundacao() {
        return DataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.DataFundacao = dataFundacao;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    public String toString() {
        return "Nome da Loja: "
                + getNome()
                + " {Salário Base: "
                + getSalarioBaseFuncionario()
                + "] ["
                + getQuantidadeFuncionarios()
                + " Funcionários.] ["
                + this.gastosComSalario()
                + " Total de gastos com salário.] "
                + "[Estoque: " + Arrays.toString(getEstoqueProdutos()) + "]"
                + "[" + tamanhoDaLoja() + "]"
                + " [Data de fundação: " + DataFundacao
                + "] [" + Endereco + "] ";
    }

    public double gastosComSalario() {
        if (salarioBaseFuncionario <= -1.00) {
            return getSalarioBaseFuncionario();
        } else {
            return this.getSalarioBaseFuncionario() * this.getQuantidadeFuncionarios();
        }
    }

    public char tamanhoDaLoja() {
        if (getQuantidadeFuncionarios() < 10)
            return 'P';
        else if (getQuantidadeFuncionarios() >= 10 && getQuantidadeFuncionarios() <= 30)
            return 'M';
        else
            return 'G';
    }

    public void imprimeProdutos() {
        System.out.println(Arrays.toString(getEstoqueProdutos()));

    }

    public boolean insereProduto(Produto produto) {

        for (int i = 0; i < estoqueProdutos.length; i++) {

            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                return true;
            }

        }
        return false;
    }

    public boolean removeProduto(String nome) {

        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nome)) {
                estoqueProdutos[i] = null;
                return true;
            }

        }
        return false;


    }

}


