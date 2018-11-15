let inicio = process.hrtime();
inicio = inicio[1];

let inicioRuntime = process.memoryUsage().heapUsed;

let text = "Olá Mundo!";

console.log(text);

let fim = process.hrtime();
fim = fim[1];

let fimRuntime = process.memoryUsage().heapUsed;

console.log(fim - inicio);

console.log(fimRuntime - inicioRuntime);


