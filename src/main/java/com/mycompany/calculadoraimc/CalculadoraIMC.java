/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoraimc;

/**
 *
 * @author luis.fmleite
 */
public class CalculadoraIMC {

    private double peso;
    private double altura;
    private double imc;
    private String situacao;
    
    public CalculadoraIMC(double peso, double altura){
        setPeso(peso);
        setAltura(altura);
        CalculoIMC();
        
        
    }
    private void CalculoIMC(){
        imc = this.peso / (this.altura*this.altura);
        ResultadoIMC();
    }
    
    private void ResultadoIMC(){
        if (imc<17){
            situacao = "Muito abaixo do peso";
    } else if (imc >= 17 && imc < 18.5){
        situacao = "Abaixo do peso";
    }else if (imc >= 18.5 && imc < 25){
        situacao = "Peso normal";
    }else if (imc >= 25 && imc < 30){
        situacao = "Acima do peso";
    }else if (imc >= 30 && imc < 35){
        situacao = "Obesidade I";
    }else if (imc >= 35 && imc < 40){
        situacao = "Obesidade II (severa)";
    }else {
        situacao = "Obesidade III (mórbida)";
    }
    }

    
    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the imc
     */
    public double getImc() {
        return imc;
    }

    /**
     * @param imc the imc to set
     */
    public void setImc(double imc) {
        this.imc = imc;
    }

    /**
     * @return the situacao
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
