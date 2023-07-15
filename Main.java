package sp.senai.br.projetofinal;
import sp.senai.br.projetofinal.Batalha;

public class Main {
   
    public static void main(String[]args){
        
     Personagem  personagemUm    =  new Personagem ();
     Personagem  personagemDois  = new Personagem ();  
     
     Batalha ultimatebattle      = new Batalha ();
    
     personagemUm.setNome("Católicos");
     personagemUm.setAtributos(100.00, 100.00, 100.00, 100.00, 25.00, 25.00, 25.00);
     
     personagemDois.setNome("Bruxas");
     personagemDois.setAtributos (100.00, 100.00, 100.00, 100.00, 25.00, 25.00, 25.00);
     
     while(ultimatebattle.emAndamento == true){
     
     Ataque ataqueUm = new Ataque();
     ataqueUm.setAtributos(70.00, 30.00, 0.00, 0.00, 0.00);
     
         System.out.println(ataqueUm.getRequisitoMana());
    
     ultimatebattle.emAndamento = false;
     
     personagemUm.consumirMana(ataqueUm.getRequisitoMana());
     personagemUm.consumirStamina(ataqueUm.getRequisitoStamina());        
     
        System.out.printf("Dano fisico: %s", ataqueUm.getDanoFisico());
        System.out.printf("Dano magico: %s", ataqueUm.getDanoMagico());
       
        
        personagemDois.DanoFisico(ataqueUm.getDanoFisico());
        personagemDois.DanoMagico(ataqueUm.getDanoMagico());
        ultimatebatle.emandamento = false;
       
        /* System.out.println(personagemUm.getNome());
        System.out.println(personagemDois.getNome());
        */ 
        }
     }
}