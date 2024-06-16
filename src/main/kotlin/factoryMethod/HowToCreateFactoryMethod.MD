Provides an interface for creating objects in superclass but subclasses are responsible to create the instance of the class

Steps:
1.  Create an interface
2.  create 2 or more concrete classed implements the interface
3.  create a factory class to create object of concrete class based on given input
4. Finally, call the factory class by passing input as a parameter to call the specific concrete class.