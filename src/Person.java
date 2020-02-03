public class Person {
    private  String name;

    public Person(String name) {
        this.name = name;
    }

    // returns the person's name
    public String getName(){
        return getName();
    }
    // changes the name property to the passed value
    public void setName(String name){
        this.name = name;
    }
    // prints a message to the console using the person's name
    public void sayHello(){
        System.out.printf("hello, my name is %s", this.name);
    }
    public static void main (String [] args) {
        Person a = new Person("elmo");

        a.sayHello();
    }

}

