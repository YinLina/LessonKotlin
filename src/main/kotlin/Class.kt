fun main(){
    // encapsulation is getter/setter information p=Person(....)
    val p=Person(1,"Lynda","Female")
    p.newData()
    p.position()
}
    // Constructor with Parameter
class Person(id:Int, name:String, sex:String){
    // Data member/Function member
    var id:Int=2
    var name:String="NirNa"
    var sex:String="Male"
    init{
        println("$id \t $name \t $sex")
    }
    fun newData(){
        println("$id \t $name \t $sex")
    }
    fun position(){
        println("I am a student at RUPP (ITE).")
    }
}