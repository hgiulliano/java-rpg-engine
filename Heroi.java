public class Heroi extends Personagem implements Furtivo, Conjurador{
    
    private int pontosExperiencia;
    
    public Heroi(String nome, String raca, String classeRPG, int nivel, int pontosVida, Arma armaEquipada){
        super(nome,raca,classeRPG,nivel,pontosVida,armaEquipada);
        this.pontosExperiencia = 0;
    }

    public void ganharXP(int xp) {
        this.pontosExperiencia += xp;
        System.out.println("Experiencia adquirida: " + xp + ". Total de experiencia: " + this.pontosExperiencia);
    }

    @Override 
    public void atacar(Personagem alvo) {
        if (this.armaEquipada != null){
            alvo.receberDano(this.armaEquipada.getDanoMaximo());
            if (alvo.getHP() <= 0){
                System.out.println("O heroi " + this.nome + " atacou " + alvo.getNome() + " com a arma " + this.armaEquipada.getNome() + " causando " + this.armaEquipada.getDanoMaximo() + " de dano.");
                System.out.println("O alvo " + alvo.getNome() + " morreu!");
            }
            else{
                System.out.println("O heroi " + this.nome + " atacou " + alvo.getNome() + " com a arma " + this.armaEquipada.getNome() + " causando " + this.armaEquipada.getDanoMaximo() + " de dano.");
            }
        }
        else{
            alvo.receberDano(1);
            System.out.println("O heroi " + this.nome + " atacou " + alvo.getNome() + " desarmado causando 1 de dano.");
        }
    }

    @Override 
    public void realizarAtaqueFurtivo(Personagem alvo) {
        if (this.armaEquipada != null){
            int danoAtaqueFurtivo = (this.armaEquipada.getDanoMaximo()*2);
            alvo.receberDano(danoAtaqueFurtivo);
            System.out.println("Ataque Furtivo!! O heroi "+this.getNome()+" causou "+danoAtaqueFurtivo+" ao "+alvo.getNome()+".");
        }
        else{
            int danoAtaqueFurtivo = 2;
            alvo.receberDano(2);
            System.out.println("Ataque Furtivo!! O heroi "+this.getNome()+" esta desarmado e causou "+danoAtaqueFurtivo+" ao "+alvo.getNome()+".");

        }
    }

    @Override 
    public void lancarMagia(Personagem alvo){
        int danoMagia = 15;
        alvo.receberDano(danoMagia);
        System.out.println("O heroi "+this.nome+" lancou uma magia arcana no "+alvo.getNome()+", causando 15 de dano magico!");
    }
}
    