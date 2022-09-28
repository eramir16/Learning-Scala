package lecture.par1basics

object CBNvsCBV extends  App {
  def calledByValue( x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  // value is computed before call
  //sane value used everywhere



  def calledByName(x: => Long): Unit ={
    println("by name: " + x)
    println("by name: " + x)
  }

  //expression is passed literally
  //expression is evalutated at every use within

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())


  def infinite(): Int = 1 + infinite()
  //def printFirst(x: Int, y: => Int) = println(x)


  //printFirst(34, infinite())


  def myFunction(x: => Int): Int = 1 + x

  val y = myFunction(2)

  print(y)
}
