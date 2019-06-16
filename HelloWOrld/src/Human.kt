open class Human(val name:String){
    open fun attack(){
        println("$name uses Fisrt Attack")
    }
}

class Mage(name: String, val mana:Boolean=false) : Human(name){
    override fun attack() {
        println("$name uses Fireball!!!")
    }
}