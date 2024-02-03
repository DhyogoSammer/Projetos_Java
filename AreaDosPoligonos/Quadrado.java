
package AreaDosPoligonos;

public class Quadrado extends Retangulo {
    
    @Override 
    
    public void tipoPoligono() {
        System.out.println("Quadrado \nPoligono com 4 segmentos iguais");
    }
    
    @Override
    
    public float calcularArea() {
        return (this.getLado1() * this.getLado2());
    }
    
    @ Override
    
    
    public String toString() {
        return ("Área do Quadrado é dada por Lado x Lado \nÁrea do seu Quadrado é de = " 
                + this.calcularArea() + " m²");
    }
    
}
