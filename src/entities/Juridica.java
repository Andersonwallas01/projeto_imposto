package entities;

public class Juridica extends Contribuidores {
    private Integer numeroDeEmpregados;

    public Juridica(){
        super();
    }
    public Juridica(String nome, Double impostoAnual, int numeroDeEmpregados) {
        super(nome, impostoAnual);
        this.numeroDeEmpregados = numeroDeEmpregados;
    }

    @Override
    public double taxa() {
        double taxaBasica;
        if (numeroDeEmpregados < 10){
          return   taxaBasica = getImpostoAnual() * 0.16 ;
        }else {
          return   taxaBasica = getImpostoAnual() * 0.14;
        }


    }




}
