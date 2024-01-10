# Getting Started JavaDSA
Welcome to my Java and Data Structures and Algorithms (DSA) Learning Journey repository! I'm thrilled to share my progress and daily learning experiences with you through this repository. 🍵

--------

### Hello.java
```java
public class Hello {
    // main method
    public static void main(String[] args)
    {
        // Output: Hello, world!
        System.out.println("Hello, world!");
    }
}
```
Compiling and running
```shell script
$ javac Hello.java
$ java Hello
Hello, world!
```



### Variables
```java
int num = 5;
float floatNum = 5.99f;
char letter = 'D';
boolean bool = true;
String site = "cheatsheets.zip";
```

### Primitive Data Types
| Data Type | Size   | Default | Range               |
|-----------|--------|---------|---------------------|
| `byte`    | 1 byte | 0       | -128 to 127         |
| `short`   | 2 byte | 0       | -2^15 to 2^15-1     |
| `int`     | 4 byte | 0       | -2^31 to 2^31-1     |
| `long`    | 8 byte | 0       | -2^63 to 2^63-1     |
| `float`   | 4 byte | 0.0f    | _N/A_               |
| `double`  | 8 byte | 0.0d    | _N/A_               |
| `char`    | 2 byte | \\u0000 | 0 to 65535          |
| `boolean` | _N/A_  | false   | true / false        |





### Strings
```java
String first = "John";
String last = "Doe";
String name = first + " " + last;
System.out.println(name);
```

### Loops
```java
String word = "KrSunny";
for (char c: word.toCharArray()) {
  System.out.print(c + "-");
}
// Outputs: K-r-S-u-n-n-y-
```

### Arrays
```java
char[] chars = new char[10];
chars[0] = 'a'
chars[1] = 'b'

String[] letters = {"A", "B", "C"};
int[] mylist = {100, 200};
boolean[] answers = {true, false};
```

### Swap
```java
int a = 1;
int b = 2;
System.out.println(a + " " + b); // 1 2

int temp = a;
a = b;
b = temp;
System.out.println(a + " " + b); // 2 1
```

### Type Casting
```java
// Widening
// byte<short<char<int<long<float<double
int i = 10;
long l = i;               // 10

// Narrowing 
double d = 10.02;
long l = (long)d;         // 10

String.valueOf(10);       // "10"
Integer.parseInt("10");   // 10
Double.parseDouble("10"); // 10.0
```

### Conditionals
```java
int j = 10;

if (j == 10) {
  System.out.println("I get printed");
} else if (j > 10) {
  System.out.println("I don't");
} else {
  System.out.println("I also don't");
}
```


### User Input
```java
Scanner in = new Scanner(System.in);
String str = in.nextLine();
System.out.println(str);

int num = in.nextInt();
System.out.println(num);
```

Java Strings
-------

### Basic

```java
String str1 = "value"; 
String str2 = new String("value");
String str3 = String.valueOf(123);
```


### Concatenation
```java
String s = 3 + "str" + 3;     // 3str3
String s = 3 + 3 + "str";     // 6str
String s = "3" + 3 + "str";   // 33str
String s = "3" + "3" + "23";  // 3323
String s = "" + 3 + 3 + "23"; // 3323
String s = 3 + 3 + 23;        // 29
```


### StringBuilder
StringBuilder sb = new StringBuilder(10);
```java
┌───┬───┬───┬───┬───┬───┬───┬───┬───┐
|   |   |   |   |   |   |   |   |   |
└───┴───┴───┴───┴───┴───┴───┴───┴───┘
0   1   2   3   4   5   6   7   8   9
```
sb.append("Kr Sunny");
```java
┌───┬───┬───┬───┬───┬───┬───┬───┬───┐
| K | r |   | S | u | n | n | y |   |
└───┴───┴───┴───┴───┴───┴───┴───┴───┘
0   1   2   3   4   5   6   7   8   9
```
sb.delete(5, 9);
```java
┌───┬───┬───┬───┬───┬───┬───┬───┬───┐
| S | u | n | n | y |   |   |   |   |
└───┴───┴───┴───┴───┴───┴───┴───┴───┘
0   1   2   3   4   5   6   7   8   9
```
sb.insert(0, "My ");
```java
┌───┬───┬───┬───┬───┬───┬───┬───┬───┐
| M | y |   | S | u | n | n | y |   |
└───┴───┴───┴───┴───┴───┴───┴───┴───┘
0   1   2   3   4   5   6   7   8   9
```
sb.append("!");
```java
┌───┬───┬───┬───┬───┬───┬───┬───┬───┐
| M | y |   | S | u | n | n | y | ! |
└───┴───┴───┴───┴───┴───┴───┴───┴───┘
0   1   2   3   4   5   6   7   8   9
```


### Comparison
```java
String s1 = new String("ImKSS"); 
String s2 = new String("ImKSS"); 

s1 == s2          // false
s1.equals(s2)     // true

"AB".equalsIgnoreCase("ab")  // true
```


### Manipulation
```java
String str = "Abcd";

str.toUpperCase();     // ABCD
str.toLowerCase();     // abcd
str.concat("#");       // Abcd#
str.replace("b", "-"); // A-cd

"  abc ".trim();       // abc
"ab".toCharArray();    // {'a', 'b'}
```


### Information
```java
String str = "abcd";

str.charAt(2);       // c
str.indexOf("a")     // 0
str.indexOf("z")     // -1
str.length();        // 4
str.toString();      // abcd
str.substring(2);    // cd
str.substring(2,3);  // c
str.contains("c");   // true
str.endsWith("d");   // true
str.startsWith("a"); // true
str.isEmpty();       // false

String str = "   Kr Sunny Suman    ";
str.strip();    //Kr Sunny Suman

```

### Character class
```java

char ch = 'A';
Character.isLowerCase(char ch)   // false
Character.isUperCase(char ch)   // true
Character.isWhitespace(char ch) // false   

        
```



### Immutable
```java
String str = "hello";
str.concat("world");

// Outputs: hello
System.out.println(str);
```

---

```java
String str = "hello";
String concat = str.concat("world");

// Outputs: helloworld
System.out.println(concat);
```

Once created cannot be modified, any modification creates a new String

Java Arrays
-------


### Declare
```java
int[] a1;
int[] a2 = {1, 2, 3};
int[] a3 = new int[]{1, 2, 3};

int[] a4 = new int[3];
a4[0] = 1;
a4[2] = 2;
a4[3] = 3;
```


### Modify
```java
int[] a = {1, 2, 3};
System.out.println(a[0]); // 1

a[0] = 9;
System.out.println(a[0]); // 9

System.out.println(a.length); // 3
```


### Loop (Read & Modify)
```java
int[] arr = {1, 2, 3};
for (int i=0; i < arr.length; i++) {
    arr[i] = arr[i] * 2;
    System.out.print(arr[i] + " ");
}
// Outputs: 2 4 6
```


### Loop (Read)
```java
String[] arr = {"a", "b", "c"};
for (int a: arr) {
    System.out.print(a + " ");
}
// Outputs: a b c 
```


### Multidimensional Arrays
```java
int[][] matrix = { {1, 2, 3}, {4, 5} };

int x = matrix[1][0];  // 4
// [[1, 2, 3], [4, 5]]
Arrays.deepToString(matrix)

for (int i = 0; i < a.length; ++i) {
  for(int j = 0; j < a[i].length; ++j) {
    System.out.println(a[i][j]);
  }
}
// Outputs: 1 2 3 4 5 6 7 
```


### Sort
```java
char[] chars = {'b', 'a', 'c'};
Arrays.sort(chars);

// [a, b, c]
Arrays.toString(chars);
```




Java Conditionals
-----------


### Operators
- <a href="javascript:void(0);" data-tooltip="Additive operator (also used for String concatenation)">+</a>
- <a href="javascript:void(0);" data-tooltip="Subtraction operator">-</a>
- <a href="javascript:void(0);" data-tooltip="Multiplication operator">*</a>
- <a href="javascript:void(0);" data-tooltip="Division operator">/</a>
- <a href="javascript:void(0);" data-tooltip="Remainder operator">%</a>
- <a href="javascript:void(0);" data-tooltip="Simple assignment operator">=</a>
- <a href="javascript:void(0);" data-tooltip="Increment operator; increments a value by 1">++</a>
- <a href="javascript:void(0);" data-tooltip="Decrement operator; decrements a value by 1">--</a>
- <a href="javascript:void(0);" data-tooltip="Logical complement operator; inverts the value of a boolean">!</a>


----

- <a href="javascript:void(0);" data-tooltip="Equal to">==</a>
- <a href="javascript:void(0);" data-tooltip="Not equal to">!=</a>
- <a href="javascript:void(0);" data-tooltip="Greater than">></a>
- <a href="javascript:void(0);" data-tooltip="Greater than or equal to">>=</a>
- <a href="javascript:void(0);" data-tooltip="Less than"><</a>
- <a href="javascript:void(0);" data-tooltip="Less than or equal to"><=</a>


----

- <a href="javascript:void(0);" data-tooltip="Conditional-AND">&&</a>
- <a href="javascript:void(0);" data-tooltip="Conditional-OR">||</a>
- <a href="javascript:void(0);" data-tooltip="Conditional-XOR">^</a>
- <a href="javascript:void(0);" data-tooltip="Ternary">?:</a>


----

- <a href="javascript:void(0);" data-tooltip="Compares an object to a specified type">instanceof</a>


----

- <a href="javascript:void(0);" data-tooltip="Unary bitwise complement">~</a>
- <a href="javascript:void(0);" data-tooltip="Signed left shift"><<</a>
- <a href="javascript:void(0);" data-tooltip="Signed right shift">>></a>
- <a href="javascript:void(0);" data-tooltip="Unsigned right shift">>>></a>
- <a href="javascript:void(0);" data-tooltip="Bitwise AND">&</a>
- <a href="javascript:void(0);" data-tooltip="Bitwise exclusive OR">^</a>
- <a href="javascript:void(0);" data-tooltip="Bitwise inclusive OR">|</a>



### If else
```java
int k = 15;
if (k > 20) {
  System.out.println(1);
} else if (k > 10) {
  System.out.println(2);
} else {
  System.out.println(3);
}
```

### Switch
```java
int month = 3;
String str;
switch (month) {
  case 1:
    str = "January";
    break;
  case 2:
    str = "February";
    break;
  case 3:
    str = "March";
    break;
  default:
    str = "Some other month";
    break;
}

// Outputs: Result March
System.out.println("Result " + str);
```


### Ternary operator
```java
int a = 10;
int b = 20;
int max = (a > b) ? a : b;

// Outputs: 20
System.out.println(max);
```


Java Loops
----

### For Loop
```java
for (int i = 0; i < 10; i++) {
  System.out.print(i);
}
// Outputs: 0123456789
```

------

```java
for (int i = 0,j = 0; i < 3; i++,j--) {
  System.out.print(j + "|" + i + " ");
}
// Outputs: 0|0 -1|1 -2|2
```

### Enhanced For Loop
```java
int[] numbers = {1,2,3,4,5};

for (int number: numbers) {
  System.out.print(number);
}
// Outputs: 12345
```
Used to loop around array's or List's


### While Loop
```java
int count = 0;

while (count < 5) {
  System.out.print(count);
  count++;
}
// Outputs: 01234
```

### Do While Loop
```java
int count = 0;

do {
  System.out.print(count);
  count++;
} while (count < 5);
// Outputs: 01234
```

### Continue Statement
```java
for (int i = 0; i < 5; i++) {
  if (i == 3) {
    continue;
  }
  System.out.print(i);
}
// Outputs: 01245
```

### Break Statement
```java
for (int i = 0; i < 5; i++) {
  System.out.print(i);
  if (i == 3) {
    break;
  }
}
// Outputs: 0123
```


Time and Space Complexity
--------------------

### Sorting Algorithms Time and Space Complexity

| Algorithm        |Time Complexity| Time Complexity |
|------------------|---------------|-----------------|
|  Selection Sort	 |    O(N^2)     |    O(1)         |
|  Insertion Sort	 |    O(N^2)	   |    O(1)         |
|  Bubble Sort	   |    O(N^2)     |    O(1)         |
|  Merge Sort	     |  O(N log N)   |    O(N)         |
|  Quick Sort	     |	O(N log N)   |    O(N)         |
|  Heap Sort	     |	O(N log N)   |    O(1)         |
|  Counting Sort	 |  O(N + K)	   |    O(K)         |
|  Radix Sort	     |  O(N * K)	   |    O(N + K)     |
|  Bucket Sort	   |    O(N^2)     |    O(N)       |




Java Collections Framework
--------------------

### Java Collections

| Collection                                                                                                         | Interface   | Ordered | Sorted | Thread safe | Duplicate | Nullable           |
|--------------------------------------------------------------------------------------------------------------------|-------------|---------|--------|-------------|-----------|--------------------|
| [ArrayList](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)                                    | List        | Y       | _N_    | _N_         | Y         | Y                  |
| [Vector](https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html)                                          | List        | Y       | _N_    | Y           | Y         | Y                  |
| [LinkedList](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html)                                  | List, Deque | Y       | _N_    | _N_         | Y         | Y                  |
| [CopyOnWriteArrayList](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CopyOnWriteArrayList.html)   | List        | Y       | _N_    | Y           | Y         | Y                  |
| [HashSet](https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html)                                        | Set         | _N_     | _N_    | _N_         | _N_       | One `null`         |
| [LinkedHashSet](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashSet.html)                            | Set         | Y       | _N_    | _N_         | _N_       | One `null`         |
| [TreeSet](https://docs.oracle.com/javase/8/docs/api/java/util/TreeSet.html)                                        | Set         | Y       | Y      | _N_         | _N_       | _N_                |
| [CopyOnWriteArraySet](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CopyOnWriteArraySet.html)     | Set         | Y       | _N_    | Y           | _N_       | One `null`         |
| [ConcurrentSkipListSet](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ConcurrentSkipListSet.html) | Set         | Y       | Y      | Y           | _N_       | _N_                |
| [HashMap](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html)                                        | Map         | _N_     | _N_    | _N_         | _N (key)_ | One `null` _(key)_ |
| [HashTable](https://docs.oracle.com/javase/8/docs/api/java/util/Hashtable.html)                                    | Map         | _N_     | _N_    | Y           | _N (key)_ | _N (key)_          |
| [LinkedHashMap](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashMap.html)                            | Map         | Y       | _N_    | _N_         | _N (key)_ | One `null` _(key)_ |
| [TreeMap](https://docs.oracle.com/javase/8/docs/api/java/util/TreeMap.html)                                        | Map         | Y       | Y      | _N_         | _N (key)_ | _N (key)_          |
| [ConcurrentHashMap](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ConcurrentHashMap.html)         | Map         | _N_     | _N_    | Y           | _N (key)_ | _N_                |
| [ConcurrentSkipListMap](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ConcurrentSkipListMap.html) | Map         | Y       | Y      | Y           | _N (key)_ | _N_                |
| [ArrayDeque](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayDeque.html)                                  | Deque       | Y       | _N_    | _N_         | Y         | _N_                |
| [PriorityQueue](https://docs.oracle.com/javase/8/docs/api/java/util/PriorityQueue.html)                            | Queue       | Y       | _N_    | _N_         | Y         | _N_                |
| [ConcurrentLinkedQueue](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ConcurrentLinkedQueue.html) | Queue       | Y       | _N_    | Y           | Y         | _N_                |
| [ConcurrentLinkedDeque](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ConcurrentLinkedDeque.html) | Deque       | Y       | _N_    | Y           | Y         | _N_                |
| [ArrayBlockingQueue](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ArrayBlockingQueue.html)       | Queue       | Y       | _N_    | Y           | Y         | _N_                |
| [LinkedBlockingDeque](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/LinkedBlockingDeque.html)     | Deque       | Y       | _N_    | Y           | Y         | _N_                |
| [PriorityBlockingQueue](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/PriorityBlockingQueue.html) | Queue       | Y       | _N_    | Y           | Y         | _N_                |


### ArrayList
```java
List<Integer> nums = new ArrayList<>();

// Adding
nums.add(2);
nums.add(5);
nums.add(8);

// Retrieving
System.out.println(nums.get(0));

// Indexed for loop iteration
for (int i = 0; i < nums.size(); i++) {
    System.out.println(nums.get(i));
}

nums.remove(nums.size() - 1);
nums.remove(0); // VERY slow

for (Integer value : nums) {
    System.out.println(value);
}
```

### HashMap
```java
Map<Integer, String> m = new HashMap<>();
m.put(5, "Five");
m.put(8, "Eight");
m.put(6, "Six");
m.put(4, "Four");
m.put(2, "Two");

// Retrieving
System.out.println(m.get(6));

// Lambda forEach
m.forEach((key, value) -> {
    String msg = key + ": " + value;
    System.out.println(msg);
});
```

### HashSet
```java
Set<String> set = new HashSet<>();
if (set.isEmpty()) {
    System.out.println("Empty!");
}

set.add("dog");
set.add("cat");
set.add("mouse");
set.add("snake");
set.add("bear");

if (set.contains("cat")) {
    System.out.println("Contains cat");
}

set.remove("cat");
for (String element : set) {
    System.out.println(element);
}
```

### ArrayDeque
```java
Deque<String> a = new ArrayDeque<>();

// Using add()
a.add("Dog");

// Using addFirst()
a.addFirst("Cat");

// Using addLast()
a.addLast("Horse");

// [Cat, Dog, Horse]
System.out.println(a);

// Access element
System.out.println(a.peek());

// Remove element
System.out.println(a.pop());
```


### Access Modifiers
| Modifier    | Class | Package | Subclass | World |
|-------------|-------|---------|----------|-------|
| public      | Y     | Y       | Y        | Y     |
| protected   | Y     | Y       | Y        | _N_   |
| no modifier | Y     | Y       | _N_      | _N_   |
| private     | Y     | _N_     | _N_      | _N_   |


### Regular expressions
```java
String text = "I am learning Java";
// Removing All Whitespace
text.replaceAll("\\s+", "");

// Splitting a String
text.split("\\|");
text.split(Pattern.quote("|"));
```
See: [Regex in java](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html)



### Comment
```java
// I am a single line comment!
 
/*
And I am a 
multi-line comment!
*/

/**
 * This  
 * is  
 * documentation  
 * comment 
 */
```

### Keywords
- abstract
- continue
- for
- new
- switch
- assert
- default
- goto
- package
- synchronized
- boolean
- do
- if
- private
- this
- break
- double
- implements
- protected
- throw
- byte
- else
- import
- public
- throws
- case
- enum
- instanceof
- return
- transient
- catch
- extends
- int
- short
- try
- char
- final
- interface
- static
- void
- class
- finally
- long
- strictfp
- volatile
- const
- float
- native
- super
- while


### Math methods

| Method                | Description            |
|-----------------------|------------------------|
| `Math.max(a,b)`       | Maximum of a and b     |
| `Math.min(a,b)`       | Minimum of a and b     |
| `Integer.MAX_VALUE`   | 2^31-1 = 2147483647    |
| `Integer.MIN_VALUE`   | -2^31 = -2147483648    |
| `Math.abs(-4)`        | Absolute value 4       |
| `Math.ceil(4.84)`     | Ceiling of 4.84 is 5.0 |
| `Math.floor(4.84)`    | Floor of 4.84 is 4.0   |
| `Math.sqrt(a)`        | Square-root of a       |
| `Math.pow(a,b)`       | Power of b             |
| `Math.round(a)`       | Closest integer        |
| `Math.sin(ang)`       | Sine of ang            |
| `Math.cos(ang)`       | Cosine of ang          |
| `Math.tan(ang)`       | Tangent of ang         |
| `Math.asin(ang)`      | Inverse sine of ang    |
| `Math.log(a)`         | Natural logarithm of a |
| `Math.toDegrees(rad)` | Angle rad in degrees   |
| `Math.toRadians(deg)` | Angle deg in radians   |

### Try/Catch/Finally
```java
try {
  // something
} catch (Exception e) {
  e.printStackTrace();
} finally {
  System.out.println("always printed");
}
```
Misc
----
### Fastest way to get the number of digits
```java

int number = 123456;
        int length = (int) Math.log10(number) + 1;
        System.out.println(length);

// Outputs: 6
```
