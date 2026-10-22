package rpg.teste;

import rpg.dominio.Pocao;

public class PocaoTeste01 {
    static void main(String[] args) {
        Pocao pocao = new Pocao();
        Pocao pocaoGrande = new Pocao();
        pocao.pontosCura=20;
        pocaoGrande.pontosCura=50;
        System.out.printf("""
                PocaoPequena:
                Cura:%d
                ----------------
                PocaoGrande
                Cura:%d
                """,pocao.pontosCura,pocaoGrande.pontosCura);
    }
}
