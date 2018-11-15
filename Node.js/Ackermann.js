function Ack(m, n) {

    if (m == 0) {

        return n + 1;

    } else if(n == 0) {

        return Ack(m - 1, 1);

    } else {

        return Ack(m - 1, Ack(m, n - 1));

    }

}

let inicio = process.hrtime();
inicio = inicio[1];

let inicioRuntime = process.memoryUsage().heapUsed;

// let resultado = Ack(1, 1);
// let resultado = Ack(1, 2);
 let resultado = Ack(2, 1);
// let resultado = Ack(2, 2);
// let resultado = Ack(3, 1);
// let resultado = Ack(3, 2);
//let resultado = Ack(3, 2);

let fim = process.hrtime();
fim = fim[1];

let fimRuntime = process.memoryUsage().heapUsed;

console.log(resultado);

console.log(fim - inicio);

console.log(fimRuntime - inicioRuntime);