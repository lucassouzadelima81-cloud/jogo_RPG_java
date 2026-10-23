package rpg.teste;

import rpg.dominio.Heroi;
import rpg.dominio.Invetario;

public class HeroiTeste01 {
    static void main(String[] args) {
        Heroi heroi = new Heroi();
        Heroi heroi2 = new Heroi();
        Invetario invetario = new Invetario();
        heroi.nome="Arthur";
        heroi.vida=100;
        heroi.ataque=15;
        heroi.defesa=5;
        heroi2.nome="Luna";
        heroi2.vida=80;
        heroi2.ataque=20;
        heroi2.defesa=3;
        invetario.quantidadesPocoes=2;

        System.out.printf("""
                heroi1
                nome:%s
                vida:%d
                ataque:%d
                defesa:%d
                ---------------------
                heroi2
                nome:%s
                vida:%d
                ataque:%d
                defesa:%d
                """,heroi.nome,heroi.vida,heroi.ataque,heroi.defesa,heroi2.nome,heroi2.vida,heroi2.ataque,heroi2.defesa);
        System.out.println(heroi.estaVivo(50));
        System.out.println(heroi.calcularAtaqueTotal());

    }
}
