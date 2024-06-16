package factoryMethod

class FactoryClass {
    fun getShape(shapeType: String):Shape?{
        return when(shapeType.uppercase()){
            "CIRCLE" -> Circle()
            "SQUARE" -> Square()
            else -> null
        }
    }
}