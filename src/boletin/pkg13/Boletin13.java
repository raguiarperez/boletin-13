package boletin.pkg13;

/**
 *
 * @author rafa2
 */
public class Boletin13 {

    public static void main(String[] args) {
        xogador xog1 = new xogador(1, "portero", 1, "Jesu", "Perez", 43);
        adestrador adestra = new adestrador("trainer", 2, "Andres", "Gonzalezper", 70);
        masajista masa1 = new masajista("licenciado", 15,10, "julio", "Ranchez", 26);
        Seleccion xogador = new Seleccion(2,"pepe", "sanabriaz", 20);
        
        xog1.concentrarse();
        adestra.concentrarse();
        masa1.concentrarse();
        xogador.concentrarse();
        
        xog1.viaxar();
        adestra.viaxar();
        masa1.viaxar();
        xogador.viaxar();
        

  }
    
    }


