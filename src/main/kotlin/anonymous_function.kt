fun main() {
    val inianonymous = fun(name:String):String{
        if  (name.isBlank()){
            return  "Ups"
        }
        return  name.toUpperCase()
    }
    fun iniLambda(name:String,value:(String)-> (String)):String{
        val namae = value(name)
        return "nama mu adalah $namae"
    }

    println(iniLambda("Royhan"){value:String -> value.toUpperCase()})
    println(inianonymous)

}