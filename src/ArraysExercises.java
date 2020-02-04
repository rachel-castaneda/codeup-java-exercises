import java.util.Arrays;

public class ArraysExercises {

    public static void main (String [] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers); // prints the address of the code rather than an array
//        System.out.println(Arrays.toString(numbers)); // prints the array

// create and array that holds 3 person objects. assign a new instance of the person class to each element. iterate through the array adn print out the name of each person in the array.

        Person [] personArray = new Person[3];
        Person aPerson = new Person();
        aPerson.setFirstName("first");
        aPerson.setLastName("person");
        personArray[0] = aPerson;

        aPerson = new Person();
        aPerson.setFirstName("second");
        aPerson.setLastName("person");
        personArray[1] = aPerson;

        aPerson = new Person();
        aPerson.setFirstName("third");
        aPerson.setLastName("person");
        personArray[2] = aPerson;

        System.out.println();
        System.out.println("names form the person array: ");
        for (Person person : personArray) {
            System.out.printf("\t%s %s\n", person.getFirstName(), person.getLastName());
        }
        System.out.println();

        //add an element
//        aPerson = new Person();
//        aPerson.setFirstName("fourth");
//        aPerson.setLastName("person");
//        personArray = addPerson(personArray, aPerson);
//        System.out.println("\nthe copies array data:\n" + Arrays.toString(personArray));

        //method to copy array and add a new person
//        @param inputArray     array to be copied
//        @param aPerson        element to be added
//        @return               a copy of the array with the element added to the end

//        public static Person [] addPerson(Person[] inputArray, Person aPerson) {
//            int length = 0;
//            Person [] newPersonList = null;
//            if (inputArray == null) length =0;
//            else length = inputArray.length;
//        }



    } // public main close

}  //  public ArraysExercise class close
