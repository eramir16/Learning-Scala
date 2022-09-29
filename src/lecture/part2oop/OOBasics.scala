package lecture.part2oop

import sun.text.normalizer.ICUBinary.Authenticate

import java.io.Writer

object OOBasics extends App {
  val person = new Person("John", 26)
  println(person.x)
  person.greet("Daniel")


  val author = new Writer("Charles", "Dickens", 1812)
  val novelTest = new novel("Great Expectations", 1861, author)

  println(novelTest.authorAge)
  println(novelTest.isWrittenby(author))


  val counter = new Counter
  counter.inc(10).dec(20).print
}


class Person(name: String, val age: Int) { //Constructor
  val x = 2
  println(1 + 3)

  //method
  def greet(name: String): Unit = println(s"${this.name} says hi, $name")


  //overloading
  def greet(): Unit = println(s"Hi, I am ${this.name}")

  //multiple constructors

  def this(name: String) = this(name, 0)

  def this() = this("John Doe")

}
  /*
  Novel and Writer

  Writer: Firstname, surname, year of birth
    _method fullname

  Novel : name, year of release, author (instance of writer)
    -authorAge
    -isWrittenBy (author)
    -copy (new year of release) = new instance of novel with a new year of release
*/
  class Writer(firstName: String, surname: String, val year: Int){

    def fullname: String = firstName + " " + surname
  }

  class novel(name: String, year: Int, author: Writer){
    def authorAge = year - author.year
    def isWrittenby(author: Writer) = author == this.author
    def copy (newYear: Int): novel = new novel(name, newYear, author)


  }

/*
    #====================================
      Counter class
      -recieves an int value
      -method current count
      -method to increment/decrement => new Counter
      -overload inc/dec to receive an amount

   */

  class Counter(val count: Int = 0){
    def inc ={
      println("incrementing")
      new Counter(count + 1)  //immutability
    }

    def dec = {
      println("decrementing")
      new Counter(count - 1) //immutability
    }

    def inc(n: Int): Counter = {
      if (n <=0) this
      else inc.inc(n-1)
    }
    def dec(n: Int): Counter =
      if (n <= 0) this
      else dec.dec(n - 1)

    def print = println(count)

  }









//class parameters are NOT FIELDS


