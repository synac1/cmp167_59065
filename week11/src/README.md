#Inheritance
* When a child class inherits all the attributes and behaviours of the parent class
* Parent class aka Base class or Super class
* child class aka subclass
- A class can only extend from one parent class

## Syntax:
To inherit from another class  you have to use the keyword **extends**
```
public class nameOfChildClass extends nameOfParentClass{

}

```
## Constructor
```
public nameOfChildClass(){
	super();
}

```
## toString method call from super
```
super.toString();
```
## UML 
- 2 classes Mammal and Bear, Mammal being a super class, and Bear being a subclass
- Mammals: legNums, hasFur, age, toSpeak(), toGrow()
- Bear: species, override toSpeak

## Exercise for week 11
- Create a parent class and child class with attributes and behaviors

