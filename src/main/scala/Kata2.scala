object Kata2 {
  def createPhoneNumber(numbers: Seq[Int]): String = {
    //other sols:
      // "(%d%d%d) %d%d%d-%d%d%d%d".format(numbers:_*)
      //"(" + numbers.slice(0,3).mkString+ ") "+ numbers.slice(3,6).mkString+ "-" + numbers.slice(6,10).mkString
    var phone: String =  "("
    for(i <- 0 to 9){
      phone += numbers(i)
      i match {
        case 2 => phone += ") "
        case 5 => phone += "-"
        case _ => phone += ""
      }
    }

    return phone
  }

  def main (args: Array[String]): Unit ={
    var a = Kata2.createPhoneNumber(Seq(1, 2, 3, 4, 5, 6, 7, 8, 9, 0))//should return (123) 456-7890
    println(a)
    //var b = Kata2.createPhoneNumber()
   // println(b)
  }
}
