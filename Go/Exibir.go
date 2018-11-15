package main

import (
	"fmt"
	"github.com/pkg/profile"
	"os"
	"time"
)

func main() {

	dir, _ := os.Getwd()

	defer profile.Start(profile.MemProfile, profile.MemProfileRate(100), profile.ProfilePath(dir)).Stop()

	for i := 0; i < 10000; i++ {

		tmp := make([]byte, 100000)

		tmp[0] = tmp[1] << 0

	}

	var inicio = time.Now().UnixNano()

	var text = "Olá Mundo!"

	fmt.Println(text)

	var fim = time.Now().UnixNano()

	fmt.Println(fim - inicio)

}