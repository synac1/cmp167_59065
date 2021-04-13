##UML for Employee

```
________________
|	Employee
-----------------
| -name:  String 
| -empID: int 
| -salary: double
| -role: String 
------------------
|  +Contructors
|  +seters & getters
|  +equals
|  +toString
|------------------

```

## equals method returns true if the value of the instance variables are the same

# syntax

```
@override
public boolean equals(Object obj){
	if (this == obj){
		returns true;
	}
	if(obj instanceof NameOfClass ){
		NameOfClass other = (NameOfClass) obj;
		if( this.attr1 == other.attr1 && this.attr2 == other.attr)
			return true ;
	}
	return false;

}
```
# Exercise for week 10 
Create a Human class
with constructors, setters and getters
the equals method, and a custom method of your own