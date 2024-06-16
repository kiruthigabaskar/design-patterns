package factoryMethod

class UsageOfFactoryClass {
    fun main(){
        val factoryClass = FactoryClass() //create instance of FactoryClass

        val shape1 = factoryClass.getShape("Circle")
        shape1?.draw()

        val shape2 = factoryClass.getShape("Square")
        shape2?.draw()



    }
}