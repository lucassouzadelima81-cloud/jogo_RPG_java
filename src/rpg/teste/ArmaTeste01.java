package rpg.teste;

import rpg.dominio.Armas;

public class ArmaTeste01 {
    static void main(String[] args) {
        Armas arma = new Armas();
        Armas arma2 = new Armas();
        arma.nome="Espada de Madeira";
        arma.bonusAtaque=2;
        arma2.nome="Espada de Ferro";
        arma2.bonusAtaque=8;
        System.out.printf("""
                Arma1:
                nome:%s
                bonus:%d
                --------------
                Arma2:
                nome:%s
                bonus:%d
                """,arma.nome,arma.bonusAtaque,arma2.nome,arma2.bonusAtaque);
    }
}
