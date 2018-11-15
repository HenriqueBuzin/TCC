import time

import resource

def Bubble(numbers):

    for i in range(len(numbers) - 1, 0, -1):

        for j in range(i):

            if numbers[j] > numbers[j + 1]:

                temp = numbers[j]

                numbers[j] = numbers[j + 1]

                numbers[j + 1] = temp

numbers = []

runtimex = resource.getrusage(resource.RUSAGE_SELF).ru_maxrss

# with open("/Users/henrique_buzin/PycharmProjects/Python/src/1.000.txt") as file:
# with open("/Users/henrique_buzin/PycharmProjects/Python/src/10.000.txt") as file:
with open("/Users/henrique_buzin/PycharmProjects/Python/src/1.000.txt") as file:

    for i, line in enumerate(file):

        numbers.insert(i, int(line.strip("\n")))

inicio = time.time_ns()

inicioRuntime = resource.getrusage(resource.RUSAGE_SELF).ru_maxrss

Bubble(numbers)

fim = time.time_ns()

fimRuntime = resource.getrusage(resource.RUSAGE_SELF).ru_maxrss

print(numbers)

print(fim - inicio)

print(fimRuntime - inicioRuntime)
