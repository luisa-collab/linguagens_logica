// Para ler e escrever dados em C#, utilizamos os seguintes metodos da classe console:
// Console.ReadLine: Lê "UMA" linha com dados de entrada (Input) do usuario;
// Console.writeLine: Imprime um texto de saida (Output) e pulando uma linha;


using System;

public class linguagens_Desafio
{
    public static void Main()
    {
        //Lê os valores de entrada
        float valorSalario = float.Parse(Console.ReadLine());
        float valorBeneficio = float.Parse(Console.ReadLine());

        float valorImposto = 0;
        if (valorSalario>= 0 && valorSalario <= 1100)
        {
        // Atribuiu a aliquota de 5% mediante o salario:
            valorImposto = 0.05f * valorSalario;
        }
        else if (valorSalario >= 1100.01 && valorSalario <= 2500.00){
    valorImposto = 0.10F * valorSalario;
}
 else {
    valorImposto = 0.15F * valorSalario;
 }

// Calcula e imprime o resultado
        float saida = valorSalario - valorImposto + valorBeneficio;
        //Imprime o resultado   
        Console.WriteLine(saida.ToString("0.00"));
        //Console.WriteLine("O valor do salario é: " + valorSalario.ToString("0.00"));
    }

}