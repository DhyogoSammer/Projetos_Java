
package AreaDosPoligonos;
import java.util.*;

public class ProgramaPrincipal {
    public static void main(String [] args) { // Execute esse codigo .
        Poligonos p = new Poligonos();
        Retangulo r = new Retangulo();
        Quadrado q = new Quadrado ();
        Triangulo t = new Triangulo();
        Losango l = new Losango();
        Trapezio tp = new Trapezio();
        p.setRetangulo(r);
        p.setQuadrado(q);
        p.setTriangulo(t);
        p.setLosango(l);
        p.setTrapezio(tp);
        p.tipoPoligono();
        p.Mensagem();
        System.out.println(p.toString());

    }
    
}
