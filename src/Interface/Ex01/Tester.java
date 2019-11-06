package Interface.Ex01;

import java.util.Scanner;

/**
 * Tester
 */
public class Tester {

    public static void main(String[] args) {
        String name;
        String type;
        String howToUse;
        int age;

        Scanner tk = new Scanner(System.in);

        System.out.print("Person (name and age) : ");
        name = tk.next();
        age = tk.nextInt();

        Person person = new Person();
        person.setName(name);

        System.out.println("Name of Person : " + person.getName());
        
        System.out.print("Things (name and how to use) : ");
        name = tk.next();
        howToUse = tk.next();
        
        Things things = new Things();
        things.setName(name);
        
        System.out.println("Name of Things : " + things.getName());
        
        System.out.print("Animal (name and type) : ");
        name = tk.next();
        type = tk.next();
        
        Animal animal = new Animal();
        animal.setName(name);
        
        System.out.println(type+howToUse+age);
        System.out.println("Name of Animal : " + animal.getName());
        
        tk.close();

    }
}