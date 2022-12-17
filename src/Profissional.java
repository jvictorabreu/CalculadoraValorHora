public class Profissional {
    private String nome;
    private double salMensal;
    private double salHora;

    private int diasUteis = 20; // dias úteis / mês financeiro, independente do mês.
    private double horasDia = 7; // FHD (Fator Horas Dia), horas produtivas por dia

    public double horasUteisMes = diasUteis * horasDia;


    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalMensal() {
        return salMensal;
    }

    public void setSalMensal(double salMensal) {
        this.salMensal = salMensal;
    }

    public double getSalHora() {
        this.salHora = (this.salMensal * 2) / horasUteisMes;
        return salHora;
    }
}
