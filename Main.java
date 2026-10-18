import java.util.ArrayList;

public class Main {
    
    public static void listarParty(ArrayList<Personagem> party){
        for (Personagem personagem : party) {
            personagem.exibirFicha();
        }
    }
    public static void main(String[] args) {
 
        ArrayList<Personagem> party = new ArrayList<>();
        Arma cimitarra = new Arma("Cimitarra", 10);
        Heroi percy = new Heroi("Percy", "tabaxi", "ladino", 8, 55, cimitarra);
        Monstro goblin = new Monstro("Goblin", "goblin", "guerreiro", 3, 20, null, 100);
        party.add(percy);
        party.add(goblin);
        listarParty(party);
        percy.realizarAtaqueFurtivo(goblin);
        percy.lancarMagia(goblin);
        listarParty(party);
    }
}
