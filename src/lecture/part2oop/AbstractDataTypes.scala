package lecture.part2oop

object AbstractDataTypes extends App {
  // abstact
  abstract class Animal {
    val creatureType = "wild"
    def eat: Unit
  }

  class Dog extends Animal{
    override val creatureType: String = "canine"
    override def eat: Unit = println("Crunch, crunch")
  }

  //traits

  trait Carnivore {
    def eat(animal: Animal): Unit
    val preferredMeal: String = "fresh meat"  //non-abstract member
  }

  trait ColdBlodded

  class Crocodile extends Animal with Carnivore with ColdBlodded {
    //override val creatureType: String = "croc"
    def eat : Unit= println("nomnomnom")
    def eat(animal: Animal): Unit = println(s"I'm a ${animal.creatureType} and I'm eating ${animal.creatureType}")

  }
  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)
  println(croc.preferredMeal)

  // Abstract vs Traits
  // 1 - traits do not have constructors parameters
  // 2 - muiltiple traits may be inherited by the same class
  // 3 - traits = behavior


}
