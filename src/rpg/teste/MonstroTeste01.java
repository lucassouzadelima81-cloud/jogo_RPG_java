package rpg.teste;

import rpg.dominio.Monstro;

public class MonstroTeste01 {
    static void main(String[] args) {
        Monstro monstro = new Monstro();
        Monstro monstro2 = new Monstro();
        Monstro monstro3 = new Monstro();
        monstro.nome="Goblin";
        monstro.vida=30;
        monstro.ataque=6;
        monstro.defesa=1;
        monstro2.nome="Esqueleto";
        monstro2.vida=45;
        monstro2.ataque=9;
        monstro2.defesa=2;
        monstro3.nome="GuardiãoSombrio";
        monstro3.vida=75;
        monstro3.ataque=12;
        monstro3.defesa=3;
        System.out.printf("""
                Monstro1:
                nome:%s
                vida:%d
                ataque:%d
                defesa:%d
                ------------------------
                 Monstro2:
                nome:%s
                vida:%d
                ataque:%d
                defesa:%d
                ------------------------
                 Monstro3:
                nome:%s
                vida:%d
                ataque:%d
                defesa:%d
                """,monstro.nome,monstro.vida,monstro.ataque,monstro.defesa,monstro2.nome,monstro2.vida,monstro2.ataque,monstro2.defesa,monstro3.nome,monstro3.vida,monstro3.ataque,monstro3.defesa);

    }
}
