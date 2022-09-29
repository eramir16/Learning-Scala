package lecture.part2oop

object Objects  {
  // SCALA DOES NOT HAVE THE CLASS-LEVEL FUNCTIONALITY ("static")

  object Person { //type +its only instance
    // "Static"/"class" - level functionality
    val N_EYES = 2
    def canFly: Boolean = false

    //factory method
    def apply(mother:Person, father:Person): Person = new Person("bobby")
  }

  class Person(val name: String){
    // instance-level funtionality

  }

  //COMPANIONS

  def main(args: Array[String]): Unit = {

    println(Person.N_EYES)
    println(Person.canFly)

    //Scala object = SINGLETON INSTANCE

    val mary = new Person("Mary")
    val john = new Person("John")

    val bobby = Person(mary, john)


  }

  // Scala Applications = Scala object with
  // def main(args: Array[String]): Unit




}

