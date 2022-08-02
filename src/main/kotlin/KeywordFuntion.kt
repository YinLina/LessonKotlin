fun main(){
    val list = listOf<Int>(1,2,5,6,3,8,7,4)
    println("Size of list : ${list.size}")
    println("Minimum number of list : ${list.minOrNull()}")
    println("Minimum number of list : ${list.maxOrNull()}")
    println("Select with distinct : ${list.distinct()}")
    println("Sort list by ascending : ${list.sorted()}")
    println("Sort list by ascending : ${list.sortedDescending()}")

    val l = list.sortedDescending()
    for(i in l){
        println(i)
    }
    println("${list.indices}")
    val index = list.indices
    for(i in index){
        println(i)
    }

    println("Last Number :${list.last()}")
    println("First Number :${list.first()}")
    println("First position of Number : ${list[3]}")
}