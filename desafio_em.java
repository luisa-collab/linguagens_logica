// Para ler e escrever dados em Java, na "DIO" padronizaram da seguinte maneira:
// 1. (new Scanner(System.in)) - Cria um leitor de entradas, com metodos ulteis com prefixo "next";
// 2. (System.out.println) - Imprime na tela, um texto de saida (Output) e pulando uma linha;


// Realizando o Desafio em Java

import java.util.Scanner;

public class desafio_em {

    public static void main (String[] args) {
        //Lê os valores de Entrada
        Scanner leitorDeEntradas = new Scanner(System.in);
float valorSalario = leitorDeEntradas.nextFloat();
float valorBeneficios = leitorDeEntradas.nextFloat();

float valorImposto =0;
if (valorSalario>= 0 && valorSalario <= 1100){
//Atribuiu a aliquota de 5% mediante salario
valorImposto = 0.05F * valorSalario;
}
 
else if (valorSalario >= 1100.01 && valorSalario <= 2500.00){
    valorImposto = 0.10F * valorSalario;
}
 else {
    valorImposto = 0.15F * valorSalario;
 }


//Calcula e imprime a saída (com 2 casas decimais)
float saida = valorSalario + valorImposto + valorBeneficios;
System.out.println(String.format("%.2f", saida));

// Fecha o scanner
leitorDeEntradas.close();

    }
}