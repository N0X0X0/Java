public class Student {

    String name;
    int age;

    int usn;
    boolean isEligible;

    public Student(String name, int age, int usn) {
        this.name = name;
        this.age = age;
        this.usn = usn;
    }

    public Student(String name, int age, int usn, boolean isEligible) {
        this(name,age,usn);
        this.isEligible = isEligible;
    }



    public void display(){
        System.out.println(name + age+ isEligible);
    }

}
