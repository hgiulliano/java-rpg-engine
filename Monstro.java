public class Monstro extends Personagem {
    
    private int xpAbate;

    public Monstro(String nome, String raca, String classeRPG, int nivel,int pontosVida,Arma armaEquipada,int xpAbate){
        super(nome, raca, classeRPG, nivel, pontosVida, armaEquipada);
        this.xpAbate = xpAbate;
    }

    public int getXpAbate(){
        return this.xpAbate;
    }
}
