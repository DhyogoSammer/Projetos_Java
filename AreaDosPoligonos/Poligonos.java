
package AreaDosPoligonos;
import java.util.*;

public class Poligonos extends Figura  {
    private Retangulo ret ; // Relacionamento de agregação
    private Quadrado quad;
    private Triangulo tri;
    private Losango lo;
    Scanner teclado = new Scanner(System.in); // Meu input 
    private char perg; // Variavel Global
    
    public Retangulo getRetangulo() {
        return this.ret;
    }
    
    public void setRetangulo(Retangulo r) {
        this.ret = r ;
    }
    
    public Quadrado getQuadrado() {
        return this.quad;
    }
    
    public void setQuadrado(Quadrado q) {
        this.quad = q;
    }
    
    public Triangulo getTriangulo() {
        return this.tri;
    }
    
    public void setTriangulo(Triangulo t) {
        this.tri = t;
    }
    
    public Losango getLosango() {
        return this.lo;
    }
    
    public void setLosango(Losango l) {
        this.lo = l;
    }

    
    
    public Poligonos () {
        System.out.println("========== ÁREA DOS POLIGONOS ==========");
        System.out.println("=========================================");
        System.out.println("Escolha o póligono que você deseja calcular a área "
        + "\n[R] - Retângulo, [Q] - Quadrado, [T] - Triangulo ou [L] - Losângo");
        perg = teclado.next().toUpperCase().charAt(0); 

        
    }
    
    @Override
    public void tipoPoligono() {
        if (perg == 'R') {
            this.getRetangulo().tipoPoligono();          
        }
        else if (perg == 'Q') {
            this.getQuadrado().tipoPoligono();
        }
        
        else if (perg == 'T') {
            this.getTriangulo().tipoPoligono();
        }
        
        else if (perg == 'L') {
        this.getLosango().tipoPoligono(); 
        }
        
    }
    
    
    public void Mensagem () {
        switch (perg) {
            case 'R':
                System.out.println("Digite a base : ");
                float b = teclado.nextFloat();
                this.getRetangulo().setLado1(b);
                System.out.println("Digite a altura : ");
                float a = teclado.nextFloat();
                this.getRetangulo().setLado2(a);
                break;
            case 'Q' :
                System.out.println("Lado 1");
                float l1 = teclado.nextFloat();
                this.getQuadrado().setLado1(l1);
                System.out.println("Lado 2 ");
                float l2 = teclado.nextFloat();
                this.getQuadrado().setLado2(l2);
                break;
            case 'T':
                System.out.println("Digite a base : ");
                float bT = teclado.nextFloat();
                this.getTriangulo().setBase(bT);
                System.out.println("Digite a altura : ");
                float aT = teclado.nextFloat();
                this.getTriangulo().setAltura(aT);
                break;
            case 'L':
                System.out.println("Diagonal Maior : ");
                float dMaior = teclado.nextFloat();
                this.getLosango().setDiagonalMaior(dMaior);
                System.out.println("Diagonal Menor :");
                float dMenor = teclado.nextFloat();
                this.getLosango().setDiagonalMenor(dMenor);
                break;
            default :
                break;
        }
    }
    
    @Override
    public float calcularArea() {
        return(0);    
    }
    
    
    
    @ Override
    
    public String toString()  {
        if (perg == 'R') {
            return (this.getRetangulo().toString());
            
        }
        else if (perg == 'Q') {
            return (this.getQuadrado().toString());
        }
        
        else if (perg == 'T') {
            return (this.getTriangulo().toString());
        }
        
        else if (perg == 'L') {
            return (this.getLosango().toString());
        }
        
        else {
            return ("ERROR");
        }



    
    
    
    }    
}
    
    

    
    
    
        
                
        
        
    
    

        
    
        
    
    

            
    
    

