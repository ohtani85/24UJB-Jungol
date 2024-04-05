package q617;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] people = new Person[5];

        for (int i = 0; i < 5; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            people[i] = new Person(name, height);
        }
        sc.close();

        Person shortest = people[0];
        for (int i = 1; i < people.length; i++) {
            if (people[i].height < shortest.height) {
                shortest = people[i];
            }
        }

        System.out.println(shortest.name + " " + shortest.height);
    }
}

class Person {
    String name;
    int height;

    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }
}