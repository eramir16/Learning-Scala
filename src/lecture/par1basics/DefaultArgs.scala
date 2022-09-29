package lecture.par1basics

import scala.annotation.tailrec

object DefaultArgs extends App {
  @tailrec
  def trFact(n: Int, acc: Int = 1): Int =  // 1 is default value can be over written by trFact(10, 2)
    if (n <= 1) acc
    else trFact(n - 1, n * acc)

    val fact10 = trFact(10)


    def savePicture(format: String = "jpg", width: Int = 1920 , height: Int = 1080 )= println("Saving Picture")

    //savePicture(width = 800)

  /*
  1. pass in every leading argument
  2. name the arguments
   */
}
