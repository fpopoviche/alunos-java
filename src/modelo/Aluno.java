/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Fellipe e Yuri
 * @since 20/03/2018 - 13:40
 * @version 1.0 Beta Prova
 */
public class Aluno {
    private String nome;
    private String sexo;
    private double n1;
    private double n2;
    private double p1;
    private double p2;
    private int totAulas;
    private int numPresencas;
    private ArrayList<String> disc;

    public Aluno() {
    }
    /**
     * 
     * @param nome recebe nome;
     * @param sexo recebe sexo;
     * @param n1 recebe nota1;
     * @param n2 recebe nota2;
     * @param p1 recebe peso1
     * @param p2 recebe peso2
     * @param totAulas recebe o total de aulas
     * @param numPresencas recebe o numero de presenças
     * @param disc recebe a disciplina
     */
    public Aluno(String nome, String sexo, double n1, double n2, double p1, double p2, int totAulas, int numPresencas, ArrayList<String> disc) {
        this.nome = nome;
        this.sexo = sexo;
        this.n1 = n1;
        this.n2 = n2;
        this.p1 = p1;
        this.p2 = p2;
        this.totAulas = totAulas;
        this.numPresencas = numPresencas;
        this.disc = disc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public int getTotAulas() {
        return totAulas;
    }

    public void setTotAulas(int totAulas) {
        this.totAulas = totAulas;
    }

    public int getNumPresencas() {
        return numPresencas;
    }

    public void setNumPresencas(int numPresencas) {
        this.numPresencas = numPresencas;
    }

    public ArrayList<String> getDisc() {
        return disc;
    }

    public void setDisc(ArrayList<String> disc) {
        this.disc = disc;
    }
    /**
     * 
     * @return realiza o calculo da média aritmetica
     */
    public double calcularMediaAritmetica(){
        return (n1 + n2)/2 ;
    }
    /**
     * 
     * @return realiza o calculo da média ponderada
     */
    public double calcularMediaPonderada(){
        return ((n1*p1+n2*p2))/(p1+p2);
    }
    /**
     * 
     * @return verifica a aprovação conforme a media aritmetica 
     */
    public String verificarAprovacao(){
        if(calcularMediaAritmetica() >= 6){
            return "Aprovado";
        }
        return "Reprovado";
    }
    /**
     * 
     * @return verifica o conceito do aluno
     */
    public String verificarConceito(){
        if(calcularMediaAritmetica() <= 10 && calcularMediaAritmetica() >= 9){
            return "A";
        }else if(calcularMediaAritmetica() <= 8.9 && calcularMediaAritmetica() >= 8){
            return "B";
        }else if(calcularMediaAritmetica() <= 7.9 && calcularMediaAritmetica() >= 7){
            return "C";
        }
        return "D";
    }
    /**
     * 
     * @return retorna a frequencia do aluno
     */
    public int calcularFrequencia(){
        return (numPresencas * 100) / totAulas;
    }

    @Override
    public String toString() {
        String xxx = "";
        for(int i=0 ; i<disc.size() ; i++){
            xxx = xxx + "\n" + disc.get(i);
        }//fecha for
        return "\nNome: " + nome 
                + "\nSexo: " + sexo 
                + "\n Nota 1: " + n1 
                + "\n Nota 2: " + n2 
                + "\n Peso 1: " + p1 
                + "\n Peso 2: " + p2 
                + "\n Total de aulas: " + totAulas 
                + "\n Numero de presencas: " + numPresencas 
                + "\n Disciplina: " + xxx
                + "\n Média aritmetica: " + calcularMediaAritmetica()
                + "\n Média ponderada: " + calcularMediaPonderada()
                + "\n Verificar aprovação: " + verificarAprovacao()
                + "\n Conceito: " + verificarConceito()
                + "\n Frequência: " + calcularFrequencia() + "% ";
    }
    
    
    
}
