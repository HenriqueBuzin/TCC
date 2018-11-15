import scala.io.Source

object Bubble {

  def Bubble(numbers: Array[Int]): Array[Int] = {

    var temp = 0

    for (i <- 0 until numbers.length) {

      for (j <- 0 until numbers.length - 1) {

        if(numbers(j) > numbers(j + 1)){

          temp = numbers(j)

          numbers(j) = numbers(j + 1)

          numbers(j + 1) = temp

        }

      }

    }

    numbers

  }

  def main(args: Array[String]){

    val numbers = new Array[Int](1000)

    // for ((number, i) <- Source.fromFile("/Users/henrique_buzin/IdeaProjects/Scala/src/main/scala/100.000.txt").getLines.zipWithIndex) {
    // for ((number, i) <- Source.fromFile("/Users/henrique_buzin/IdeaProjects/Scala/src/main/scala/10.000.txt").getLines.zipWithIndex) {
    for ((number, i) <- Source.fromFile("/Users/henrique_buzin/IdeaProjects/Scala/src/main/scala/1.000.txt").getLines.zipWithIndex) {

      numbers(i) = number.toInt

    }

    val inicio = System.nanoTime()

    Bubble(numbers)

    val fim = System.nanoTime()

    println(numbers.deep)

    println(fim - inicio)

    println(Runtime.getRuntime.totalMemory - Runtime.getRuntime.freeMemory)

  }

}