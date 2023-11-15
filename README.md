# att-class
AttClass a = new AttClass();

validCheck - Checks if a String/char input is valid.
validCheck(String, String[]) -> boolean

Ex:
char[] inputs = {'a', 'b', 'c', 'd'};
System.out.println(a.validCheck('a', inputs));  -> returns true
System.out.println(a.validCheck('j', inputs));  -> returns false

String[] inputs = {"red", "blue", "green", "yellow"};
System.out.println(a.validCheck("blue", inputs));  -> returns true
System.out.println(a.validCheck("purple", inputs));  -> returns false

array input can be declared in the parameter

System.out.println(a.validCheck('a', new char[] {'a', 'c', 'd', 'f'}))

Currently only works for String and char data types.
