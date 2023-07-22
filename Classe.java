package sp.senai.br.projetofinal;

public class Classe {
    
    private String nome;
    private Double pontosDeVida;
    private Double pontosDeMana;
    private Double pontosDeStamina;
    private Double força;
    private Double energia;
    private Double agilidade;
    private Double vitalidade;
    
    public Classe setMago(){
    
    Classe classePersonagem = new Classe();
        
    classePersonagem.nome = "Mago";
    classePersonagem.pontosDeVida = 100.00;
    classePersonagem.pontosDeMana = 350.00;
    classePersonagem.pontosDeStamina = 50.00;
    classePersonagem.força = 250.00;
    classePersonagem.energia = 30.00;
    classePersonagem.agilidade = 20.00;
    classePersonagem.vitalidade = 20.00;
            
       
    return classePersonagem;
  
    }        
}
