package main

import (
	"fmt"
	"github.com/pkg/profile"
	"io/ioutil"
	"os"
	"strconv"
	"strings"
	"time"
)

func Bubble(numbers[] int)[]int {

	var temp = 0;

	for i := 0; i < len(numbers); i++ {

		for j := 0; j < len(numbers) - 1; j++ {

			if numbers[j] > numbers[j + 1]{

				temp = numbers[j]

				numbers[j] = numbers[j + 1]

				numbers[j + 1] = temp

			}

		}

	}

	return numbers

}

func main() {

	dir, _ := os.Getwd()

	defer profile.Start(profile.MemProfile, profile.MemProfileRate(100), profile.ProfilePath(dir)).Stop()

	for i := 0; i < 10000; i++ {

		tmp := make([]byte, 100000)

		tmp[0] = tmp[1] << 0

	}

	// b, _ := ioutil.ReadFile("/Users/henrique_buzin/go/src/Go/100.000.txt")
	// b, _ := ioutil.ReadFile("/Users/henrique_buzin/go/src/Go/100.000.txt")
	b, _ := ioutil.ReadFile("/Users/henrique_buzin/go/src/Go/100.000.txt")

	var numbers []int

	var lines = strings.Split(string(b), "\n")

	for i := 0; i < len(lines); i++ {

		number, _ := strconv.Atoi(lines[i])

		numbers = append(numbers, number)

	}

	var inicio = time.Now().UnixNano()

	Bubble(numbers)

	var fim = time.Now().UnixNano()

	fmt.Println(numbers)

	fmt.Println(fim - inicio)

}