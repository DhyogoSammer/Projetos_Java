
package AreaDosPoligonos;


public class Losango extends Figura{
    private float diagonalMaior;
    private float diagonalMenor;
    
    public float getDiagonalMaior() {
        return this.diagonalMaior;
    }
    
    public void setDiagonalMaior(float d) {
        this.diagonalMaior = d ;
    }
    
    public float getDiagonalMenor() {
        return this.diagonalMenor;
    }
    
    public void setDiagonalMenor(float dm) {
        this.diagonalMenor = dm;
    }
    
    @Override 
    
    public void tipoPoligono() {
        System.out.println("Losango \nPoligono Quadrilátero que possui 4 lados iguais");
    }
    
    @ Override 
    
    public float calcularArea() {
        return ((this.getDiagonalMaior() * this.getDiagonalMenor()) / 2);
    }
    
    @ Override
    
    public String toString() {
        return ("Área do Losango é dada por Diagonal Maior x Diagonal Menor / 2 "
                + "\nÁrea do seu Losango é de = " + this.calcularArea() + " m²");
    }
    
    
    
}
