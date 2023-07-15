
package sp.senai.br.projetofinal;

public class Ataque {
    
    public String nome;
    public Double danoMagico;
    public Double danoFisico;
    public Double requisitoMana;
    public Double requisitoStamina;
    
    public void setAtributos(Double requisitoMana, Double requisitoStamina, Double mana, Double danoMagico, Double danoFisico ){
    
    this.danoMagico       =  danoMagico; 
    this.danoFisico       =  danoFisico;
    this.requisitoMana    =  requisitoMana;
    this.requisitoStamina = requisitoStamina;
    
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDanoMagico(Double danoMagico) {
        this.danoMagico = danoMagico;
    }

    public void setDanoFisico(Double danoFisico) {
        this.danoFisico = danoFisico;
    }

    public void setRequisitoMana(Double requisitoMana) {
        this.requisitoMana = requisitoMana;
    }

    public void setRequisitoStamina(Double requisitoStamina) {
        this.requisitoStamina = requisitoStamina;
    }

    public String getNome() {
        return nome;
    }

    public Double getDanoMagico() {
        return danoMagico;
    }

    public Double getDanoFisico() {
        return danoFisico;
    }

    public Double getRequisitoMana() {
        return requisitoMana;
    }

    public Double getRequisitoStamina() {
        return requisitoStamina;
    }
}
