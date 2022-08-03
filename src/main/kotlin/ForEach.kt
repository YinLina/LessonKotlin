fun main(){
    val list = listOf<Int>(1,3,6,8)
    list.forEach{
        println(it)
    }
    for(i in list){
        print("\t${i}")
    }
}