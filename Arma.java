public class Arma {

    private String nome;
    private int danoMaximo;

    public Arma(String nome, int danoMaximo){
        this.nome = nome;
        this.danoMaximo = danoMaximo;
    }

    public String getNome(){
        return this.nome;
    }

    public int getDanoMaximo(){
        return this.danoMaximo;
    }

    public int rolarDano(){
        return this.danoMaximo;
    }

}
