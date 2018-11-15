package main

import (
	"fmt"
	"github.com/pkg/profile"
	"os"
	"time"
)

func Ack(m, n uint)uint {
	if m == 0 {
		return n + 1
	} else if n == 0 {
		return Ack(m - 1, 1)
	} else {
		return Ack(m - 1, Ack(m, n - 1))
	}
}

func main() {

	dir, _ := os.Getwd()

	defer profile.Start(profile.MemProfile, profile.MemProfileRate(100), profile.ProfilePath(dir)).Stop()

	for i := 0; i < 10000; i++ {

		tmp := make([]byte, 100000)

		tmp[0] = tmp[1] << 0

	}

	var inicio = time.Now().UnixNano()

	// var resultado = Ack(1, 1)
	// var resultado = Ack(1, 2)
	// var resultado = Ack(2, 1)
	// var resultado = Ack(2, 2)
	// var resultado = Ack(3, 1)
	var resultado = Ack(3,2)

	var fim = time.Now().UnixNano()

	fmt.Println(resultado)

	fmt.Println(fim - inicio)

}