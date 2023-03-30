import java.util.Scanner;

public class Codigo4 {
    
    public static void juegoPPT(){

    Scanner s = new Scanner(System.in); //instanciamos el escaner
    
    System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine(); //leemos el valor del jugador 1
    
    System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    String j2 = s.nextLine(); //leemos el valor del jugador 2
    
    if (j1.equals(j2)) {
      System.out.println("Empate"); //si ambas cadenas de texto son iguales hay empate si no desarrolla todos los casos para ver el ganador
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2.equals("tijeras")) {
            g = 1;
          }
          break;

        case "papel":
          if (j2.equals("piedra")) {
            g = 1;
          }
          break;
          
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default:
      }
      System.out.println("Gana el jugador " + g); //Inprimer el ganador
    }
    }
    
    
    public static void main(String[] args){
        juegoPPT();
    }
    
}
