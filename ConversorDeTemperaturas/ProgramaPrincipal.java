package ConversorDeTemperaturas;
import java.util.Scanner;
public class ProgramaPrincipal {
    public static void main(String[] args) {
        Conversor objeto = new Conversor();
        Temperatura t = new Temperatura(); 
        objeto.setTemperatura(t);
        objeto.pergunta1();
        objeto.perguntaTemperatura();
        
    }
    
}
