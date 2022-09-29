package lecture.part2oop

object InheritanceAndTraits extends App {
  // single class inheritance (one class at a time)

   sealed class Animal {
    val creatureType = "wild"
    def eat = println(" nomnom")

  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch ")
    }
  }

  val cat = new Cat
  cat.crunch

  //constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }

  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  //overriding

  class Dog(override val creatureType: String) extends Animal {

  override def eat = {
    super.eat
    println("crunch, crunch")

  }

  }
  val dog = new Dog("k9")
  dog.eat
  println(dog.creatureType)

  //type subtitution (broad: polymorphorism)

  val unkownAnimal: Animal = new Dog("shepard")
  unkownAnimal.eat

    //overRIDING vs overLOADING


  //super

  //preventing overrides
  // 1 - use final on member
  // 2 - use final on the entire class
  // 3 - seal the class = extend classes in THIS FILE, prevent extenstion in other files

}


