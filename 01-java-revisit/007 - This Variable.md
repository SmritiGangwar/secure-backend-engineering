## 'THIS' Variable
It represents the Current Object, the obj that is calling the method.

If we're using same variable name, there will be confusion in b/w which one is Instance and which one is Local variable. It will not allow to change or assign the value.

So, we'll have to pass the Object Reference in the method def:

```java
public void setAge(int age, Human obj){
    Human obj1 = obj;
    obj1.age = age;
}

void main(String[] args) {
    Human obj = new Human();
    obj.setAge(20,obj);
}
```
OR
```java
public void setAge(int age, Human obj){
    obj.age = age;
}
```
OR
```java
public void setAge(int age){
    this.age = age;
}
void main(String[] args) {
    Human obj = new Human();
    obj.setAge(20);     //As we are using 'this' variable.
}
```

```java
public void setAge(int a){          //a: always a LOCAL variable
    age = a;                        //age: INSTANCE variable
}
```
