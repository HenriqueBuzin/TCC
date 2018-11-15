import time

import resource

inicio = time.time_ns()

inicioRuntime = resource.getrusage(resource.RUSAGE_SELF).ru_maxrss

text = "Olá Mundo!"

print(text)

fim = time.time_ns()

fimRuntime = resource.getrusage(resource.RUSAGE_SELF).ru_maxrss

print(fim - inicio)

print(fimRuntime - inicioRuntime)

