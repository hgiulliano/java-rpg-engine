import java.util.ArrayList;

public class Main {
    
    public static void listarParty(ArrayList<Personagem> party){
        for (Personagem personagem : party) {
            personagem.exibirFicha();
        }
    }
    public static void main(String[] args) {
 
        ArrayList<Personagem> party = new ArrayList<>();
        Heroi percy = new Heroi("Percy", "tabaxi", "ladino", 8, 55, null);
        Monstro goblin = new Monstro("Goblin", "goblin", "guerreiro", 3, 30, null, 100);
        party.add(percy);
        party.add(goblin);
        percy.ganharXP(goblin.getXpAbate());
        listarParty(party);
    }
}
