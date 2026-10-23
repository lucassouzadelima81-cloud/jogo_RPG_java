package rpg.teste;


import rpg.dominio.Armas;
import rpg.dominio.Invetario;

public class InventarioTeste01 {
    static void main(String[] args) {
        Invetario invetario = new Invetario();
        invetario.quantidadesPocoes = 3;

        Armas espada = new Armas();
        espada.nome = "espada de ferro";
        espada.bonusAtaque = 2;

        invetario.armasEquipadas = espada;


        System.out.printf("""
                arma:%s
                bonus ataque:%d
                porcoes:%d
                """,espada.nome,espada.bonusAtaque,invetario.quantidadesPocoes,invetario.armasEquipadas);

    }
}
