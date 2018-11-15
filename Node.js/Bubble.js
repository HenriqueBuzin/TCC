function Bubble(numbers) {

    let temp = 0;

    for(let i = 0; i < numbers.length; i++){

        for(let j = 0; j < numbers.length - i; j++){

            if(numbers[j] > numbers[j + 1]){

                temp = numbers[j];

                numbers[j] = numbers[j + 1];

                numbers[j + 1] = temp;

            }

        }

    }

}

numbers = [];

// require('fs').readFileSync('/Users/henrique_buzin/WebstormProjects/Node.js/100.000.txt',).toString().split('\n').forEach(function (line) {
// require('fs').readFileSync('/Users/henrique_buzin/WebstormProjects/Node.js/10.000.txt',).toString().split('\n').forEach(function (line) {
require('fs').readFileSync('/Users/henrique_buzin/WebstormProjects/Node.js/1.000.txt',).toString().split('\n').forEach(function (line) {

    numbers.push(parseInt(line, 10));

});

let inicio = process.hrtime();
inicio = inicio[1];

let inicioRuntime = process.memoryUsage().heapUsed;

Bubble(numbers);

let fim = process.hrtime();
fim = fim[1];

let fimRuntime = process.memoryUsage().heapUsed;

for(let i = 0; i < numbers.length; i++){

    console.log(numbers[i]);

}

console.log(fim - inicio);

console.log(fimRuntime - inicioRuntime);