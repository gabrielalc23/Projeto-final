package sp.senai.br.projetofinal;

public class Personagem {
  
   private String nome;
   private Double pontoVida;       
   private Double pontosMana;
   private Double pontosStamina;
   private Double forca;
   private Double energia;
   private Double agilidade;
   private Double vitalidade;
  
public String getNome() {
        return nome;
    }

    public Double getPontoVida() {
        return pontoVida;
    }

    public Double getPontosMana() {
        return pontosMana;
    }

    public Double getPontosStamina() {
        return pontosStamina;
    }

    public Double getForca() {
        return forca;
    }

    public Double getEnergia() {
        return energia;
    }

    public Double getAgilidade() {
        return agilidade;
    }

    public Double getVitalidade() {
        return vitalidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPontoVida(Double pontoVida) {
        this.pontoVida = pontoVida;
    }
    
    public void setAtributos(Double pontoVida, Double pontosMana, Double pontosStamina, Double forca, Double energia, Double agilidade, Double vitalidade) {
    
        this.pontoVida = pontoVida;
        this.pontosMana = pontosMana;
        this.pontosStamina = pontosStamina;
        this.forca = forca;
        this.energia = energia;
        this.agilidade = agilidade;
        this.vitalidade = vitalidade;
}
 
    public void setPontosMana(Double pontosMana) {
        this.pontosMana = pontosMana;
    }

    public void setPontosStamina(Double pontosStamina) {
        this.pontosStamina = pontosStamina;
    }

    public void setForca(Double forca) {
        this.forca = forca;
    }

    public void setEnergia(Double energia) {
        this.energia = energia;
    }

    public void setAgilidade(Double agilidade) {
        this.agilidade = agilidade;
    }

    public void setVitalidade(Double vitalidade) {
        this.vitalidade = vitalidade;
    }

   public void consumirMana(double mana ) {
       this.pontosMana -= mana;
    }

   public void consumirStamina (Double pontosStamina) {
    this.pontosStamina -= pontosStamina;
    }

   public void DanoFisico (Double dano){
   this.pontoVida -= dano;
   }
   
   public void DanoMagico(Double dano){
   this.pontoVida -= dano;
   }
   
}
