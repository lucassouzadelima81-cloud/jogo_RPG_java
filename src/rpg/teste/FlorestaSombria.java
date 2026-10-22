package rpg.teste;

import rpg.dominio.Fase;
import rpg.dominio.Monstro;


public class FlorestaSombria {
    static void main(String[] args) {
        Monstro monstro = new Monstro();
        monstro.nome = "Goblin";
        Fase fase = new Fase();
        fase.monstro = monstro;
        System.out.println("Na Floresta Sombria encontramos esse "  + fase.monstro.nome);
    }
}
