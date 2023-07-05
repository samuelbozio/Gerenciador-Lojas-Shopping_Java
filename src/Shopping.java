import java.util.Arrays;
import java.util.Scanner;

public class Shopping {

    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaLojas];
    }

    public boolean insereLoja(Loja loja) {

        for (int i = 0; i < lojas.length; i++) {

            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nome) {

        for (int i = 0; i < lojas.length; i++) {

            if (lojas[i] != null && lojas[i].getNome().equals(nome)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }


    public int quantidadeLojasPorTipo(String tipoLoja) {
        int total = 0;
        for (Loja loja : lojas) {

            switch (tipoLoja) {
                case "Bijuteria":
                    if (loja instanceof Bijuteria)
                        total += 1;
                    break;
                case "Cosmético":
                    if (loja instanceof Cosmetico)
                        total += 1;
                    break;
                case "Informática":
                    if (loja instanceof Informatica)
                        total += 1;
                    break;
                case "Alimentação":
                    if (loja instanceof Alimentacao) {
                        total += 1;
                        break;
                    }
                case "Vestuário":
                    if (loja instanceof Vestuario) {
                        total += 1;
                        break;

                    }
                    break;
            }
        }
        return total;
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaMaisCara = null;
        double valorSeguroMaisCaro = 0;
        for (Loja loja : lojas) {
            if (loja instanceof Informatica informatica) {
                double valorSeguro = informatica.getSeguroEletronicos();
                if (valorSeguro > valorSeguroMaisCaro) {
                    valorSeguroMaisCaro = valorSeguro;

                    lojaMaisCara = informatica;


                }

            }

        }
        return lojaMaisCara;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    @Override
    public String toString() {
        return "[Shopping: " +
                nome +
                ", Endereço: " + endereco +
                ", Lojas: " + Arrays.toString(lojas) +
                ']';
    }
}
