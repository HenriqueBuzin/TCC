object Ackermann {

  def Ack(m:BigInt, n:BigInt): BigInt ={

    if (m == 0) n + 1

    else if (n == 0) Ack(m - 1, 1)

    else Ack(m - 1, Ack(m, n - 1))

  }

  def main(args: Array[String]):Unit = {

    val inicio = System.nanoTime()

    // val resultado = Ack(1, 1)
    // val resultado = Ack(1, 2)
     val resultado = Ack(2, 1)
    // val resultado = Ack(2, 2)
    // val resultado = Ack(3, 1)
    // val resultado = Ack(3, 2)
    // val resultado = Ack(3, 2)

    val fim = System.nanoTime()

    println(resultado)

    println(fim - inicio)

    println(Runtime.getRuntime.totalMemory - Runtime.getRuntime.freeMemory)

  }

}