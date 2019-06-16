fun main() {

    var joe = Human("Joe")
    joe.attack()

    var andy = Mage("Andy", true)
    andy.attack()

    if (andy.mana) println("${andy.name} is a wizard")
}
