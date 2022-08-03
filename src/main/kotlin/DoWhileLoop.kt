fun main(){
    println("Show number 1 to 10: ")
    for(i in 1..10){
        println(i)
    }

    println("Show number 10 to 1: ")
    for(i in 10 downTo 1){
        println(i)
    }

    println("Show number 1 to 20 and step 2: ")
    for(i in 1..20 step 2){
        println(i)
    }

    println("Show value of a: ")
    var a=10
    while(a>0){
        println(a)
        a--
    }

    do {
        println("\nValue a: ${a}")
        //println(a)
        a--
    }while(a>0)
}