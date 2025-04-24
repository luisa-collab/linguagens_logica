// Desafios JavaScript na DIO tem funções "gets" e "print" acessiveis globalmente:
// "gets" lê uma linha de dados de entrada (inputs) do usuario;
// "print" Imprime um texto de saida (output), pulando uma linha.

//Lê os valores de entrada:
const valorSalario = parseFloat(gets());
const valorBeneficios = parseFloat(gets());

// Calcula o imposto atraves da função "calcularImposto":
const valorImposto = calcularImposto(valorSalario);

//Calcula e imprime a saida (com 2 casas decimais):
const saida = valorSalario - valorImposto + valorBeneficios;
print(saida.toFixed(2));

// Função util para o calculo do imposto (baseado nas aliquotas)
function calcularImposto(salario) { 
    let aliquota;
    if (salario >= 0 && salario <= 1100) {
        aliquota = 0.5;
    }
     else if (salario >= 1100.01 && salario <= 2500.00) {
        aliquota = 0.10;
     } else  {
       aliquota = 0.15;
     }

    return aliquota * salario;
}
