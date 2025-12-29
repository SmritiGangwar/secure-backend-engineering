**Day 1** - 

#### #ARRAY OBJECT

Array Declaration : `int arr[] = new int[size];
                    arr[0] = 4;`

To use a Class as an Array :

 Class Student{                      
    int rollno;                        
    String name;                       
}    
public static void main(String args[]){
    Student s1 = new Student();
    #Class object is created
    s1.rollno = 67;
    s1.name = 'Jay';
                                        
    #Similarly more class objects can be created. 
}   

#Array Object Declaratio : ` Student students[] = new Student[size];`
 then store object ref. as: `students[0] = s1;
                            students[1] = s2;`
#To print the data :    `system.out.println(students[i].name + students[i].rollno);`


### #ARRAYLIST 

Iterables -> Collections -> List : ArrayList, LinkedList
                         -> Queue : Dequeue
                         -> Set : HashSet, HashTree, Linked HashSet


ArrayList Declaration : `List<Integer> nums = new ArrayList<Integer>();`

Collections nums new ArrayList();
nums.add(3);    #currenlty these are objects
nums.add(5); 

for(Object n: nums){
    int num = (int) n;  #typecasting
    s.out(num*2);
}

Collection creates Objects and does not support index value, that is why they need to be typecasted into desired types.
Therefore, we use LIST<> as it supports indexing and does not require typecasting, instead we can mention Wrapper class during declaration.

`List<Integer> nums = new ArrayList<Integer>();`

`for(int n = nums){
    s.out(n);
}`

OR
`
nums.get(indexValue);
nums.indexOf(element);`



### #SET
Does not support Index Values
Returns Unique Values only.

`Set<Integer> nums = new HashSet<Integer>();`

To get sorted Values we can use TreeSet:
`Set<Integer> nums = new TreeSet<Integer>();`


```for(int n: nums){
    s.out(n)
}
```

OR we can use Iterator:

```
Iterator<Integer> values = nums.iterator();
While(values.hasNext()){
    s.out(values.next());
}
```


