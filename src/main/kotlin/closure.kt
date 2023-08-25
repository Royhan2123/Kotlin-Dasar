/**
 * INCREMENT ADALAH SEPERTI ++
 * YANG BISA DI AKSES DENGAN FUNCTION SCOPE ATAUPUN LAMBDA
 */
fun main() {
  var counter:Int = 0

  val lambdaIncrement = {
   for (i in counter..10){
     println("Lambda Increment")
     counter++
   }
  }
  val anonyymous = fun(){
      println("Anonymous")
      counter++
    }

    fun functionIncrement(){
      println("Function increment")
      counter++
    }
    lambdaIncrement()
    anonyymous()
  functionIncrement()
}