**Day 1** - 

#ARRAY OBJECT

Array Declaration : `int arr[] = new int[size];
                    arr[0] = 4;`

To use a Class as an Array :
`Class Student{                      
    int rollno;                        
    String name;                       
}    
public static void main(String args[]){
    Student s1 = new Student();
    #Class object is created
    s1.rollno = 67;
    s1.name = 'Jay';
                                        
    #Similarly more class objects can be created. 
}`

#Array Object Declaratio : ` Student students[] = new Student[size];`
 then store object ref. as: `students[0] = s1;
                            students[1] = s2;
`
#To print the data :    `system.out.println(students[i].name + students[i].rollno);`


#ARRAYLIST 

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

Collection creates







