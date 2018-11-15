import time

import resource

def Ack(m, n):

   return (n + 1) if m == 0 else (

      Ack(m - 1, 1) if n == 0 else Ack(m - 1, Ack(m, n - 1)))

inicio = time.time_ns()

inicioRuntime = resource.getrusage(resource.RUSAGE_SELF).ru_maxrss

# resultado = Ack(1, 1)
# resultado = Ack(1, 2)
resultado = Ack(2, 1)
# resultado = Ack(2, 2)
# resultado = Ack(3, 1)
# resultado = Ack(3, 2)
# resultado = Ack(1, 4)

fim = time.time_ns()

fimRuntime = resource.getrusage(resource.RUSAGE_SELF).ru_maxrss

print(resultado)

print(fim - inicio)

print(fimRuntime - inicioRuntime)

print(fimRuntime)