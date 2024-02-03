
package AreaDosPoligonos;

public class Triangulo extends Figura{
    private float base;
    private float altura ;
    
    public float getBase() {
        return this.base ;
    }
    
    public void setBase(float b) {
        this.base = b ;
    }
    
    public float getAltura() {
        return this.altura ;
    }
    
    public void setAltura(float a) {
        this.altura = a ;
    }
    
    @Override 
    
    public void tipoPoligono() {
        System.out.println("Triângulo \nPoligono de 3 lados");
    }
    
    public float calcularArea() {
        return ((this.getAltura() * this.getBase()) / 2);
    }
    
    @ Override
    public String toString() {
        return ("Área do Triângulo é dada por Base x Altura / 2 \nA Área do seu triãngulo é de = " +
                this.calcularArea() + " m²");
    }
    
    
    
    
}
