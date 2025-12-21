**Day 1** - 

#ARRAY OBJECT

Array Declaration : `int arr[] = new int[size];
                    arr[0] = 4;`

To use a Class as an Array :
Class Student{                      public static void main(String args[]){
    int rollno;                         Student s1 = new Student();
    String name;                        #Class object is created
}                                       s1.rollno = 67;
                                        s1.name = 'Jay';
                                        #Similarly more class objects can be created.
                                    }

#Array Object Declaratio :  Student students[] = new Student[size];
 then store object ref. as: students[0] = s1;
                            students[1] = s2;

#To print the data :    system.out.println(students[i].name + students[i].rollno);






