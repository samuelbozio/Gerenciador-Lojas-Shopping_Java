public class Produto {

    private String nome;
    private double preco;
    private Data DataValidade;

    public Produto(String nome, double preco, Data validade) {
        this.nome = nome;
        this.preco = preco;
        DataValidade = validade;


    }

    public Data getDataValidade() {
        return DataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        DataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Data getValidade() {
        return DataValidade;
    }

    public void setValidade(Data validade) {
        this.DataValidade = validade;
    }

    public boolean estaVencido(Data Data) {
        if (Data.getAno() < DataValidade.getAno()) {
            return true;
        } else if (Data.getAno() == DataValidade.getAno()) {
            if (Data.getMes() > DataValidade.getMes())
                return false;
            else
                return true;
        }
        return false;
    }


    public String toString() {
        return "[Nome do Produto: " + getNome() + "] [Valor R$" + getPreco() + "] [Validade: " + getValidade() + "]";
    }

}


