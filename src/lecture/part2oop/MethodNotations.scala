package lecture.part2oop

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String,val age:Int = 0) {
    def likes(movie:String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(nickname: String): Person = new Person(s"$name ($nickname)", favoriteMovie)
    def unary_! : String = s"$name, what the heck"
    def unary_+ :Person = new Person(name, favoriteMovie, age+1)

    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name, and I like $favoriteMovie"
    def apply(n: Int): String = s"$name watched $favoriteMovie $n times"
    def learns(thing: String) = s"$name is learning $thing"
    def learnsScala = this learns "Scala"


  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception")       // equivalent
  // infix notation = operator notation(syntactic sugar)



  //"operators" in scala
  val tom = new Person("Tomm", "Fight Cub")
  println(mary.+(tom))

  // ALL OPERATORS ARE METHODS
  // Akka actors have ! ?

  // prefix notation
  val x = -1
  val y = 1.unary_-
  // unary_ prefix only works with - + ! (tilda)

  println(!mary)
  println(mary.unary_!)

  //postfix notation
  println(mary.isAlive)
  //println(mary isAlive)

  // apply
  println(mary.apply())
  println(mary()) //eqivalent

  println((mary+ "the Rockstar")())
  //or
  println((mary + "the rockstar").apply())



  println((+mary).age)

  println(mary.learnsScala)

  println(mary(10))



  /*
    1. overload the + operator
    mary + "the rockstar" => new person "Mary (the rockstar)"

    2. Add an age to the Person class deafult value of 0
       Add a unary + operator +> new person with  the age +1
       +mary=> mary with the age incrementer
    3.
      Add a "learns method in the Person class => "Mary learns scala"
      Add a learnScala method, calls  learns method with "scala".
      Use it in a post fix notation.

    4. Overload the apply method
      mary.apply(2) => mary watched Inceptation 2times"
   */
}
