package rpg.dominio;

public class Heroi {
    public String nome;
    public int vida;
    public int vidaMaxima;
    public int ataque;//ataque basico
    public int defesa;
    public int nivel;
    public int experiencia;
    public int ouro;
    public Invetario invetario;


    public boolean estaVivo(int viida) {
        if (vida > viida) {
            return (true);
        } else {
            return (false);
        }
    }

    public int calcularAtaqueTotal() {
        if (invetario==null||invetario.armasEquipadas==null) {
            return ataque;
        }
           return ataque+invetario.armasEquipadas.bonusAtaque;
        }

    }



