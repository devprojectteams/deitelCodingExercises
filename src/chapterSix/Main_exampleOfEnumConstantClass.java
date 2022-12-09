package chapterSix;

public class Main_exampleOfEnumConstantClass {
    public static void main(String[] args) {
        Person person = new Person("John Doe",Gender.MALE, 18 );
        Person person1 = new Person( "Johnny Doe", Gender.MALE,19);
        Person person2 = new Person("Jane Doe",Gender.FEMALE,19);
        Person person3 = new Person("Janet Doe",Gender.NON_BINARY,20);


        int numberOfMales = countMales(person,person1,person2,person3);
        System.out.println(numberOfMales);
    }

    private static int countMales(Person...people){
        int counter =0;
        for(int i = 0; i < people.length;i++){
            if (people[i].getGender()==Gender.MALE)counter++;
        }
       return counter;
    }
}
