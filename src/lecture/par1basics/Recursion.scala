package lecture.par1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int =

    if (n <= 0) 1
    else {
      println("computing factorial of " + n + " - I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)

      result
    }

    println(factorial(10))
    def anotherFactorial(n: Int): BigInt ={
      @tailrec
      def factHelper(x: Int, accumulator: BigInt): BigInt =
        if (x <= 1) accumulator
        else factHelper(x-1,x * accumulator)              //TAIL RECURSION = use recursive call as the LAST expression

      factHelper(n,1)
    }

  println(anotherFactorial(4))


  // WHEN YOU NEED LOOPS, USE TAIL RECURSION


  /*
  1.Concat a string n times
  2. IsPrime function tail recursive
  3. Fibonacci function, tail recursive
   */

  def concatenateTailrec(aString: String, n: Int, acummulator: String): String ={
    if (n <= 0 ) acummulator
    else concatenateTailrec(aString, n-1, aString + acummulator)

  }

  def prime(n: Int): Boolean = {
    def isPrimeUntilTrailRec(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeUntilTrailRec(t - 1, n % t != 0 && isStillPrime)
      isPrimeUntilTrailRec(n / 2, true)


  }
  println(prime(11))


  def fibonacci (n: Int): Int = {
    def fiboTailRec(i: Int, last: Int, nextToLast: Int): Int =
      if (i >= n) last
      else fiboTailRec(i + 1,last + nextToLast, last)

    if (n <= 2) 1
    else fiboTailRec(2, 1 ,1)
  }

  println(fibonacci(8))
}

