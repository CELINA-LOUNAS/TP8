package exo19;

import java.util.Comparator;

public class Employee {

private String firstName;
private String lastName;
private int age;

public String getFirstName() {
return firstName;
}


public void setFirstName(String firstName) {
this.firstName = firstName;
}


public String getLastName() {
return lastName;
}


public void setLastName(String lastName) {
this.lastName = lastName;
}


public int getAge() {
return age;
}

public void setAge(int age) {
this.age = age;
}

@Override
public String toString() {
return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
}

public static Comparator<Person> ComparatorLastName = new Comparator<Person>() {
     
       @Override
       public int compare(Person p1, Person p2) {
           return p1.getLastName().compareTo(p2.getLastName());
       }
   };
}