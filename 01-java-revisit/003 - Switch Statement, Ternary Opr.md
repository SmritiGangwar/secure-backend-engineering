### Ternary Operator :

We can store the result of if-else block using this, or can use it without storing as well.

`int result = <Condition> ? <Return True Statement> : <Return False Statement> ; `

## Switch-Statement

```
int num = 1;
switch (num <value that matches with case>)         //After Java5 we can use string values as case matches as well.
    {   case 2 : 
                <Statement Block>;
                break;
        case 1 : 
                <Statement Block>;
                break;
        ---
        default :
                <Statement Block>;
    }
```

New way to write switch statement without using 'break':
```
String day = "Tuesday";
switch (day)
    {   case "Saturday", "Sunday" -> <Statement block or line i am not sure?>;
        case "Monday" -> <Statement>; 
    }
```

we can use return inside case blocks as well.
