package chapterSix;

public class Person {
    private String name;
    private int age;
    private Gender gender;

    public Person(String name,Gender gender,int age) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

     public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
     }

    }


