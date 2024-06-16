package singletonObject

//creating one time object for the class by using the object keyword

object Logger {
    private var loggerPath : String = "default.log"


    fun log(message : String){
        println("Message received from $loggerPath file : $message")
    }

    fun setLogPath(path: String){
        loggerPath = path
    }
}