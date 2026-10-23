package rpg.dominio;

public class Monstro {
     public String nome;
     public int vida;
     public int ataque;
     public int defesa;
     public int ouroRecompensa;
     public int experienciaRecompensa;

     public boolean estaVivo(int viida){
          if (vida>viida){
               return (true);
          }else{
               return (false);
          }
     }
}
