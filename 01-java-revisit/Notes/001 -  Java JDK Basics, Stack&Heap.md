#### #JAVA BASICS


Java File -->  Compiler --> ByteCode --> Interpret -->  Machine Code <br>
(.java)---------[javac]----(.class)-------[JVM]---------(in binary format)

[JDK -Tools & Libraries [JRE-Runtime env. [JVM]]]


**Object -** Properties and Behavior.
**Class -** A Component 
&emsp    - Variables + Methods
&emsp    - like a Calculator, a computer, etc.
**Method -** Describes the behavior of the component

#### #Stack & Heap Memory

Stack : Stores local variables
        Stores Method call info
        Object References

Heap : Stores Dynamic allocated data
       Objects created using 'new' keyword
       Stores actual objects
       String pool

### #Method OverLoading 
Same name of the method but - different number of params.
&emsp                    OR - different datatype mentioned in method call.

```
public int add(int n1, int n2){
    return n1+n2;
   }
   
public int add(int n1, int n2, int n3){
    return n1+n2;
   }
```
OR
```
   
public double add(double n1, double n2){
    return n1+n2;
   }
```
But cannot use the same method with different return type and different method call dataType:
```
public double add(int n1, int n2){}
```
