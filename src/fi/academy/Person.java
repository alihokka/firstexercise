package fi.academy;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(){

    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String nimi){
        this.name = nimi;
    }

    public void setAge(int ika){
        this.age = ika;
    }

    public String toString(){
        return "nimi on " + this.name + "ikä on " + this.age;
    }
}
