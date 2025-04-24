# Para ler e escrever dados em Python, utilizamos as seguintes funções:
# - input: Lê uma linha com dados de entrada do usuário.
# - print: Imprime um texto de saída (Output), pulando linha.


# Função para o cálculo do imposto (baseado nas alíquotas)
def calcular_imposto(salario):
    aliquota = 0.00
    if salario >= 0 and salario <= 1100:
        aliquota = 0.05
    elif salario >= 1100.01 and salario <= 2500.00:
        aliquota = 0.10
    else:
        aliquota = 0.15
    # Calcula o valor do imposto baseado na alíquota e no salário
    return aliquota * salario

# Lê os valores de entrada:
valor_salario = float(input())
valor_beneficio = float(input())

# Calcula o valor do imposto através da função "calcular_imposto".
valor_imposto = calcular_imposto(valor_salario)

# Calcula e imprime a saída (com 2 casas decimais)
saida = valor_salario - valor_imposto + valor_beneficio
print(f"{saida:.2f}")