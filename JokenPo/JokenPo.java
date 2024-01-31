package JokenPo;
import java.util.Random;
import java.util.Scanner;
public class JokenPo {
    private String pedra;
    private String tesoura;
    private String papel;
    private String pedrapc;
    private String tesourapc;
    private String papelpc;
    
    public JokenPo (){
        Scanner teclado = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("      BEM VINDO AO JOKENPO");
        System.out.println("O JOGO DE PEDRA, PAPEL OU TESOURA");
        System.out.println("==================================");
        System.out.println("           VAMOS JOGAR");
        System.out.println("==================================");
        while (true ) {
            System.out.println("DIGITE 1 - PEDRA, 2 - TESOURA OU 3 - PAPEL");
            int perg = teclado.nextInt();
            Random aleatorio = new Random();
            int pc = aleatorio.nextInt(1,4);
        switch(perg) {
            case 1 :
                this.setPedra("Pedra");
                System.out.println("Você escolheu " + this.getPedra());
                break;
            case 2 :
                this.setTesoura("Tesoura");
                System.out.println("Você escolheu " + this.getTesoura());
                break;
            case 3 :
                this.setPapel("Papel");
                System.out.println("Você Escolheu " + this.getPapel());
                break;
            default :
                System.out.println("NUMERO INVÁLIDO");
                break;
        }
        if (perg <= 3 && perg > 0) {
            switch(pc) {
            case 1 :
                this.setPedraPc("Pedra");
                System.out.println("Pc Escolheu " + this.getPedraPc());
                if (pc == perg) {
                    System.out.println("PEDRA COM PEDRA = EMPATE");
                }
                else if(pc == 1 && perg == 2) {
                    System.out.println("PEDRA GANHA DE TESOURA, EU GANHEI");
            } 
                else if(pc == 1 && perg == 3) {
                    System.out.println("PAPEL GANHA DE PEDRA, VOCÊ ME VENCEU");
                }
                break;
                
            case 2 :
                this.setTesouraPc("Tesoura");
                System.out.println("Pc Escolheu " + this.getTesouraPc());
                if (pc == perg) {
                    System.out.println("TESOURA COM TESOURA = EMPATE");
                }
                else if (pc == 2 && perg == 1) {
                    System.out.println("PEDRA GANHA DE TESOURA, VOCÊ ME VENCEU");
                }
                
                else if (pc == 2 && perg == 3){
                    System.out.println("TESOURA GANHA DE PAPEL, EU GANHEI");
                }
                
                break;
            case 3 :
                this.setPapelPc("Papel");
                System.out.println("Pc Escolheu " + this.getPapelPc());
                if (pc == perg) {
                    System.out.println("PAPEL COM PAPEL = EMPATE");
                }
                else if (pc == 3 && perg == 1) {
                    System.out.println("PAPEL GANHA DE PEDRA, EU VENCI");
                }
                else if(pc == 3 && perg == 2) {
                    System.out.println("TESOURA GANHA DE PAPEL, VOCÊ ME VENCEU");
                }
                break;
                
        
            
        }
            
        }
        System.out.println("Deseja sair ? [S] - Sim ou [N] - Não");
        char pergunta = teclado.next().charAt(0);
        if (pergunta == 'S') {
            System.out.println("ENCERRANDO O JOGO...");
            System.out.println(" ");
            break;
        }
      
        
                
        }
        System.out.println("===================================");
        System.out.println("OBRIGADO POR JOGAR NOSSO JOKENPO :)");
        System.out.println("        TENHA UM BOM DIA :)");
        System.out.println("===================================");
     
    }
    
    public String getPedra() {
        return this.pedra;
    }
    
    private void setPedra(String pe) {
        this.pedra = pe;
    }
    
    public String getTesoura() {
        return this.tesoura;
    }
    
    private void setTesoura(String te) {
        this.tesoura = te;
    }
    
    public String getPapel() {
        return this.papel;
    }
    
    private void setPapel(String pa) {
        this.papel = pa;
    }
    
    public String getPedraPc() {
        return this.pedrapc;
    }
    
    private void setPedraPc(String pc) {
        this.pedrapc = pc;
    }
    
    public String getTesouraPc() {
        return this.tesourapc;
    }
    
    private void setTesouraPc(String tepc) {
        this.tesourapc = tepc;
    }
    
    public String getPapelPc() {
        return this.papelpc;
    }
    
    private void setPapelPc(String papc) {
        this.papelpc = papc;
    }
    
}
