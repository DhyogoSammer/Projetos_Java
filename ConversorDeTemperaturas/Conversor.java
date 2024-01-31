package ConversorDeTemperaturas;
import java.util.Scanner;
public class Conversor {
    private Temperatura temperatura;
    Scanner teclado = new Scanner(System.in);
    private float pergTemp; // Minhas variaveis globais
    private char perg;
    private char perg2;
    
    public Conversor () {
        System.out.println("========= CONVERSOR DE TEMPERATURAS ==========");
        System.out.println("==============================================");
    }
    
    public Temperatura getTemperatura() {
        return this.temperatura;
    }
    
    public void setTemperatura(Temperatura t) {
        this.temperatura = t;
        
    }
    
    

    public void perguntaTemperatura() {
        if (perg == 'C' && perg2 == 'K' || perg == 'C' && perg2 == 'F' || perg == 'K' && perg2 == 'C' || perg == 'K' 
            && perg2 == 'F' || perg == 'F' && perg2 == 'C' || perg == 'F' && perg2 == 'K') {
            System.out.println("Digite o valor temperatura que deseja converter");
            float pergTemp = teclado.nextFloat();
            this.calculo(pergTemp);    
        }
        
        
        else {
            System.out.println("UNIDADE INVÁLIDA");     
                }
    }
             
 

          
    
    
    public void pergunta1() {
        System.out.println("Converter de : [C] - Celsius, [K] - Kelvin ou [F] - Farenheit");
        perg = teclado.next().toUpperCase().charAt(0);
        switch (perg) {
            case 'C' :
                System.out.println("Celsius Selecionado");
                this.pergunta2(perg); // Chamada do metodo pergunta 2      
                break;
            case 'K' :
                System.out.println("Kelvin Selecionado");
                this.pergunta2(perg); // Chamada do metodo pergunta 2      
                break;
            case 'F' :
                System.out.println("Farenheit Selecionado");
                this.pergunta2(perg); // Chamada do metodo pergunta 2      
                break;
            default :
                break;
        }


            
    
    }
    
    public void pergunta2(char caract) {
        System.out.println("Para : [C] - Celsius, [K] - Kelvin ou [F] - Farenheit");
        perg2 = teclado.next().toUpperCase().charAt(0);   
      
    }
    
    public void calculo(float temp) {
        if (perg == 'C' && perg2 == 'K') {
        System.out.println("A temperatura selecionada foi de " + temp + " °C");
        float contaCk = temp + 273;
        this.getTemperatura().setKelvin(contaCk);
        System.out.println("Sua temperatura convertida de CELSIUS em KELVIN vai ser de " + this.getTemperatura().getKelvin() + " K");
        }
        
        else if(perg == 'C' && perg2 == 'F') {
            System.out.println("A temperatura selecionada foi de " + temp + " °C");
            float contaCf = (temp * 1.8f) + 32;
            this.getTemperatura().setFarenheit(contaCf);
            System.out.println("Sua temperatura convertidade de CELSIUS em FARENHEIT vai ser de " + this.getTemperatura().getFarenheit() + " °F");
        }
        

        
        else if(perg == 'K' && perg2 == 'C') {
            System.out.println("A temperatura selecionada foi de " + temp + " K");
            float contaKc = temp - 273;
            this.getTemperatura().setCelsius(contaKc);
            System.out.println("Sua temperatura convertida de KELVIN em CELSIUS vai ser de " + this.getTemperatura().getCelsius() + " °C");
            
        }
        
        else if(perg == 'K' && perg2 == 'F') {
            System.out.println("A temperatura selecionada foi de " + temp + " K");
            float contaKf = ((temp-273) * 1.8f) + 32;
            this.getTemperatura().setFarenheit(contaKf);
            System.out.println("Sua temperatura convertida de KELVIN em FARENHEIT vai ser de " + this.getTemperatura().getFarenheit() + " °F");
            
        }

        else if (perg == 'F' && perg2 == 'C') {
            System.out.println("A temperatura selecionada foi de " + temp + " °F");
            float contaFc = (temp - 32) / 1.8f;
            this.getTemperatura().setCelsius(contaFc);
            System.out.println("Sua temperatura convertidade de FARENHEIT em CELSIUS vai ser de " + this.getTemperatura().getCelsius() + " °C");          
        }    
        
        else if(perg == 'F' && perg2 == 'K') {
            System.out.println("A temperatura selecionada foi de " + temp + " °F");
            float contaFk = ((temp-32) * 5/9) + 273;
            this.getTemperatura().setKelvin(contaFk);
            System.out.println("Sua temperatura convertida de FARENHEIT em KELVIN vai ser de " + this.getTemperatura().getKelvin() + " K");
        }
             
        
        

        
    }

        
    }
    


    
