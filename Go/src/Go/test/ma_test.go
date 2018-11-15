package main

import (
	"testing"
)

func ack(m, n uint) uint {
	if m == 0 {
		return n + 1
	} else if n == 0 {
		return ack(m-1, 1)
	} else {
		return ack(m-1, ack(m, n-1))
	}
}

func BenchmarkAck(b *testing.B) {
	b.ReportAllocs()
	for n := 0; n < b.N; n++ {
		ack(4, 1)
	}
}