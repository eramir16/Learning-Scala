package lecture.par1basics

object Expressions extends App {
  val x = 1 + 2 // EXPRESSION
  println(x)

  println(2 + 3 * 4)
  // + - * / & || ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=
  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= .............. side effects
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE)

  // IF Expression
  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3 //IF EXPRESSION
  print(aConditionValue)

//  var i = 0
//  while (i < 10 ){
//    println(i)
//    i += 1
//  }

  // NEVER WRITE THIS AGAIN.......

  // EVERYTHING IN SCALA IS AN EXPRESSION!
  val aWeirdValue = (aVariable = 3) //Unit === void
  println(aWeirdValue)

    // side effects: println(), whiles, reassigning

    //code blocks

    val aCodeBlock = {
      val y = 2
      val z = y + 1

      if (z > 2) "hello" else "goodbye"
    }
    //1. Difference between "Hello World" vs print ("hello world")?

    //2
    val someValue ={
      2 < 3
    }

    val someOtherValue = {
      if(someValue) 239 else 996
      42
    }

}

