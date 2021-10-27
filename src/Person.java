public class Person {
    private String name;

    // constructor
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        //TODO: return the person's name
        return this.name;
    }

    public void setName(String name) {
        //TODO: change the name property to the passed value
        this.name = name;
    }

    public void sayHello() {
        //TODO: print a message to the console using the person's name
        System.out.printf("Howdy, %s! How are you doing?%n", this.name);
    }

    public static void main(String[] args) {
//        Person shan = new Person("Shanshan");
//        System.out.println("shan.getName() = " + shan.getName());
//
//        shan.setName("Shan");
//        System.out.println("shan.getName() = " + shan.getName());
//
//        shan.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }
}
