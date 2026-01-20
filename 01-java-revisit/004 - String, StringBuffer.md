
## String 
by default IMMUTABLE <br>
for Mutable use we can use : **_StringBuffer_**

- StringBuffer : Threat Safe
- StringBuilder : Not Threat Safe

String Declaration : `String name = "Hello";`
Initially, declaration used to be : _String name = new String("Hello");_

**_String Methods :_** 
- [ ] .isEmpty()               &nbsp;&nbsp;&nbsp;// true if length == 0
- [ ] .isBlank()               &nbsp;&nbsp;&nbsp;// true if empty or only whitespace (Java 11+)
- [ ] .indexOf()
- [ ] .lastIndexOf(String s)
- [ ] .charAt()
- [ ] .concat(str2)            &nbsp;&nbsp;&nbsp;//Returns "str+str2"
- [ ] .valueOf(int i)
- [ ] .valueOf(char[] data)
- [ ] .contains(<Char sequence>)
- [ ] .equals(str2)
- [ ] .split(String regex)     &nbsp;&nbsp;&nbsp;//Returns splitted String array
- [ ] .join(CharSequence delimiter, CharSequence elements)
- [ ] .trim()                     &nbsp;&nbsp;&nbsp;//Removes all whitespaces, for ASCII code only
- [ ] .strip()                    &nbsp;&nbsp;&nbsp;//works for Unicode as well
- [ ] .compareTo()
- [ ] .compareToIgnoreCase()
- [ ] .toUpperCase()
- [ ] .toLowerCase() 
- [ ] .substring(int begin)
- [ ] .substring(int begin, int end)
- [ ] .startsWith(String prefix)
- [ ] .endsWith(String suffix)
- [ ] .replace(char old, char new)
- [ ] .replaceAll(String regex, String replacement)
- [ ] .matches(String regex)              &nbsp;&nbsp;&nbsp;//Returns boolean value
- [ ] .stripLeading()                     &nbsp;&nbsp;&nbsp;// removes spaces from start
- [ ] .stripTrailing()                    &nbsp;&nbsp;&nbsp;// removes spaces from end

int x = 10;
- [ ] String s = **String.valueOf(x)**;     //Converting int to String
- [ ] String s = **Integer.toString(x)**;


## String Buffer

`StringBuffer sb = new StringBuffer()`
Stores space for 16 extra characters known as Buffer.

- [ ] .apend()
- [ ] .deleteCharAt()
- [ ] .insedrt(index,String)

StringBuffer to String : `String str = sb.toString()` 




