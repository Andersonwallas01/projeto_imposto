package entities;

public abstract class Contribuidores {

    private String nome;
    private Double impostoAnual;
    public Contribuidores() {
    }
    public Contribuidores(String nome, Double impostoAnual) {
        this.nome = nome;
        this.impostoAnual = impostoAnual;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getImpostoAnual() {
        return impostoAnual;
    }

    public void setImpostoAnual(Double impostoAnual) {
        this.impostoAnual = impostoAnual;
    }
    public abstract double taxa();
}
