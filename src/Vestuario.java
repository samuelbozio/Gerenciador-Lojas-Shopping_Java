public class Vestuario extends Loja{

    private boolean produtosImportados;


    public Vestuario(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, 12);
    }

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados, int QuantidadeMaximaProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, QuantidadeMaximaProdutos);
        this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    @Override
    public String toString() {
        return super.toString() + "Vestuario{" +
                "produtosImportados=" + produtosImportados +
                '}';
    }
}
