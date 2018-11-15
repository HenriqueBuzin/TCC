numbers = []

with open("/Users/henrique_buzin/PycharmProjects/Python/src/1.000.txt") as file:

    for i, line in enumerate(file):

        numbers.insert(i, int(line.strip("\n")))

print(numbers)