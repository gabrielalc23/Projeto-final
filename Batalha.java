package sp.senai.br.projetofinal;

import java.util.Scanner;

public class Batalha {
    
    public Scanner teclado = new Scanner (System.in);
    
    private int qtdTurnoLimite;
    private int qtdTurnoAtual;
    
    private Personagem personagemUm;
    private Personagem personagemDois;
    
    private Ataque ataqueUm;
    private Ataque ataqueDois;
    
    private int personagemUmVitorias;
    private int personagemDoisVitorias;
    
    public boolean emAndamento = true;

    public int getQtdTurnoLimite() {
        return qtdTurnoLimite;
    }

    public void setQtdTurnoLimite(int qtdTurnoLimite) {
        this.qtdTurnoLimite = qtdTurnoLimite;
    }

    public int getQtdTurnoAtual() {
        return qtdTurnoAtual;
    }

    public void setQtdTurnoAtual(int qtdTurnoAtual) {
        this.qtdTurnoAtual = qtdTurnoAtual;
    }

    public Personagem getPersonagemUm() {
        return personagemUm;
    }

    public void setPersonagemUm(Personagem personagemUm) {
        this.personagemUm = personagemUm;
    }

    public Personagem getPersonagemDois() {
        return personagemDois;
    }

    public void setPersonagemDois(Personagem personagemDois) {
        this.personagemDois = personagemDois;
    }

    public int getPersonagemUmVitorias() {
        return personagemUmVitorias;
    }

    public void setPersonagemUmVitorias(int personagemUmVitorias) {
        this.personagemUmVitorias = personagemUmVitorias;
    }

    public int getPersonagemDoisVitorias() {
        return personagemDoisVitorias;
    }

    public void setPersonagemDoisVitorias(int personagemDoisVitorias) {
        this.personagemDoisVitorias = personagemDoisVitorias;
    }
    
    public void ataquePersonagemUm()
    {
        this.personagemUm.consumirMana(this.ataqueUm.getRequisitoMana());
        this.personagemUm.consumirStamina(this.ataqueUm.getRequisitoStamina());

        this.personagemUm.sofrerDanoFisico(this.ataqueUm.getDanoFisico());
        this.personagemUm.sofrerDanoMagico(this.ataqueUm.getDanoMagico());
        
        System.out.printf("%s atacou > %s \n", this.personagemUm.getNome());
    }
    
    public void ataquePersonagemDois()
    {
        this.personagemDois.consumirMana(this.ataqueDois.getRequisitoMana());
        this.personagemDois.consumirStamina(this.ataqueDois.getRequisitoStamina());

        this.personagemDois.sofrerDanoFisico(this.ataqueDois.getDanoFisico());
        this.personagemDois.sofrerDanoMagico(this.ataqueDois.getDanoMagico());
        
        System.out.printf("%s atacou > %s \n ", this.personagemDois.getNome());
    }

    public void setAtaqueUm(Ataque ataqueUm) {
        this.ataqueUm = ataqueUm;
    }

    public void setAtaqueDois(Ataque ataqueDois) {
        this.ataqueDois = ataqueDois;
    }
    
    public void setNomes(){
        System.out.println("Digite o nome do primeiro personagem");
            String nome = teclado.next();
        
            this.personagemUm.setNome(nome);
            teclado.nextLine();
        System.out.println("Digite o nome do primeiro personagem");
            nome = teclado.next();
            
            this.personagemDois.setNome(nome);
    
    }
}
