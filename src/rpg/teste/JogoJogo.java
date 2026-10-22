package rpg.teste;

import rpg.dominio.Heroi;
import rpg.dominio.Jogo;

public class JogoJogo {
    static void main(String[] args) {
        Jogo jogo = new Jogo();
        Heroi heroi = new Heroi();
        heroi.nome="Bigode";
        jogo.heroi=heroi;
        System.out.println("JogoRPG é dominado por " +jogo.heroi.nome);

    }
}
