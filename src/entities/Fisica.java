package entities;

public class Fisica extends Contribuidores{
    private Double gastosSaude;

    public Fisica(){
    }



    public Fisica(String nome, Double impostoAnual, Double gastosSaude) {
        super(nome, impostoAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }
    @Override
    public double taxa() {
        double taxaBasica;
        if (getImpostoAnual() < 20000.00){
            taxaBasica = getImpostoAnual() * 0.15 ;
        }else {
            taxaBasica = getImpostoAnual() * 0.25;
        }
        taxaBasica -= gastosSaude * 0.50;
        if (taxaBasica < 0.0){
            taxaBasica = 0.0;
        }
        return taxaBasica;
    }
}
