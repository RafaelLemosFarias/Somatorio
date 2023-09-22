var input = prompt("Digite um conjunto de números separados por vírgula:");

var numeros = input.split(",");

var soma = 0;

for (var i = 0; i < numeros.length; i++) {
  var numero = parseFloat(numeros[i]);
  
  if (!isNaN(numero)) {
    soma += numero;
  }
}

console.log("A soma dos números é: " + soma);
