public class Heroi extends Personagem{
    
    private int pontosExperiencia;
    
    public Heroi(String nome, String raca, String classeRPG, int nivel, int pontosVida, Arma armaEquipada){
        super(nome,raca,classeRPG,nivel,pontosVida,armaEquipada);
        this.pontosExperiencia = 0;
    }

    public void ganharXP(int xp) {
        this.pontosExperiencia += xp;
        System.out.println("Experiencia adquirida: " + xp + ". Total de experiencia: " + this.pontosExperiencia);
    }


}
    