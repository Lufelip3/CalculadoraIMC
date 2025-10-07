/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoraimc;

/**
 *
 * @author luis.fmleite
 */
// Classe responsável pela lógica de cálculo do IMC (Índice de Massa Corporal).
public class CalculadoraIMC {
// Atributos privados para garantir encapsulamento.
    // 'peso' e 'altura' são os dados de entrada.

    private double peso;
    private double altura;
    // 'imc' é o resultado do cálculo.
    private double imc;
    // 'situacao' é a classificação do IMC.
    private String situacao;

    // Construtor público que recebe os valores iniciais de peso e altura.
    // Utiliza os setters para atribuir os valores e já dispara o cálculo do IMC.
    public CalculadoraIMC(double peso, double altura) {
        CalculoIMC();            // Método privado que realiza o cálculo e define a situação.
    }

    // Método privado que aplica a fórmula do IMC: peso dividido pela altura ao quadrado.
    // Após calcular o IMC, chama o método que define a classificação.
    private void CalculoIMC() {
        imc = this.peso / (this.altura * this.altura);  // Fórmula padrão do IMC.
        ResultadoIMC();                                  // Classifica o resultado.
    }

    // Método privado que define a faixa de classificação do IMC com base no valor calculado.
    // Utiliza estrutura condicional encadeada (if-else) para cobrir todas as faixas.
    private void ResultadoIMC() {
        if (imc < 17) {
            situacao = "Muito abaixo do peso";
        } else if (imc >= 17 && imc < 18.5) {
            situacao = "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 25) {
            situacao = "Peso normal";
        } else if (imc >= 25 && imc < 30) {
            situacao = "Acima do peso";
        } else if (imc >= 30 && imc < 35) {
            situacao = "Obesidade I";
        } else if (imc >= 35 && imc < 40) {
            situacao = "Obesidade II (severa)";
        } else {
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
