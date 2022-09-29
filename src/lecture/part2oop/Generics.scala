package lecture.part2oop

object Generics extends  App {
  class MyList[+A] {  //denotes generic type  GENERIC CLASS
    //Use the type A
    def add[B >: A](element: B):MyList[B] = ???  // HARD QUESTION from  #1

      /*
      A = Cat
      b = Dog = Animal
       */
  }
  class myMap[Key,value]
  val listOfIntegers = new MyList[Int]
  val listofStrings = new MyList[String]

  //generic methods
  object MyList {
    def empty[A] : MyList[A] = ???


  }

  val emptyListofIntegers = MyList.empty[Int]

  // variance problem

  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // 1. yes List[Cat] extends List[Animal] = COVARIANCE
  class CovarianceList[+A]
  val animal: Animal = new Cat
  val animalList: CovarianceList[Animal] = new CovarianceList[Cat]
  // animalList.add(new Dog) ??? HARD QUESTION. => we return a list of animals

  // 2. NO = INVARIANCE
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal]  = new InvariantList[Animal]

  // 3. Hell, no! CONTRAVARIANCE

  class ContravariantList [-A]
  val contravariantList: ContravariantList[Cat] = new ContravariantList[Animal]

  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]

  //bounded types
  class Cage[A <: Animal](animal: A)
  val cage = new Cage(new Dog)

  //class Car
  //val newCage = new Cage(new Car)

// expand MyList to be generic

}
