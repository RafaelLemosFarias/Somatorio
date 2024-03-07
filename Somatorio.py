input_str = input("Digite um conjunto de números separados por vírgula: ")

numeros = input_str.split(",")
soma = 0

for numero_str in numeros:
    try:
        numero = float(numero_str.strip())
        soma += numero
    except ValueError:
        continue

print("A soma dos números é:", soma)
