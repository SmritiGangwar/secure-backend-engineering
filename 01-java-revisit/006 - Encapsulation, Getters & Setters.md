## Encapsulation
Encapsulation/Wrapping data and methods/code-blocks into a single unit. 
```java
class Human
{
    private int age;                    //Cannot be accessed outside this class
    private String name;    
    
    public int getAge(){                //we'll use methods to access private variables from outside this class
        return age;
    }
    public String getName(){
        return name;
    }
}

public class Main{
    static void main(String[] args) {
        Human obj = new Human();
        System.out.println(obj.getName() + obj.getAge());
    }
} 
```

Now if we also want to change or assign new values to private variables, we will use more methods. 
Here comes the whole concept of **Getters and Setters**.

```java
class Human {
    private int age;
    private String name;

    public int getAge() {                   //Getting var
        return age;
    }

    public void setAge(int a) {             //Setting value
        age = a;
    }

    public String getName() {                //Getting var
        return name;
    }

    public void setName(String n) {          //Setting value     
        name = n;
    }
}

public class Main {
    static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(10);
        obj.setName(Hello);
        System.out.println(obj.getName() + obj.getAge());
    }
} 
```