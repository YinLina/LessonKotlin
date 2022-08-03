fun main(){
    var list = listOf<Int>(1,2,5,3,7,6,11,9,4,8)

    println(list.filter{num->num<10})
    println(list.map{num->num*10})
    println(list.all{it<5})
    println(list.any{it>10})
    println(list.count{it<10})
}