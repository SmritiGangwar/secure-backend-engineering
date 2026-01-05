#need to update day2 with map as well. day1 me bhi need to add some java datatype basics.

### #String 
by default IMMUTABLE
for Mutable use we can use : **_StringBuffer_**

- StringBuffer : Threat Safe
- StringBuilder : Not Threat Safe

String Declaration : `String name = "Hello";`
Initially, declaration used to be : _String name = new String("Hello");_

**_String Methods :_** 
- .isEmpty()               // true if length == 0
- .isBlank()               // true if empty or only whitespace (Java 11+)
- .indexOf()
- .lastIndexOf(String s)
- .charAt()
- .concat(str2)            //Returns "str+str2"
- .valueOf(int i)
- .valueOf(char[] data)
- .contains(<Char sequence>)
- .equals(str2)
- .split(String regex)     //Returns splitted String array
- .join(CharSequence delimiter, CharSequence elements)
- .trim()                     //Removes all whitespaces, for ASCII code only
- .strip()                    //works for Unicode as well
- .compareTo()
- .compareToIgnoreCase()
- .toUpperCase()
- .toLowerCase() 
- .substring(int begin)
- .substring(int begin, int end)
- .startsWith(String prefix)
- .endsWith(String suffix)
- .replace(char old, char new)
- .replaceAll(String regex, String replacement)
- .matches(String regex)              //Returns boolean value
- .stripLeading()                     // removes spaces from start
- .stripTrailing()                      // removes spaces from end

int x = 10;
- String s = **String.valueOf(x)**;     //Converting to int
- String s = **Integer.toString(x)**;


### #String Buffer

`StringBuffer sb = new StringBuffer()`
Stores space for 16 extra characters known as Buffer.

- .apend()
- .deleteCharAt()
- .insedrt(index,String)

StringBuffer to String : `String str = sb.toString()` 