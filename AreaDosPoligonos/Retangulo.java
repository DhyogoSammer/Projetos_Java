package AreaDosPoligonos;

public class Retangulo extends Figura {
    private float lado1 ;
    private float lado2 ;
    
    public float getLado1() {
        return this.lado1 ;
    }
    
    public void setLado1(float b) {
        this.lado1 = b ;
    }
    
    public float getLado2() {
        return this.lado2 ;
    }
    
    public void setLado2(float a) {
        this.lado2 = a ;
    }
    
    @Override 
    
    public void tipoPoligono() {
         System.out.println("Retangulo \nPoligono de 4 segmentos");
    }
    
    public float calcularArea() {
        return (this.getLado1() * this.getLado2());
    }
    
    public String toString() {
        return ("Área do Retângulo é dada por Base x Altura \nA Área do seu Retângulo é de = " 
                + this.calcularArea() + " m²");
    }
    
}
