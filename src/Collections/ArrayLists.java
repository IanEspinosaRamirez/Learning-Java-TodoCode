package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
  public static void main(String[] args) {
    List<Person> personList = new ArrayList<>();
    personList.add(new Person(1, "John", 25));
    personList.add(new Person(2, "Jane", 30));
    personList.add(new Person(3, "Jack", 35));
    personList.add(new Person(4, "Jill", 40));
    personList.forEach(person -> {
      System.out.println(person.getPersonId());
      System.out.println(person.getPersonName());
      System.out.println(person.getAge());
    });
    }
}

