
package AreaDosPoligonos;

public class Trapezio extends Figura {
    private float baseMaior;
    private float baseMenor;
    private float altura ;
    
    public float getBaseMaior() {
        return this.baseMaior ;
    }
    
    public void setBaseMaior(float b) {
        this.baseMaior = b ;
    }
    
    public float getBaseMenor() {
        return this.baseMenor;
    }
    
    public void setBaseMenor(float bm) {
        this.baseMenor = bm;
        
    }
    
    public float getAltura() {
        return this.altura ; 
    }
    
    public void setAltura(float a) {
        this.altura = a ;
    }
    
    @ Override 
    
    public void tipoPoligono() {
        System.out.println("Trapézio \nPolígono de 4 Segmentos, sendo dois lados paralelos \nConhecidos como" 
        + "Base Maior e Base Menor");
    }
    
    @ Override 
    
    public float calcularArea() {
        return ((this.getBaseMaior() + this.getBaseMenor()) * (this.getAltura() / 2));
    }
    
    @ Override
    
    public String toString() {
           return ("Área do Trapézio é dada por (Base Maior + Base Menor) x (Altura / 2) "
                   + "\nA Área do seu Trapézio é de = " 
                + this.calcularArea() + " m²");
    }
    
}
