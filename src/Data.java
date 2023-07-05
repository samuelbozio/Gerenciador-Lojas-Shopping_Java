public class Data {

    private int dia;
    private int mes;
    private int ano;


    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        if (!verificaAnoBissexto() && this.mes == 2 && this.dia == 29) {
            System.out.println("DATA INVÁLIDA!");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }

        if (getMes() > 12 || getMes() < 1) {
            System.out.println("DATA INVÁLIDA!");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }

        if (getAno() > 2030 || getAno() < 1900) {
            System.out.println("DATA INVÁLIDA!");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }

        if (getDia() > 31 || getDia() < 1) {
            System.out.println("DATA INVÁLIDA!");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }


        switch (getMes()) {
            case 4, 6, 9, 11 -> {
                if (getDia() > 30) {
                    System.out.println("DATA INVÁLIDA!");
                    this.dia = 1;
                    this.mes = 1;
                    this.ano = 2000;
                }
            }
        }

    }


    public boolean verificaAnoBissexto() {
        if (this.ano % 4 == 0 && this.ano % 100 != 0) {
            return true;
        } else {
            return false;
        }


    }


    public String toString() {
        return getDia() + "/" + getMes() + "/" + getAno();
    }
}
