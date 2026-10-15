public class Monstro extends Personagem {
    
    private int xpAbate;

    public Monstro(String nome, String raca, String classeRPG, int nivel,int pontosVida,Arma armaEquipada,int xpAbate){
        super(nome, raca, classeRPG, nivel, pontosVida, armaEquipada);
        this.xpAbate = xpAbate;
    }

    public int getXpAbate(){
        return this.xpAbate;
    }

    @Override 
    public void atacar(Personagem alvo) {
        int dano = (this.getNivel()*2);
        alvo.receberDano(dano);
        System.out.println("O Monstro " + this.getNome() + " atacou o alvo " + alvo.getNome() + " e causou " + dano + " de dano.");
    }
}
