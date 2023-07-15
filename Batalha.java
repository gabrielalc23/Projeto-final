package sp.senai.br.projetofinal;

public class Batalha {
    
    private int qtdTurnoLimite;
    private int  qtdTurnoAtual;
    
    private Personagem personagemUm; 
    private Personagem personagemDois;
    
    private int personagemUmVitorias;
    private int personagemDoisVitorias;
    
    public boolean emAndamento = true;

    public void setQtdTurnoLimite(int qtdTurnoLimite) {
        this.qtdTurnoLimite = qtdTurnoLimite;
    }

    public void setQtdTurnoAtual(int qtdTurnoAtual) {
        this.qtdTurnoAtual = qtdTurnoAtual;
    }

    public void setPersonagemUm(Personagem PersonagemUm) {
        this.personagemUm = PersonagemUm;
    }

    public void setPersonagemDois(Personagem personagemDois) {
        this.personagemDois = personagemDois;
    }

    public void setPersonagemUmVitorias(int personagemUmVitorias) {
        this.personagemUmVitorias = personagemUmVitorias;
    }

    public void setPersonagemDoisVitorias(int personagemDoisVitorias) {
        this.personagemDoisVitorias = personagemDoisVitorias;
    }

    public int getQtdTurnoLimite() {
        return qtdTurnoLimite;
    }

    public int getQtdTurnoAtual() {
        return qtdTurnoAtual;
    }

    public Personagem getPersonagemUm() {
        return personagemUm;
    }

    public Personagem getPersonagemDois() {
        return personagemDois;
    }

    public int getPersonagemUmVitorias() {
        return personagemUmVitorias;
    }

    public int getPersonagemDoisVitorias() {
        return personagemDoisVitorias;
    }
}
