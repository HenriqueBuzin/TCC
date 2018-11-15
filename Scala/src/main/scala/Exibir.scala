object Exibir {

  def main(args: Array[String]) {

    val inicio = System.nanoTime()

    val text = "Olá Mundo!"

    println(text)

    val fim = System.nanoTime()

    println(fim - inicio)

    println(Runtime.getRuntime.totalMemory - Runtime.getRuntime.freeMemory)

  }

}