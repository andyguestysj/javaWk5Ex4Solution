## Inherit The Earth

1. Create a class called `Person` which has variables to hold a person’s first name, surname and
age.
2. Add a **constructor** to `Person`.
3. Add a **method** `description` on `Person` which returns a string along the lines of "Hello, my
name is Paul Chuckle and I am 71." (It should **return** the string, **not** print it out)
4. Create a **class** called `Celebrity` which inherits from `Person` and has a **variable** which indicates
whether or not they have been on "I’m a Celebrity, Get Me Out Of Here".
5. Add another variable to Celebrity which holds their catchphrase.
6. Add a **constructor** to `Celebrity` which takes first name, surname, age, a boolean (true or
false) saying whether they have been on "I’m a celebrity. . . "’ or not and their catchphrase,
i.e.:
```java
public Celebrity (String firstName , String surname , int age , boolean iac , String catchphrase ){

}
```
7. Re-define `description` in `Celebrity` to add information about whether they’ve been on "I’m
a Celebrity. . . " and to mention their catchphrase. Use `super` to call the description method
in `Person`.
8. Test your code by running the programme. It should output something like
```console
Hello, my name is Paul Chuckle and I am 71. To me, to you.
Hello, my name is Craig Charles and I am 53. I was once on "I’m a Celebrity, Get Me Out Of Here". Rimmer you smeghead.
Hello, my name is Harriet Harman and I am 67.
```
